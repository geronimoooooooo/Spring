package be.always.alpha2;

import java.text.DateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import models.Customer;
import utility.Helper1;
import utility.Helper2;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
		
	@RequestMapping(value = "/a", method = RequestMethod.GET)
	public String  home(Model model) {
		/*
		<form:form method="GET" commandName="noAction">	
			<form:select path="name">
		    	<form:options items="${nameList}" />
			</form:select>
		</form:form>
		*/
		
		Customer cust = new Customer();
		//ModelAndView mav = new ModelAndView("home");
		ModelAndView mav = new ModelAndView("dropdown");
		Map<String,String> nameList = new LinkedHashMap<String,String>();
		nameList.put("Java", "Java2");
		nameList.put("Spring", "Spring2");
	

		model.addAttribute("noAction", cust);
		model.addAttribute("nameList", nameList);
		
		String serverTime ="abc";
		mav.addObject("serverTime",serverTime);
					
	    return mav.getViewName();
	}
	
	@RequestMapping(value = "/dropdown", method = RequestMethod.GET)
	public ModelAndView  dropdown(Model model) {
		
		/* <form:form method="GET" action="dropdown" commandName="linker">	
				<form:select path="name">
	    			<form:options items="${nameList}" />
				</form:select>
		   </form:form> 
		 */
		
		Customer cust = new Customer();
		ModelAndView mav = new ModelAndView("dropdown");
		
		Map<String,String> nameList = new LinkedHashMap<String,String>();
		nameList.put("Java", "Java");
		nameList.put("Spring", "Spring");
		model.addAttribute("linker", cust);
		model.addAttribute("nameList",nameList);
		//mav.addObject("nameList", nameList);	
					
	    return mav;
	}
	
	@RequestMapping(value = "/dropdown2", method = RequestMethod.GET)
	public ModelAndView  dropdown2(Model model, Customer customer) {
		 /*
		   <form:form method="GET" action="dropdown2" modelAttribute="customer">	
		  		<form:select path="name">
	    			<form:options items="${nameList}" />
				</form:select>
			</form:form>
		*/		
		ModelAndView mav = new ModelAndView("dropdown");
		
		Map<String,String> nameList = new LinkedHashMap<String,String>();
		nameList.put("Java", "Java3");
		nameList.put("Spring", "Spring3");
		//model.addAttribute("drop", cust);
		model.addAttribute("nameList",nameList);
		//mav.addObject("nameList", nameList);	
					
	    return mav;
	}
}
