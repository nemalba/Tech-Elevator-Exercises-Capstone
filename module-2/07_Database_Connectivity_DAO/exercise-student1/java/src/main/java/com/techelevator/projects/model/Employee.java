package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.techelevator.projects.model.Project;
import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.projects.model.Employee;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JdbcEmployeeDao implements EmployeeDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcEmployeeDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<>();
		String sqlStr = "SELECT employee_id, department_id, first_name, last_name, birth_date, hire_date FROM employee;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlStr);
		while(results.next()){
			employees.add(mapRowToEmployee(results));
		}
		return employees;
	}

	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {

		List<Employee> employees = new ArrayList<>();
		String sqlStrFirst = "SELECT employee_id, department_id, first_name, last_name, birth_date, hire_date FROM employee WHERE first_name = ?;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlStrFirst, firstNameSearch);

		List<Employee> employees1 = new ArrayList<>();
		String sqlStrLast = "SELECT employee_id, department_id, first_name, last_name, birth_date, hire_date FROM employee WHERE last_name = ?;";
		SqlRowSet results1 = jdbcTemplate.queryForRowSet(sqlStrLast, lastNameSearch);

		while(results1.next()&&results.next()){
			employees.add(mapRowToEmployee(results));
			employees1.add(mapRowToEmployee(results1));
		}
		return employees;
	}

	@Override
	public List<Employee> getEmployeesByProjectId(Long projectId) {
		List<Employee> employees = new ArrayList<>();
		String sqlStr = "SELECT employee_id, department_id, first_name, last_name, birth_date, hire_date FROM employee WHERE employee_id = ?;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlStr, projectId);
		while(results.next()){
			employees.add(mapRowToEmployee(results));
		}
		return employees;
	}

	@Override
	public void addEmployeeToProject(Long projectId, Long employeeId) {

	}

	@Override
	public void removeEmployeeFromProject(Long projectId, Long employeeId) {
		String sqlStr1 = "DELETE FROM project_employee WHERE employee_id = ?";
		String sqlStr = "DELETE FROM project WHERE project_id = ?";
		jdbcTemplate.update(sqlStr1, projectId);
		jdbcTemplate.update(sqlStr, employeeId);
	}
   /* SELECT first_name FROM employee
    JOIN project_employee ON employee.employee_id = project_employee.employee_id,
    JOIN project ON project.project_id = project_employee.project_id,
    WHERE employee_id != employee_id;*/


	@Override
	public List<Employee> getEmployeesWithoutProjects() {
		List<Employee> employees = new ArrayList<>();
		String sqlStr = "SELECT employee_id FROM employee WHERE employee_id =(SELECT project_id FROM project_employee WHERE employee_id;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlStr);
		while(results.next()){
			employees.add(mapRowToEmployee(results));
		}
		return employees;
	}

	private Employee mapRowToEmployee(SqlRowSet rowSet) {
		Employee employee = new Employee();
		employee.setId(rowSet.getLong("employee_id"));
		//if(rowSet.getLong("department_id") != null){
		employee.setDepartmentId(rowSet.getLong("department_id"));
		//  }
		employee.setFirstName(rowSet.getString("first_name"));
		employee.setLastName(rowSet.getString("last_name"));
		employee.setBirthDate(rowSet.getDate("birth_date").toLocalDate());
		employee.setHireDate(rowSet.getDate("hire_date").toLocalDate());


		return employee;
	}
}