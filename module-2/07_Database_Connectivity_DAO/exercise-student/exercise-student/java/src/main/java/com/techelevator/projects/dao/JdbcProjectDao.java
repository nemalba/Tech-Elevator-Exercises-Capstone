package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Project;

public class JdbcProjectDao implements ProjectDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcProjectDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Project getProject(Long projectId) {
		Project project = null;
		String sql = "SELECT project_id, name, from_date, to_date FROM project WHERE project_id = ?;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, projectId);
		while (results.next()) {
			project = mapRowToProject(results);
		}
		return project;

		//return new Project(0L, "Not Implemented Yet", null, null);
	}

	@Override
	public List<Project> getAllProjects() {

		List<Project> project = new ArrayList<>();
		String sql = "SELECT project_id, name, from_date, to_date FROM project;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while (results.next()) {
			project.add(mapRowToProject(results));
		}
		return project;
		//return new ArrayList<>();
	}

	@Override
	public Project createProject(Project newProject) {
		String sqlStr = "INSERT INTO project (name, from_date, to_date) VALUES (?, ?, ?) RETURNING project_id;";

		Long newId = jdbcTemplate.queryForObject(sqlStr, Long.class, newProject.getName(), newProject.getFromDate(), newProject.getToDate());

		return getProject(newId);
		//return null;
	}

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
