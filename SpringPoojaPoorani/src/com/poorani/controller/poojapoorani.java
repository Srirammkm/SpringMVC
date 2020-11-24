package com.poorani.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/welcome")
public class poojapoorani {
 
	 
	 @RequestMapping(method = RequestMethod.GET)
	   public ModelAndView student() {
	      return new ModelAndView("student", "command", new Student());
	   }
	   @RequestMapping(method = RequestMethod.POST)
	      public String addStudent(@ModelAttribute("SpringPoojaPoorani")Student student, 
	   
	   ModelMap model) {
	      model.addAttribute("name", student.getName());
	      model.addAttribute("pass", student.getPass());
	      
	      return "registration-done";
	   }
	   /*
				***********Just clicking a link which redirects to another page(welcome)**************
				 @RequestMapping("/welcome")
			public ModelAndView helloWorld() {
		
			String message = "<br><div style='text-align:center;'>"
						+ "<h3>Welcome...<br><br>Successfully into the Home Page now!!!!!</h3></div><br><br>";
				return new ModelAndView("welcome", "message", message);
			}
	    */
	 
	
}
