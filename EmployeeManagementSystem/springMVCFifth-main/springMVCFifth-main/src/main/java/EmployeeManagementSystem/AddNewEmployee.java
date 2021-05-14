package EmployeeManagementSystem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Database.EmployeeDAO;
import Database.EmployeeDAOImpl;
import EmployeeDetails.Employee;

@Controller
public class AddNewEmployee {

	@RequestMapping(value = "/newEmployee", method = RequestMethod.GET)
	public String showLoginPage() {
		return "addEmployee";
	}

	@RequestMapping(value = "/newEmployee", method = RequestMethod.POST)
	public String showDetails(ModelMap map, @ModelAttribute("model") Employee e) {

		System.out.println(e);
		EmployeeDAO emp = new EmployeeDAOImpl();
		emp.insert(e);
		map.put("message", "Employee Registered Succesfully");
		return "final";

	}

}
