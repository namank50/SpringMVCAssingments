package rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import EmployeeDetails.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

		Employee emp = new Employee();
		emp.setEid(rs.getInt("eid"));
		emp.setEname(rs.getString("ename"));
		emp.setEdept(rs.getString("edept"));
		emp.setEdesignation(rs.getString("edesignation"));
		emp.setEsalary(rs.getLong("esalary"));

		return emp;
	}

}
