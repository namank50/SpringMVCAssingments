package Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import EmployeeDetails.Entity.Employee;
import rowMapper.EmployeeRowMapper;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	private JdbcTemplate jdbc = new JdbcTemplate(getDataSource());

	public DataSource getDataSource() {
		String url = "jdbc:mysql://localhost:3306/employee";
		String username = "root";
		String password = "nkss2010";
		DataSource dataSource = new DriverManagerDataSource(url, username, password);
		return dataSource;
	}


	public List<Employee> getEmployeesByPage(int pageid,int total){    
	    String sql="select * from employeedetails limit "+(pageid-1)+","+total;    
	    return jdbc.query(sql,new RowMapper<Employee>(){    
	        public Employee mapRow(ResultSet rs, int row) throws SQLException {    
	            Employee e=new Employee();    
	            e.setEid(rs.getInt(1));    
	            e.setEname(rs.getString(2));
	            e.setEdept(rs.getString(3));
	            e.setEdesignation(rs.getString(4));
	            e.setEsalary(rs.getLong(5)); 
	            
	            return e;    
	        }    
	    }); 
	}

}
