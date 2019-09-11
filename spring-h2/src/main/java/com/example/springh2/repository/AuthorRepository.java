package com.example.springh2.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springh2.model.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

}