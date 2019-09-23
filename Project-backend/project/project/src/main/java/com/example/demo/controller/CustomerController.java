package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.model.CreateCustomerRequestModel;
import com.example.demo.model.CreateCustomerResponseModel;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.service.CustomerService;
import com.example.demo.shared.CustomerDto;

@RestController
@RequestMapping("/")
public class CustomerController {
	
@Autowired
private CustomerService customerService;
@RequestMapping("/customers")
public ResponseEntity<Iterable<Customer>> getAllCustomers()
{
	return ResponseEntity.ok(customerService.getAllCustomer());
}
@SuppressWarnings("unchecked")
@GetMapping("/findbyid/{id}")
public ResponseEntity<Customer> findById(@PathVariable("id") Long id){
	
	return ResponseEntity.ok((customerService).findById(id));
}
@GetMapping("/deletecustomer/{id}")
public ResponseEntity<?> deleteProject(@PathVariable("id")Long id){
	customerService.deleteCustomer(id);
	return ResponseEntity.ok("deleted");
}
@PostMapping("/savecustomer")
public ResponseEntity<CreateCustomerResponseModel> saveCustomer(@RequestBody CreateCustomerRequestModel customerDetail){
	ModelMapper mapper=new ModelMapper();
	mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	
	CustomerDto uDto=mapper.map(customerDetail, CustomerDto.class);
	CustomerDto tempDto=customerService.saveCustomer(uDto);
	CreateCustomerResponseModel model=mapper.map(tempDto, CreateCustomerResponseModel.class);;
	return ResponseEntity.status(HttpStatus.CREATED).body(model);

	
	}
}
