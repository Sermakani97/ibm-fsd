package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.data.Doctor;
import com.example.demo.repository.DoctorRepository;

@Service
public class DoctorService {
	@Autowired
	private DoctorRepository doctorRepo;
	public List<Doctor> getDoctors(){
		return (List<Doctor>) doctorRepo.findAll(); 
	}
	public Doctor findById(Long id) {
		return doctorRepo.findById(id).get();
	}
}
