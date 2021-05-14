package EmployeeManagementSystem;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Database.EmployeeDAO;
import Database.EmployeeDAOImpl;
import EmployeeDetails.Employee;

@Controller
public class ViewEmployees {

	private EmployeeDAO employeeDAO = new EmployeeDAOImpl();

	@RequestMapping(value = "/viewEmployee", method = RequestMethod.GET)
	public String showLoginPage(Model model) {
		List<Employee> emp = employeeDAO.getEmployees();
		model.addAttribute("employees", emp);
		return "viewEmployee";
	}

}
