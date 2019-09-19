package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.data.Patient;
import com.example.demo.service.PatientService;
@RestController
public class PatientController {
@Autowired
private PatientService patientService;
@GetMapping("/")
public List<Patient> getPlayers(){
	return patientService.getDoctors();
}
@GetMapping("/get/{id}")
public Patient findPlayer(@PathVariable("id") Long id) {
	return patientService.findById(id);
}
}
