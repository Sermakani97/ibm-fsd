package com.example.springh2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springh2.model.Flight;

@Repository
public interface FlightRepository extends CrudRepository<Flight,Long> {

}
