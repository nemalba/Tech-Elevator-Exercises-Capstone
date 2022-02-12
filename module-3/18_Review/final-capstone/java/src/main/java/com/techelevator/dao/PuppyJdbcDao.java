package com.techelevator.dao;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import com.techelevator.exceptions.PuppyNotFoundException;
import com.techelevator.model.Puppy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

/**
 * PuppyJdbcDao
 */
@Component
public class PuppyJdbcDao implements PuppyDao {

	private JdbcTemplate template;

	public PuppyJdbcDao(DataSource datasource) {
		template = new JdbcTemplate(datasource);
	}

	@Override
	public List<Puppy> getPuppies() {
		String sqlGetPuppies = "SELECT id, name, weight,  sex, paper_trained, image FROM puppies ";
//		return null;
	}

	@Override
	public Puppy getPuppy(int id) {
		String sqlGetPuppy = "";
		SqlRowSet result = template.queryForRowSet(sqlGetPuppy, id);
		if (result.next()) {
			return mapResultToPuppy(result);
		} else {
			throw new PuppyNotFoundException();
		}
	}





	private Puppy mapResultToPuppy(SqlRowSet result) {
		Puppy retrievedPuppy = null;



		return retrievedPuppy;
	}


	@Override
	public void savePuppy(Puppy puppyToSave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePuppy(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editPuppy(Puppy puppyToSave) {
		// TODO Auto-generated method stub
		
	}


}