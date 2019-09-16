package com.example.springempl13th.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springempl13th.model.Employee;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {

}
