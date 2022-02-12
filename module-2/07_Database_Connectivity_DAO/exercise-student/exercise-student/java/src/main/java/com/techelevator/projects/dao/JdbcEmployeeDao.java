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

	/**
	 * Gets all employees from the datastore and returns them in a List
	 *
	 * @return all the employees as Employee objects in a List
	 */
	@Override
	public List<Employee> getAllEmployees() {

		List<Employee> employees = new ArrayList<>();
		String sql = "Select employee_id, department_id, first_name, last_name, birth_date, hire_date FROM employee;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while(results.next()){
        	employees.add(mapRowToEmployee(results));
		}

		return employees;
	}

	/**
	 * Find all employees whose names contain the search strings. Returned employees should
	 * match both first and last name search strings. If a search string is blank,
	 * ignore it. If both strings are blank, return all employees.
	 * Be sure to use ILIKE for case-insensitive search matching!
	 *
	 * @param firstNameSearch the string to search for in the first_name, ignore if blank
	 * @param lastNameSearch the string to search for in the last_name, ignore if blank
	 * @return all employees whose name matches as Employee objects in a List
	 */
	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {

		List<Employee> employees = new ArrayList<>();
		String sql = "Select employee_id, department_id, first_name, last_name, birth_date, hire_date FROM employee WHERE " +
				"first_name ILIKE ? AND  last_name ILIKE ? ;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql,   "%" + firstNameSearch + "%", "%"+lastNameSearch+"%");
		// "%" + firstNameSearch + "%", "%"+lastNameSearch+"%"
		while(results.next()){
			employees.add(mapRowToEmployee(results));
		}

		return employees;
		//return List.of(new Employee());

	}




	/**
	 * Get all of the employees that are on the project with the given id.
	 *
	 * @param projectId the project id to get the employees from
	 * @return all the employees assigned to that project as Employee objects in a List
	 */
	@Override
	public List<Employee> getEmployeesByProjectId(Long projectId) {

		List<Employee> employees = new ArrayList<>();
		String sql = "SELECT employee.employee_id, department_id, first_name, last_name, birth_date, hire_date FROM employee JOIN project_employee ON project_employee.employee_id =  employee.employee_id WHERE project_id = ?;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql,projectId );

		while(results.next()){
			employees.add(mapRowToEmployee(results));
		}

		return employees;
		//return new ArrayList<>();
	}


	@Override
	public void addEmployeeToProject(Long projectId, Long employeeId) {

		String sqlStr = "INSERT INTO project_employee (project_id, employee_id) VALUES (?, ?)";
		jdbcTemplate.update(sqlStr,projectId, employeeId);
	}

	@Override
	public void removeEmployeeFromProject(Long projectId, Long employeeId) {

		String sqlStr1 = "DELETE FROM project_employee WHERE project_id= ? AND employee_id = ?";
		jdbcTemplate.update(sqlStr1, projectId, employeeId);
	}

	/**
	 * Get all of the employees that aren't assigned to any project.
	 *
	 * @return all the employees not on a project as Employee objects in a List
	 */
	@Override
	public List<Employee> getEmployeesWithoutProjects() {

		List<Employee> employees = new ArrayList<>();
		String sql = "SELECT * FROM employee LEFT JOIN project_employee ON employee.employee_id = project_employee.employee_id WHERE project_id IS NULL";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while(results.next()){
			employees.add(mapRowToEmployee(results));
		}

		return employees;
		//return new ArrayList<>();
	}

	private Employee mapRowToEmployee(SqlRowSet rowSet) {
		Employee employee = new Employee();
		employee.setId(rowSet.getLong("employee_id")); //setId(Long employeeId)
		employee.setDepartmentId(rowSet.getLong("department_id")); //setDepartmentId(Long departmentId)
		employee.setFirstName(rowSet.getString("first_name"));//setFirstName(String firstName)
		employee.setLastName(rowSet.getString("last_name"));//setLastName(String lastName)
		employee.setBirthDate(rowSet.getDate("birth_date").toLocalDate());//setBirthDate(LocalDate birthDate)
		employee.setHireDate(rowSet.getDate("hire_date").toLocalDate());//setHireDate(LocalDate hireDate)

		return employee;
	}

}
