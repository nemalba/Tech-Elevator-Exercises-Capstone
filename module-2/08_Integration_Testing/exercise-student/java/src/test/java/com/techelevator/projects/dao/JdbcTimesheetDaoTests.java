package com.techelevator.projects.dao;

import com.techelevator.projects.model.Timesheet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Time;
import java.time.LocalDate;
import java.util.List;

public class JdbcTimesheetDaoTests extends BaseDaoTests {

    private static final Timesheet TIMESHEET_1 = new Timesheet(1L, 1L, 1L,
            LocalDate.parse("2021-01-01"), 1.0, true, "Timesheet 1");
    private static final Timesheet TIMESHEET_2 = new Timesheet(2L, 1L, 1L,
            LocalDate.parse("2021-01-02"), 1.5, true, "Timesheet 2");
    private static final Timesheet TIMESHEET_3 = new Timesheet(3L, 2L, 1L,
            LocalDate.parse("2021-01-01"), 0.25, true, "Timesheet 3");
    private static final Timesheet TIMESHEET_4 = new Timesheet(4L, 2L, 2L,
            LocalDate.parse("2021-02-01"), 2.0, false, "Timesheet 4");

    private JdbcTimesheetDao sut;
    private Timesheet testTimesheet;

    @Before
    public void setup() {
        sut = new JdbcTimesheetDao(dataSource);
        testTimesheet = new Timesheet(5L, 2L, 2L,
                LocalDate.parse("2021-01-01"), 1.0, true, "Timesheet 5");
    }

    @Test
    public void getTimesheet_returns_correct_timesheet_for_id() {
        Timesheet actual = sut.getTimesheet(1L);
        assertTimesheetsMatch(TIMESHEET_1, actual);

        actual = sut.getTimesheet(2L);
        assertTimesheetsMatch(TIMESHEET_2, actual);

    }


    @Test
    public void getTimesheet_returns_null_when_id_not_found() {
        Timesheet actual = sut.getTimesheet(5L);
        Assert.assertNull(actual);

        actual = sut.getTimesheet(6L);
        Assert.assertNull(actual);
    }



    @Test
    public void getTimesheetsByEmployeeId_returns_list_of_all_timesheets_for_employee() {
        List<Timesheet> timesheetList = sut.getTimesheetsByEmployeeId(1L);
        assertTimesheetsMatch(TIMESHEET_1,timesheetList.get(0));
        assertTimesheetsMatch(TIMESHEET_2,timesheetList.get(1));

        Assert.assertEquals(2, timesheetList.size());

    }


    @Test
    public void getTimesheetsByProjectId_returns_list_of_all_timesheets_for_project() {

        List<Timesheet> timesheetList = sut.getTimesheetsByProjectId(1L);

        assertTimesheetsMatch(TIMESHEET_1,timesheetList.get(0));


        Assert.assertEquals(3, timesheetList.size());

    }




    @Test
    public void createTimesheet_returns_timesheet_with_id_and_expected_values() {
        Timesheet createdTimesheet = sut.createTimesheet(testTimesheet);
        long testTimesheetId= createdTimesheet.getTimesheetId();
        testTimesheet.setTimesheetId(testTimesheetId);
        assertTimesheetsMatch(testTimesheet, createdTimesheet);

        Assert.assertTrue(createdTimesheet.getTimesheetId()>0);
    }



    @Test
    public void created_timesheet_has_expected_values_when_retrieved() {
        Timesheet createdTimesheet = sut.createTimesheet(testTimesheet);
        long testTimesheetId= createdTimesheet.getTimesheetId();
        testTimesheet.setTimesheetId(testTimesheetId);


        Assert.assertTrue(createdTimesheet.getTimesheetId()>0);
        assertTimesheetsMatch(testTimesheet, createdTimesheet);
    }

    @Test
    public void updated_timesheet_has_expected_values_when_retrieved() {
        Timesheet timesheetToUpdate = sut.getTimesheet(1L);
        timesheetToUpdate.setEmployeeId(2L);
        timesheetToUpdate.setProjectId(1L);
        timesheetToUpdate.setDateWorked(LocalDate.parse("2021-12-01"));
        timesheetToUpdate.setHoursWorked(3.0);
        timesheetToUpdate.setBillable(false);
        timesheetToUpdate.setDescription("Timesheet 1");
        sut.updateTimesheet(timesheetToUpdate);
        Timesheet retrievedTimesheet = sut.getTimesheet((1L));
        assertTimesheetsMatch(timesheetToUpdate,retrievedTimesheet);
    }



    @Test
    public void deleted_timesheet_cant_be_retrieved() {
        sut.deleteTimesheet(4L);
        Timesheet retrievedTimesheet = sut.getTimesheet(4L);
        Assert.assertNull(retrievedTimesheet);

        List<Timesheet> timesheetList = sut.getTimesheetsByProjectId(2L);
        Assert.assertEquals(0,timesheetList.size());
    }



    @Test
    public void getBillableHours_returns_correct_total() {
        // List<Timesheet> timesheetList = sut.getTimesheetsByProjectId(2L);
        double actual = sut.getBillableHours(1L, 1L);
        Assert.assertEquals(2.5, actual,0);

     double actual1 = sut.getBillableHours(2L, 2L);
      Assert.assertEquals(0.0, actual1,0);

    }



    private void assertTimesheetsMatch(Timesheet expected, Timesheet actual) {
        Assert.assertEquals(expected.getTimesheetId(), actual.getTimesheetId());
        Assert.assertEquals(expected.getEmployeeId(), actual.getEmployeeId());
        Assert.assertEquals(expected.getProjectId(), actual.getProjectId());
        Assert.assertEquals(expected.getDateWorked(), actual.getDateWorked());
        Assert.assertEquals(expected.getHoursWorked(), actual.getHoursWorked(), 0.001);
        Assert.assertEquals(expected.isBillable(), actual.isBillable());
        Assert.assertEquals(expected.getDescription(), actual.getDescription());
    }

}