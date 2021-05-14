package FormValidation;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Form {

	@RequestMapping(value="/registeration",method=RequestMethod.GET)
	public String showLoging() {
		return "first";
	}
	
	
	@RequestMapping(value="/registereration",method=RequestMethod.POST)
	public String showLogingInfo(@Valid @ModelAttribute("model") User user,BindingResult result ) {
		if(result.hasErrors()) {
			System.out.println("My page has errors");
			return "first";
		}
		return "info";
	}
	
	
}
