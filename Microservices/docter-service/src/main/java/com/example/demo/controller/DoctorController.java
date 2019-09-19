package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.Doctor;
import com.example.demo.service.DoctorService;
@RestController
public class DoctorController {
	@Autowired
	private DoctorService doctorService;
@GetMapping("/")
public List<Doctor> getPlayers(){
	return doctorService.getDoctors();
}
@GetMapping("/get/{id}")
public Doctor findPlayer(@PathVariable("id") Long id) {
	return doctorService.findById(id);
}

}
