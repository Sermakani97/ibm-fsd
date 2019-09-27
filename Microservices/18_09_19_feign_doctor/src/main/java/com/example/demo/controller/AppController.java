package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.interfce.DoctorInterface;
import com.example.demo.interfce.PatientInterface;
import com.example.demo.model.Doctor;
import com.example.demo.model.Patient;

@Controller
public class AppController {
	
	@Autowired
	private DoctorInterface doctorInteface;
	@Autowired
	private PatientInterface patientInterface;
	
		@RequestMapping("/")
		public String home() {
			return "home";
		}
		
		@RequestMapping("/fetchPatient")
		public String listPatient(Model model) {
			List<Patient> patient =patientInterface.getPatient();
			model.addAttribute("ll",patient);
			return "/player/list";
		}
		
		@RequestMapping("/fetchDoctor")
		public String listDoctor(Model model) {
			List<Doctor> doctor = doctorInteface.getDoctor();
			model.addAttribute("ll",doctor);
			return "/player/list";
		}
		
		public DoctorInterface getDoctorInteface() {
			return doctorInteface;
		}
		
		public void setDoctorInteface(DoctorInterface doctorInteface) {
			this.doctorInteface = doctorInteface;
		}
		

}
