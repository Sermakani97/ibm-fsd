package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.data.Patient;

import com.example.demo.repository.PatientRepository;

@Service
public class PatientService {
	@Autowired
	private PatientRepository doctorRepo;
	public List<Patient> getDoctors(){
		return (List<Patient>) doctorRepo.findAll(); 
	}
	public Patient findById(Long id) {
		return doctorRepo.findById(id).get();
	}
}
