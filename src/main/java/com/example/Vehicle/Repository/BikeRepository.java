package com.example.Vehicle.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Vehicle.entity.Bike;

public interface BikeRepository extends JpaRepository<Bike, Integer>{

}
