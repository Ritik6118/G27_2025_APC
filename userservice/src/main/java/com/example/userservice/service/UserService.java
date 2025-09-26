package com.example.userservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.userservice.entity.User;
import com.example.userservice.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository ur;
	
	public void add(User u) {
		ur.save(u);
	}
	public void update(User u) {
		ur.save(u);
	}
	public void delete(User u) {
		ur.delete(u);
	}
	public User get(int id) {
		Optional<User> o= ur.findById(id);
		return o.get();
	}
	public List<User> getAll(){
		List<User> li=ur.findAll();
		return li;
	}
}
