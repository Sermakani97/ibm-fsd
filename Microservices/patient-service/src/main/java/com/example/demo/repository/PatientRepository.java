package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.data.Patient;
@Repository
public interface PatientRepository extends CrudRepository<Patient,Long>{

}
