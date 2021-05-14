package com.loginAndRegister;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class register {

	@RequestMapping(value = "/details", method = RequestMethod.GET)
	/*
	 * @ResponseBody
	 */ public String showLoginPage() {
		return "register";
	}

	@RequestMapping(value = "/details", method = RequestMethod.POST)
	public String handleUserLogin(@ModelAttribute("model") user u) {

		UserDAO user = new UserDAOImpl();
		user.insert(u);
		return "login";
	}

}
