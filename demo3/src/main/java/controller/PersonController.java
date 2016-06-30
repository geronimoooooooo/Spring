package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Person;

@Controller
public class PersonController {
	
	
	@RequestMapping("/person2")
	@ResponseBody
	public String person2(){
		return "abc";
	}

	@RequestMapping("/person")
	public String person(Model model){ //the data is in model
		Person p = new Person();
		p.setFirstname("Bud");
		p.setLastname("Spencer");
		p.setAge(86);
		model.addAttribute("person", p);
		return "personview"; //name of the view
	}
	
	@ResponseBody
	@RequestMapping("/qq")
	String entry(){
		return "qq";
	}
}
