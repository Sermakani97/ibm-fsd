package com.example.springjoke13th.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Joke {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	public Joke() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Joke(String jokes) {
		super();
		this.jokes = jokes;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	private String jokes;
	public String getJokes() {
		return jokes;
	}
	public void setJokes(String jokes) {
		this.jokes = jokes;
	}

}
