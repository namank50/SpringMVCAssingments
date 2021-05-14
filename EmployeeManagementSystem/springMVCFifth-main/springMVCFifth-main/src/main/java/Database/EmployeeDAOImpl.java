package Database;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import EmployeeDetails.Employee;
import rowMapper.EmployeeRowMapper;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	private JdbcTemplate jdbc = new JdbcTemplate(getDataSource());

	/*
	 * public boolean findUser(String username, String password) {
	 * 
	 * String sql = "Select * FROM user"; List<user> n = (List<user>)
	 * jdbc.query(sql, new UserRowMapper()); System.out.println(username + " " +
	 * password); for (user r : n) { System.out.println(r.toString()); if
	 * (r.getUsername().matches(username) && r.getPassword().matches(password))
	 * return true; } return false;
	 * 
	 * }
	 */

	public List<Employee> getEmployees() {

		List<Employee> emp = new ArrayList<>();
		String sql = "SELECT * FROM employeedetails";
		List<Employee> theListOfEmployee = jdbc.query(sql, new EmployeeRowMapper());
		// TODO Auto-generated method stub
		return theListOfEmployee;
	}

	public DataSource getDataSource() {
		String url = "jdbc:mysql://localhost:3306/employee";
		String username = "root";
		String password = "nkss2010";
		DataSource dataSource = new DriverManagerDataSource(url, username, password);
		return dataSource;
	}

	@Override
	public void insert(Employee e) {
		// TODO Auto-generated method stub
		Object[] arg = { e.getEname(), e.getEdept(), e.getEdesignation(), e.getEsalary() };
		String sql = "INSERT INTO employeedetails(ename,edept,edesignation,esalary) values (?,?,?,?)";
		jdbc.update(sql, arg);

		System.out.println("1");

	}

	@Override
	public Employee getEmployee(int eid) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM employeedetails WHERE eid=?";
		Employee emp = jdbc.queryForObject(sql, new EmployeeRowMapper(), eid);
		return emp;
	}

	@Override
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		String sql = "UPDATE employeedetails SET ename=?,edept=?,edesignation=?,esalary=? WHERE eid=?";
		jdbc.update(sql, employee.getEname(), employee.getEdesignation(), employee.getEdept(), employee.getEsalary(),
				employee.getEid());
		System.out.println("1 updated");
	}

	@Override
	public void delete(int eid) {

		String sql = "DELETE FROM employeedetails WHERE eid=?";
		jdbc.update(sql, eid);

	}

}
