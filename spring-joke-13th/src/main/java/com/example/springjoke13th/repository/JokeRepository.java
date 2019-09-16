package com.example.springjoke13th.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springjoke13th.model.Joke;
@Repository
public interface JokeRepository extends CrudRepository<Joke,Long> {

}
