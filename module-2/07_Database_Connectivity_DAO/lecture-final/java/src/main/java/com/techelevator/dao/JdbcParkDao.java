package com.techelevator.dao;

import com.techelevator.model.Park;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcParkDao implements ParkDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcParkDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Park getPark(long parkId) {
        String sqlStr = "SELECT park_id, park_name, date_established, area, " +
                "has_camping FROM park WHERE park_id = ?";
        Park park = null;
        SqlRowSet results = jdbcTemplate.queryForRowSet(sqlStr, parkId);
        while(results.next()) {  // moves the cursor to the next record in the results
            park = mapRowToPark(results); // call the helper method because we will need
            // to map this park row from the db in many methods!
        }
        return park;
    }

    @Override
    public List<Park> getParksByState(String stateAbbreviation) {

        List<Park> parkList = new ArrayList<>();
        String sqlStr = "SELECT p.park_id, p.park_name, p.date_established, " +
                "p.area, p.has_camping FROM park p " +
                "JOIN park_state ps ON p.park_id = ps.park_id " +
                "WHERE ps.state_abbreviation = ?";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sqlStr, stateAbbreviation);

        while(results.next()){
            Park park = mapRowToPark(results);
            parkList.add(park);
        }
        return parkList;
    }

    @Override
    public Park createPark(Park park) {
        return new Park();
    }

    @Override
    public void updatePark(Park park) {  // update a park
        String sqlStr = "UPDATE park SET park_name = ?, date_established = ?" +
                ", area = ?, has_camping=? WHERE park_id = ?";

        jdbcTemplate.update(sqlStr, park.getParkName(), park.getDateEstablished(),
                park.getArea(), park.getHasCamping(), park.getParkId());

    }

    @Override
    public void deletePark(long parkId) {

    }

    @Override
    public void addParkToState(long parkId, String stateAbbreviation) {

    }

    @Override
    public void removeParkFromState(long parkId, String stateAbbreviation) {

    }


    // helper method to map the db row to a java object
    //park_id, park_name, date_established, area, " +
    //                "has_camping
    private Park mapRowToPark(SqlRowSet rowSet) {
        Park park = new Park();
        park.setParkId(rowSet.getLong("park_id"));
        park.setParkName(rowSet.getString("park_name"));
        // dateEstablished is a LocalDate object, so we need to convert the getDate to a LD object
        park.setDateEstablished(rowSet.getDate("date_established").toLocalDate());
        park.setArea(rowSet.getDouble("area"));
        park.setHasCamping(rowSet.getBoolean("has_camping"));
        return park;
    }
}
