package com.example.springh2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springh2.model.Publisher;
@Repository
public interface PublisherRepository extends CrudRepository<Publisher,Long> {

}
