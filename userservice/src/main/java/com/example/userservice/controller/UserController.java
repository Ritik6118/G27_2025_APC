package com.example.userservice.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.userservice.entity.User;
import com.example.userservice.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService us;
	
	@GetMapping("/getAllUser/{id}")
	public List<User> getAll(){
		return us.getAll();
	}
	
	@GetMapping("/getUser/{id}")
	public User getUser(@PathVariable int id) {
		return us.get(id);
	}
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User u) {
		us.add(u);
		return u;
	}
	
	@DeleteMapping("/deleteUser")
	public void delteUser(@RequestBody User u) {
		us.delete(u);
	}
	
	@PutMapping("path/{id}")
	public void updateUser(@PathVariable int id, @RequestParam String name) {
		User u=us.get(id);
		u.setName(name);
		us.update(u);
	}
	
	
}
