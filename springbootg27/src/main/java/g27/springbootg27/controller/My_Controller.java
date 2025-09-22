package g27.springbootg27.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import g27.springbootg27.entity.Student;
import g27.springbootg27.service.Student_Service;

@RestController
public class My_Controller {
	
	@Autowired
	Student_Service ss;
	
	@RequestMapping("/")
	public String Start() {
		return "application started";
	}
	
	@RequestMapping("/addstudent")
	public String add(@RequestBody Student s) {
		ss.add(s);
		return "added successfully";
	}
}
