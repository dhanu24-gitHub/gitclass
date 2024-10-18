package com.example.Vehicle.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Vehicle.dao.BikeDao;
import com.example.Vehicle.entity.Bike;

@Service
public class BikeService {
	@Autowired
	BikeDao bd;
	
	public String post(Bike b) {
		return bd.post(b);
	}
	
	public String postAll(List<Bike> g) {
		return bd.postAll(g);
	}

	public List<Bike> getAll() {
		return bd.getAll();
	}
	
	public Bike get(int w) {
		return bd.get(w);
	}
	
	public Bike getMin() {
		List<Bike> b = bd.getAll();
		Bike min = b.get(0);
		for(int i = 0; i < b.size(); i++) {
			if(b.get(i).getPrice() < min.getPrice()) {
				min = b.get(i);
			}
		}
		return min;
	}
	
	public Bike getMini() {
		List<Bike> d = bd.getAll();
		Bike c = d.stream().min(Comparator.comparingInt(Bike :: getPrice)).get();
		return c;
	}
	
	public List<Bike> getPrice(){
		List<Bike> g = bd.getAll();
		List<Bike> v = g.stream().filter(x -> x.getPrice() < 300000).collect(Collectors.toList());
		return v;
	}
	
	public List<String> getBlack() {
		List<Bike> p = bd.getAll();
		List<String> blacks = p.stream().filter(x -> x.getColor().equalsIgnoreCase("Black")).map(x -> x.getBrand()).collect(Collectors.toList());
		return blacks;
	}
	
	
}
