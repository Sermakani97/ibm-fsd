package com.example.springh2soccer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class League {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private int year;
private String title;
private String season;
public League() {
	super();
	// TODO Auto-generated constructor stub
}

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public League(int year, String title, String season) {
	super();
	this.year = year;
	this.title = title;
	this.season = season;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
@Override
public String toString() {
	return "League [id=" + id + ", year=" + year + ", title=" + title + ", season=" + season + "]";
}

public String getSeason() {
	return season;
}
public void setSeason(String season) {
	this.season = season;
}

}
