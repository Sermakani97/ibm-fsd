package com.example.springh2soccer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springh2soccer.model.League;
@Repository
public interface LeagueRepository extends JpaRepository<League,Long> {

}
