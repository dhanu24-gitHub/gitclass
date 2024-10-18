package com.example.Vehicle.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.example.Vehicle.Service.BikeService;
import com.example.Vehicle.entity.Bike;

@RestController
@RequestMapping(value= "/Bike")
public class BikeController {
	@Autowired
	BikeService bs;

	
	@PostMapping(value= "/post")
	public String post(@RequestBody Bike b) {
		return bs.post(b);
	}
	
	@PostMapping(value= "/postAll")
	public String postAll(@RequestBody List<Bike> g) {
		return bs.postAll(g);
	}
	
	@GetMapping(value= "/getAll")
	public List<Bike> getAll() {
		return bs.getAll();
	}
	
	@GetMapping(value= "/get/{x}")
	public Bike get(@PathVariable int x) {
		return bs.get(x);
	}
	
	@GetMapping(value= "/getMin")
	public Bike getMin() {
		return bs.getMin();
	}
	
	@GetMapping(value= "/getMini")
	public Bike getMini() {
		return bs.getMini();
	}
	
	@GetMapping(value= "/getPrice")
	public List<Bike> getPrice() {
		return bs.getPrice();
	}
	
	@GetMapping(value= "/getBlack")
	public List<String> getBlack() {
		return bs.getBlack();
	}
	
}
