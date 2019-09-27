package com.example.demo.interfce;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Patient;

@FeignClient(name="patient",url = "http://localhost:8762/patient")
public interface PatientInterface {

	@GetMapping("/list")
	List<Patient> getPatient();

}
