package com.techelevator.dao;

import com.techelevator.model.Park;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

public class JdbcParkDaoTests extends BaseDaoTests {

    private static final Park PARK_1 =
            new Park(1, "Park 1", LocalDate.parse("1800-01-02"), 100, true);
    private static final Park PARK_2 =
            new Park(2, "Park 2", LocalDate.parse("1900-12-31"), 200, false);
    private static final Park PARK_3 =
            new Park(3, "Park 3", LocalDate.parse("2000-06-15"), 300, false);

    private JdbcParkDao sut;

    private Park testPark;

    @Before
    public void setup() {
        sut = new JdbcParkDao(dataSource);
        testPark = new Park(4, "Margaret Park", LocalDate.now(), 111, true);
    }

    @Test
        // we want to test the getPark method
    public void getPark_returns_correct_park_for_id() {
        Park actual = sut.getPark(1);  // call the dao method getPark for the id of 1
        assertParksMatch(PARK_1, actual);

        actual = sut.getPark(3);  // call the dao method getPark with the id 3
        assertParksMatch(PARK_3, actual);
    }

    @Test
    public void getPark_returns_null_when_id_not_found() {
        Park actual = sut.getPark(155);
        Assert.assertNull(actual);  // park should not be found

        actual = sut.getPark(42);
        Assert.assertNull(actual);
    }

    @Test
    public void getParksByState_returns_all_parks_for_state() {
        //arrange and act
        List<Park> parkList = sut.getParksByState("AA");
        // parksList if the method is working correctly
        // should return 2 parks park_id of 1 and park_id of 3
        Assert.assertEquals(2, parkList.size());  // check to make sure
        // correct number of parks were returned
        assertParksMatch(PARK_1, parkList.get(0));
        assertParksMatch(PARK_3, parkList.get(1));

        parkList = sut.getParksByState("CC");
        Assert.assertEquals(1, parkList.size());

        assertParksMatch(PARK_3, parkList.get(0));
    }

    @Test
    public void getParksByState_returns_empty_list_for_abbreviation_not_in_db() {
        List<Park> parkList = sut.getParksByState("MI");
        Assert.assertEquals(0, parkList.size());

        parkList = sut.getParksByState("CA");
        Assert.assertEquals(0, parkList.size());
    }

    @Test
    public void createPark_returns_park_with_id_and_expected_values() {

        // we know we need to call sut.createPark(parkObj)
        Park createdPark = sut.createPark(testPark);  // the dao createPark method returns a Park object

        Assert.assertTrue(createdPark.getParkId() > 0);  // make sure we got back a
        // new park_id
        long testParkId = createdPark.getParkId();  // we have to get from the db the parkID
        testPark.setParkId(testParkId);
        assertParksMatch(testPark, createdPark);

    }

    @Test
    public void createPark_returns_park_with_id_and_expected_values1() {

        // we know we need to call sut.createPark(parkObj)
        Park createdPark = sut.createPark(testPark);  // the dao createPark method returns a Park object

        long testParkId = createdPark.getParkId();  // we have to get from the db the parkID
        testPark.setParkId(testParkId);
        assertParksMatch(testPark, createdPark);

    }


    @Test
    public void created_park_has_expected_values_when_retrieved() {
        Park createdPark = sut.createPark(testPark);  // the dao createPark method returns a Park object

        long testParkId = createdPark.getParkId();  // we have to get from the db the parkID
        testPark.setParkId(testParkId);
        assertParksMatch(testPark, createdPark);
    }

    @Test
    public void updated_park_has_expected_values_when_retrieved() {
        Park parkToUpdate = sut.getPark(2);  // get from the db and create a java park obj

        // make change to the park and then call the dao method!
        parkToUpdate.setParkName("Updated Park");  //making changes to the java park obj
        parkToUpdate.setHasCamping(true);
        parkToUpdate.setDateEstablished(LocalDate.now());
        parkToUpdate.setArea(222);

        sut.updatePark(parkToUpdate); // calls the method to update the db with java obj (changed)
        Park retrievedPark = sut.getPark(2);  // after it has been modified in db
        assertParksMatch(parkToUpdate, retrievedPark); // compare the retrieved after modified from db
    }

    @Test
    public void deleted_park_cant_be_retrieved() {
        sut.deletePark(1);

        Park retrievedPark = sut.getPark(1);
        Assert.assertNull(retrievedPark);


        List<Park> parkList = sut.getParksByState("AA");  // this should only return 1 park

        Assert.assertEquals(1, parkList.size());  // should be only park3

        assertParksMatch(PARK_3, parkList.get(0));

    }

    @Test
    public void park_added_to_state_is_in_list_of_parks_by_state() {
        // look at the mocked data to see what I can insert or add
        // Park 2 is in state BB, let's add it to state CC as well
        sut.addParkToState(2, "CC");
        // how do I test that it was inserted into the park_state table?
        List<Park>  parkList = sut.getParksByState("CC");

        Assert.assertEquals(2, parkList.size());

        assertParksMatch(PARK_2, parkList.get(0));

    }

    @Test
    public void park_removed_from_state_is_not_in_list_of_parks_by_state() {
        sut.removeParkFromState(3, "AA");
        List<Park> parkList = sut.getParksByState("AA");
        Assert.assertEquals(1, parkList.size());
        assertParksMatch(PARK_1, parkList.get(0));
    }

    private void assertParksMatch(Park expected, Park actual) {
        Assert.assertEquals(expected.getParkId(), actual.getParkId());
        Assert.assertEquals(expected.getParkName(), actual.getParkName());
        Assert.assertEquals(expected.getDateEstablished(), actual.getDateEstablished());
        Assert.assertEquals(expected.getArea(), actual.getArea(), 0.1);
        Assert.assertEquals(expected.getHasCamping(), actual.getHasCamping());
    }

}
