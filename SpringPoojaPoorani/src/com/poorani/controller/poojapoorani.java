package com.poorani.controller; 
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;     
import org.springframework.ui.Model;     
import org.springframework.web.bind.annotation.PathVariable;    
import com.poorani.controller.EmployeeDAO;  
import com.poorani.controller.Student;  
@Controller
//@RequestMapping("/welcome")
public class poojapoorani {
 
	/* protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
		{
			PrintWriter pw=res.getWriter();
			res.setContentType("text/html");

			String user=req.getParameter("userName");
			int pass=Integer.parseInt(req.getParameter("userPassword"));

			if(user.equals("Pooja")&&pass==1234) 
	                 pw.println("<h1>Login Success...!</h1>"); 
	        else
	                 pw.println("<h1>Login Failed...!</h1>");
			 pw.close();

		}*/
	
	@Autowired    
    EmployeeDAO dao;    
		@RequestMapping(value="/welcome",method = RequestMethod.GET)
	   public ModelAndView student() {
	      return new ModelAndView("student", "command", new Student());
	   }
	 @RequestMapping(value="/welcome",method = RequestMethod.POST)
	      public String addStudent(@ModelAttribute("SpringPoojaPoorani")Student student, 
	   
	   ModelMap model) {
	     model.addAttribute("name", student.getName());
	     model.addAttribute("pass", student.getPass());
	      //dao.save(student);   //saves the data
	    //  List<Student> list=dao.getStudents();    //Displays the data
	    //  model.addAttribute("list",list);  
	      return "front_page";
	   }
	 /*
	   @RequestMapping("/registration-done")    
	    public String viewemp(Model model){    
		   List<Student> list=dao.getStudents();    //Displays the data
		     model.addAttribute("list",list);  
	        return "registration-done";    
	    }    */
	      
	   @RequestMapping("/empform")    
	    public String showform(Model m){    
	        m.addAttribute("command", new Student());       
	        return "empform";   
	    } 
	  
	   @RequestMapping(value="/save",method = RequestMethod.POST)    
	    public String addStudentt(@ModelAttribute("SpringPoojaPoorani") Student stud,ModelMap mod){   
		   mod.addAttribute("idd", stud.getIdd());
		   mod.addAttribute("ffname", stud.getFfname());
		   mod.addAttribute("llname", stud.getLlname());
	        dao.savee(stud);    
	        return "redirect:/registration-done2";//will redirect to viewemp request mapping    
	    }    
	   
	   @RequestMapping("/registration-done2")    
	    public String viewempz(Model model){    
		   List<Student> list=dao.getStudentss();    //Displays the data
		     model.addAttribute("list",list);  
	        return "registration-done2";    
	    }  
	  
	   @RequestMapping(value="/editemp/{idd}")    
	    public String edit(@PathVariable Integer idd, Model m){    
	        Student studen=dao.getEmpById(idd);    
	        m.addAttribute("command",studen);  
	        return "empeditform";    
	    }    
	   
	    /* It updates model object. */    
	    @RequestMapping(value="/editsave",method = RequestMethod.POST)    
	    public String editsave(@ModelAttribute("studen") Student studen){    
	        dao.update(studen);    
	        return "redirect:/registration-done2";    
	    }    
	    
	   @RequestMapping(value="/deleteemp/{idd}",method = RequestMethod.GET)    
	      public String delete(@PathVariable Integer idd){    
	          dao.delete(idd);    
	          return "redirect:/registration-done2";    
	      }    
	   
	   
	      
	   /*	************Just clicking a link which redirects to another page(welcome)**************
				 @RequestMapping("/welcome")
			public ModelAndView helloWorld() {
		
			String message = "<br><div style='text-align:center;'>"
						+ "<h3>Welcome...<br><br>Successfully into the Home Page now!!!!!</h3></div><br><br>";
				return new ModelAndView("welcome", "message", message);
			}
	    
	 */
	
 }
