package com.techelevator.projects.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.techelevator.projects.model.Department;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Project;

public class JdbcProjectDao implements ProjectDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcProjectDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	/**
	 * Get a project from the datastore that has the given id.
	 * If the id is not found, return null.
	 *
	 * @param projectId the id of the project to get from the datastore
	 * @return a filled out project object
	 */
	@Override
	public Project getProject(Long projectId) {

		Project project = null;
		String sql = "SELECT project_id, name, from_date, to_date FROM project WHERE project_id = ?;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, projectId);
		while (results.next()) {
			project = mapRowToProject(results);
		}
		return project;

	}

	/**
	 * Get a list of all projects.
	 *
	 * @return all projects as Project objects in a List
	 */
	@Override
	public List<Project> getAllProjects() {

		List<Project> project = new ArrayList<>();
		String sql = "SELECT project_id, name, from_date, to_date FROM project;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while (results.next()) {
			project.add(mapRowToProject(results));
		}
		return project;
		}

	@Override
	public Project createProject(Project newProject) {
		String sqlStr = "INSERT INTO project (name, from_date, to_date) VALUES (?, ?, ?) RETURNING project_id;";

		Long newId = jdbcTemplate.queryForObject(sqlStr, Long.class, newProject.getName(), newProject.getFromDate(), newProject.getToDate());

		return getProject(newId);
	}

	/**
	 * Removes a project from the datastore, which requires deleting
	 * records from multiple tables.
	 *
	 * @param projectId the id of the project to remove
	 */
	@Override
	public void deleteProject(Long projectId) {

		String sql = "DELETE FROM project WHERE project_id= ?";
		String sql2 = "DELETE FROM project_employee WHERE project_id= ?";

		jdbcTemplate.update(sql2, projectId);
		jdbcTemplate.update(sql, projectId);

	}

	private Project mapRowToProject(SqlRowSet rowSet) {
		Project project = new Project();
		project.setId(rowSet.getLong("project_id"));
		project.setName(rowSet.getString("name"));
		if (rowSet.getDate("from_date") != null) {
			project.setFromDate(rowSet.getDate("from_date").toLocalDate());
		}
		if (rowSet.getDate("to_date") != null) {
			project.setToDate(rowSet.getDate("to_date").toLocalDate());
		}
		return project;
	}





}

