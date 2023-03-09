package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Cars;
import com.example.demo.Repository.CarsRepo;

@Service
public class CarsService {
	
	@Autowired
	private CarsRepo car;
	
	//Show cars
	public List<Cars> show()
	{
		List<Cars> ar = new ArrayList<>();
		ar = (List<Cars>) car.findAll();
		return ar;
	}

	
	//Add cars
	public Cars add(Cars obj)
	{
		return car.save(obj);
	}
	
	//Delete cars
	public void del(int id)
	{
		car.deleteById(id);
	}
	
	//update cars
	public Cars updatecar(int id,Cars obj)
	{
		Cars ca = car.findById(id).get();
		if(Objects.nonNull(ca) && (!(Objects.isNull(obj.getBookingId()))))
		{
			ca.setBookingId(obj.getBookingId());
		}
		if(Objects.nonNull(ca) && (!(Objects.isNull(obj.getBrand()))))
		{
			ca.setBrand(obj.getBrand());
		}
		if(Objects.nonNull(ca) && (!(Objects.isNull(obj.getModel()))))
		{
			ca.setModel(obj.getModel());
		}
		if(Objects.nonNull(ca) && (!(Objects.isNull(obj.getTime()))))
		{
			ca.setTime(obj.getTime());
		}
		if(Objects.nonNull(ca) && (!(Objects.isNull(obj.getDate()))))
		{
			ca.setDate(obj.getDate());
		}
		return car.save(ca);
	}

	public Cars getCar(int id) {
		return car.findById(id).get();
	}
}
