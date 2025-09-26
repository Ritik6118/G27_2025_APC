package com.example.hotelservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hotelservice.entity.Hotel;
import com.example.hotelservice.repository.HotelRepo;

@Service
public class HotelService {
	
	@Autowired
	HotelRepo hr;
	
	
	public void addHotel(Hotel h) {
		hr.save(h);
	}
	
	public Hotel getHotel(int id) {
		return hr.findById(id).get();
	}
	
	public List<Hotel> getAll(){
		return hr.findAll();
	}
	
}
