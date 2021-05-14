package Repository;

import java.util.List;


import org.springframework.stereotype.Repository;

import EmployeeDetails.Entity.Employee;



@Repository
public interface EmployeeDAO {

	public List<Employee> getEmployeesByPage(int pageid,int total);

}
