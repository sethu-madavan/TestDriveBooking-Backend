package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cars {

	@Id
	private int bookingId;
	
	private String brand;
	private String model;
	private String time;
	private String date;
	
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Cars(int bookingId, String brand, String model, String time, String date) {
		super();
		this.bookingId = bookingId;
		this.brand = brand;
		this.model = model;
		this.time = time;
		this.date = date;
	}
	public Cars()
	{
		
	}
	
}
