package a.b.c;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	
	@RequestMapping("/greeting")
	public String greeting(@RequestParam(value="name",required=false, defaultValue="World") String name, Model model){
		model.addAttribute("name", name);
		return "greeting";
	}
	
	@RequestMapping("/greetingThyme")
	public String greetingThyme(@RequestParam(value="name",required=false, defaultValue="World") String name, Model model){
		model.addAttribute("name", name);
		return "greetingThyme";
	}
	
	@RequestMapping(value="/a", method=RequestMethod.GET)
	public ModelAndView getData(){
		List<String> list = getList();
		
		ModelAndView model = new ModelAndView("rofl");
		model.addObject("lists",list);
		return model;
	}
	
	private List<String> getList(){
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		return list;
	}
	
	@RequestMapping("/link")
	public ModelAndView link(){
		String msg="this is some msg";
		return new ModelAndView("folder/a", "msg", msg);
	}
	@RequestMapping("/link3")
	public ModelAndView link3(){
		logger.info("Das ist link3");
		String msg="this is some msg";
		return new ModelAndView("redirect:/link2");
	}
	
	@RequestMapping("/link2")
	public String link2(Model model,@RequestParam(value="msg",required=false, defaultValue="World") String msg){
		logger.info("Das ist link2");
		model.addAttribute("msg", msg);
		return "folder/a";
	}
	
	@RequestMapping("/hello/{name}")
    String hello(@PathVariable String name) {
		logger.info("this is the name: "+name);
        return "Hello, " + name + "!";
    }
}
