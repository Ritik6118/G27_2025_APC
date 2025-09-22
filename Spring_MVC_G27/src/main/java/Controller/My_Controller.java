package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Dao.User_Dao_Hibernate;
import Entity.User;

@Controller
public class My_Controller {
	
	private User_Dao_Hibernate ud; 
	
	public User_Dao_Hibernate getUd() {
		return ud;
	}

	public void setUd(User_Dao_Hibernate ud) {
		this.ud = ud;
	}

	@RequestMapping("/user")
	public void user() {
		System.out.println("user is runnig from controller");
	}
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("home is running from controller");
		return "home";
	}
	
	@RequestMapping("/student")
	public String student(Model m) {
		
		m.addAttribute("name","Ritik");
		System.out.println("student is running from controller");
		return "student";
	}
	
	@RequestMapping("/form")
	public String form() {
		return "form";
	}
	
	
	@RequestMapping("/submit")
	public String submit(@RequestParam("user_name") String name, @RequestParam("user_email") String email,Model m) {
		User u=new User(name, email);
		ud.insert(u);
		
		m.addAttribute("name" ,name);
		m.addAttribute("email" ,email);
		System.out.println(name +" "+ email);
		return "success";
	}
}
