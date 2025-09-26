package com.example.hotelservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int hotelId;
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	private int userId;
	private String name;
	
//	@Transient
//	private UserDto user;
	
//	public UserDto getUser() {
//		return user;
//	}
//	public void setUser(UserDto user) {
//		this.user = user;
//	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Hotel(int userId, String name) {
		super();
		this.userId = userId;
		this.name = name;
	}
	public Hotel() {
		super();
	}
	
}
