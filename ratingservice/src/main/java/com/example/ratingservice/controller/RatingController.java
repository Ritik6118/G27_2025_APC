package com.example.ratingservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ratingservice.entity.Rating;
import com.example.ratingservice.service.RatingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/rating")
public class RatingController {
	@Autowired
	RatingService rs;
	
	@GetMapping("/getRating/{id}")
	public Rating getRating(@PathVariable int id) {
		return rs.getRating(id);
	}
	
	@GetMapping("/getAllRating")
	public List<Rating> getAll(){
		return rs.getAll();
	}
	
	
	@PostMapping("/addRating")
	public Rating addRating(@RequestBody Rating r) {
		rs.add(r);
		return r;
	}
	
	@GetMapping("/npe")
	public String npe() {
		String s=null;
		s.toCharArray();
		return "npe created";
	}
	
}
