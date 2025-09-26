package com.example.hotelservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.example.hotelservice.configuration.config;
import com.example.hotelservice.entity.Hotel;
import com.example.hotelservice.entity.UserDto;
//import com.example.hotelservice.entity.UserDto;
//import com.example.hotelservice.entity.UserDto;
import com.example.hotelservice.service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    
	@Autowired
	HotelService hs;
	
	@Autowired
	RestTemplate rt;
	
	@GetMapping("/getHotel/{id}")
	public Hotel getHotel(@PathVariable int id) {
		return hs.getHotel(id);
	}
	
	@GetMapping("/getAllHotel")
	public List<Hotel> getAll(){
		return hs.getAll();
	}
	
	@PostMapping("/addHotel")
	public Hotel addHotel(@RequestBody Hotel h){
		hs.addHotel(h);
		h=hs.getHotel(h.getHotelId());
//		h.setUser(getByUser(h.getUserId()));
//		System.out.println("hello");
//		System.out.println(h.getUser().getName());
		return h;
		
	}
	
	@GetMapping("/getUserByHotelId/{id}")
	public UserDto getUserByHotelId(@PathVariable  int id) {
		Hotel h=hs.getHotel(id);
		int uid=h.getUserId();
		UserDto ud=rt.getForObject("http://localhost:9090/user/getUser/"+uid, UserDto.class);
		return ud;
	}
	
	
	
}
