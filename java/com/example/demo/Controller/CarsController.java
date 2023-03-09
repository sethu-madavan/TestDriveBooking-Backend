package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Cars;
import com.example.demo.Service.CarsService;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class CarsController {
	
	@Autowired
	private CarsService serv; 
	
	@GetMapping("/show")
	public List<Cars> showcar()
	{
		return serv.show();	
	}
	
	@GetMapping("/view/{id}")
	public Cars getcar(@PathVariable("id") int id)
	{
		return serv.getCar(id);	
	}
	
	@PostMapping("/add")
	public String addcar(@RequestBody Cars obj)
	{
		serv.add(obj);
		return "Added sucessfully";
	}
	
	@DeleteMapping("/del/{id}")
	public String delcar(@PathVariable ("id") int id )
	{
		serv.del(id);
		return "SuccessFully removed";
	}
	
	@PutMapping("/update/{id}")
	public Cars update(@PathVariable ("id") int id,@RequestBody Cars obj)
	{
		return serv.updatecar(id, obj);
	}
	
}
