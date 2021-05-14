package com.simpleInterest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SimpleInterest {

	@RequestMapping(value = "/simple", method = RequestMethod.GET)
	/*
	 * @ResponseBody
	 */ public String showLoginPage() {
		return "firstjsp";
	}

	@RequestMapping(value = "/simple", method = RequestMethod.POST)
	public String handleUserLogin(@RequestParam int rate, @RequestParam int years, @RequestParam int amount,
			ModelMap model) {
		int si = (rate * years * amount) / 100;
		model.put("interest", si);
		return "simpleInterest";
	}
}
