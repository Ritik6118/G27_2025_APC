package com.example.ratingservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ratingservice.entity.Rating;
import com.example.ratingservice.repository.RatingRepo;

@Service
public class RatingService {
	
	@Autowired
	RatingRepo rr;
	
	public void add(Rating r) {
		rr.save(r);
	}
	
	public Rating getRating(int id) {
		Optional<Rating> o=rr.findById(id);
		return o.get();
	}
	
	public List<Rating> getAll() {
		return rr.findAll();
	}
}
