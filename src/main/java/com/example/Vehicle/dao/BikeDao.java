package com.example.Vehicle.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Vehicle.Repository.BikeRepository;
import com.example.Vehicle.entity.Bike;

@Repository
public class BikeDao {
	@Autowired
	BikeRepository br;
	
	public String post(Bike b) {
		br.save(b);
		return "Successfully Posted";
	}

	public String postAll(List<Bike> g) {
		br.saveAll(g);
		return "List Of Objects Posted";
	}
	
	public List<Bike> getAll() {
		return br.findAll();
	}
	
	public Bike get(int w) {
		return br.findById(w).get();
	}
}
