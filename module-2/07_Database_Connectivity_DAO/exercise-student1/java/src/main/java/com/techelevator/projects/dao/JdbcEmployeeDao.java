package com.techelevator.projects.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.Project;
import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.projects.model.Employee;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JdbcEmployeeDao implements EmployeeDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcEmployeeDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	/**
	 * Gets all employees from the datastore and returns them in a List
	 *
	 * @return all the employees as Employee objects in a List
	 */

	@Override
	public List<Employee> getAllEmployees() {

		List<Employee> employees = new ArrayList<>();
		String sql = "SELECT employee_id, department_id, first_name, last_name, birth_date, hire_date FROM employee;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while (results.next()) {
			employees.add(mapRowToEmployee(results));
		}
		return employees;
	}


	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
		return List.of(new Employee());
	}

	@Override
	public List<Employee> getEmployeesByProjectId(Long projectId) {
		return new ArrayList<>();
	}

	@Override
	public void addEmployeeToProject(Long projectId, Long employeeId) {
	}

	@Override
	public void removeEmployeeFromProject(Long projectId, Long employeeId) {
	}

	@Override
	public List<Employee> getEmployeesWithoutProjects() {
		return new ArrayList<>();
	}


	private Employee mapRowToEmployee(SqlRowSet rowSet) {
		Employee employee = new Employee();

	employee.setId(rowSet.getLong("employeeId"));
	employee.setDepartmentId(rowSet.getLong("departmentId"));
	employee.setFirstName(rowSet.getString("firstName"));
      employee.setLastName(rowSet.getString("lastName"));
	employee.setBirthDate(rowSet.getDate("birthDate").toLocalDate());
	employee.setHireDate(rowSet);
	return employee;
	}

}

}
