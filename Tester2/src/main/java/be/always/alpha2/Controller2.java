package be.always.alpha2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Controller2 {

	@RequestMapping(value="/x/y", method = RequestMethod.GET)
	public String contact(Model model){
		
		return "home";
	}
}
