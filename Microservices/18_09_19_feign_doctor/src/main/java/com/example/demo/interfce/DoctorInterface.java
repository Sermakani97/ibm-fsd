package com.example.demo.interfce;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.model.Doctor;

@FeignClient(name="doctor",url = "http://localhost:8762/doctor")
public interface DoctorInterface {
	
	@GetMapping("/list")
	public List<Doctor> getDoctor();

}
