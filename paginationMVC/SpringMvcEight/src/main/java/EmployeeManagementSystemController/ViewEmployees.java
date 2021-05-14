package EmployeeManagementSystemController;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import EmployeeDetails.Entity.Employee;
import Repository.EmployeeDAO;
import Repository.EmployeeDAOImpl;

@Controller
public class ViewEmployees {

	private EmployeeDAO employeeDAO = new EmployeeDAOImpl();

	@RequestMapping(value = "/viewEmployee/{page}", method = RequestMethod.GET)
	public String showLoginPage(@PathVariable("page")Integer pageid,Model model) {
		 int total=5;    
	        if(pageid==1){}    
	        else{    
	            pageid=(pageid-1)*total+1;    
	        }    
	        System.out.println(pageid);  
		List<Employee> emp = employeeDAO.getEmployeesByPage(pageid,total);
		model.addAttribute("employees", emp);
		return "viewEmployee";
	}

}
