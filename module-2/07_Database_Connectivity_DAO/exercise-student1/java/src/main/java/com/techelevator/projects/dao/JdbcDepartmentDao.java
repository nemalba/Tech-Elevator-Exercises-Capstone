package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Department;

public class JdbcDepartmentDao implements DepartmentDao {
	
	private final JdbcTemplate jdbcTemplate;////this is a springframework imported JdbcTemplate class

	//DataSource as a parameter of the constructor was also imported
	public JdbcDepartmentDao(DataSource dataSource) {

		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	/*
	* */
	/**
	 * Get a department from the datastore that belongs to the given id.
	 * If the id is not found, return null.
	 *
	 * @param departmentId the department id to get from the datastore
	 * @return a filled out department object
	 */
	@Override


	public Department getDepartment(Long id) {
          Department department = null;
          String sql = "Select department_id, name FROM department WHERE department_id = ?;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, id);
		while (results.next()) {
			department = mapRowToDepartment(results);
		}
		return department;
	}

	/**
	 * Get all departments from the datastore.
	 *
	 * @return all departments as Department objects in a List
	 */
	@Override
	public List<Department> getAllDepartments() {

		List<Department> departments = new ArrayList<>();
		String sql = "SELECT department_id, name FROM department ;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while (results.next()) {
			departments.add(mapRowToDepartment(results));
		}
		return departments;


	}

	/**
	 * Update a department to the datastore. Only called on departments that
	 * are already in the datastore.
	 *
	 * @param updatedDepartment the department object to update
	 */

	@Override
	public void updateDepartment(Department updatedDepartment) {

     String sql = "UPDATE department " +
			      "SET name = ? " +
			   "WHERE department_id = ?;";

		jdbcTemplate.update(sql, updatedDepartment.getName(), updatedDepartment.getId());
	}


	private Department mapRowToDepartment(SqlRowSet rowSet) {
		Department department = new Department();
		department.setId(rowSet.getLong("department_id"));
		department.setName(rowSet.getString("name"));

		return department;
	}
}
