package a.b.c;

import model.*;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller2 {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping("/home")
	public String get2Home(){
		logger.info("Controller2 mit /home");
		return "home";
	}
	
	@RequestMapping("/hello")  
    public ModelAndView helloWorld(HttpServletRequest request,HttpServletResponse res) {  
        String name=request.getParameter("name");  
        String password=request.getParameter("password");  
          
        logger.info(name +", "+password);
        if(password.equals("admin")){  
        String message = "HELLO "+name;  
        return new ModelAndView("hellopage", "message", message);  
        }  
        else{  
            return new ModelAndView("errorpage", "message","Sorry, username or password error");  
        }  
    }  
	@RequestMapping("/showtable")
	public String showTable(Model model){
		logger.info("this is /showtable");
		String msg="msg";
		List<Table> list=new ArrayList<Table>();  
        list.add(new Table("rahul",35000));  
        list.add(new Table("aditya",25000));  
        list.add(new Table("sachin",55000));  
        model.addAttribute("list", list);
        model.addAttribute("msg", list.get(0).name);
        return "folder/table";
	}
	
}
