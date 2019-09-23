package com.example.demo.service;

import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.shared.CustomerDto;

@Service
public class CustomerService {
@Autowired
private CustomerRepository customerRepository;
public List<Customer> getAllCustomer()
{
	return (List<Customer>)customerRepository.findAll();
}
public Customer findById(Long id) {
	// TODO Auto-generated method stub
	return customerRepository.findById(id).get();
}
public void deleteCustomer(Long id) {
	// TODO Auto-generated method stub
        customerRepository.deleteById(id);
}

public CustomerDto saveCustomer(CustomerDto customerDetail) {
	// TODO Auto-generated method stub
	
	
	customerDetail.setCustomerId(UUID.randomUUID().toString());
	
	ModelMapper mapper=new ModelMapper();
	mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	
	Customer customer=mapper.map(customerDetail, Customer.class);
	customerRepository.save(customer);
	CustomerDto cDto=mapper.map(customer, CustomerDto.class);
	return cDto;
	}

}
