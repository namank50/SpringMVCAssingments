package EmployeeManagementSystem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Database.EmployeeDAO;
import Database.EmployeeDAOImpl;
import EmployeeDetails.Employee;

@Controller
public class FindEmployee {

	@RequestMapping(value = "/findEmployee", method = RequestMethod.GET)
	public String showLoginPage() {
		return "searchFirst";
	}

	@RequestMapping(value = "/findEmployee", method = RequestMethod.POST)
	public String show(@RequestParam int eid, Model model) {
		System.out.println(eid);
		EmployeeDAO emp = new EmployeeDAOImpl();
		Employee myEmployee = emp.getEmployee(eid);
		model.addAttribute("employee", myEmployee);
		return "searchSecond";
	}
}