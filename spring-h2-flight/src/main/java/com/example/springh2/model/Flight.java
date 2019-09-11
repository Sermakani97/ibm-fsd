package com.example.springh2.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Flight {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String fname;
@ManyToMany
@JoinTable(name = "passenger_flight", joinColumns = @JoinColumn(name = "passenger_id"),inverseJoinColumns = @JoinColumn(name = "flight_id"))
private Set<Passenger> passengers = new HashSet<>();

public Flight()
{
	super();
}

public Flight(String fname, Set<Passenger> passengers) {
    this.fname=fname;
    this.passengers = passengers;
}

public Flight(String fname) {
	super();
	this.fname = fname;
}



public void setId(long id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public Set<Passenger> getPassengers() {
	return passengers;
}
public void setPassengers(Set<Passenger> passengers) {
	this.passengers = passengers;
}

@Override
public int hashCode() {
	  return id != null ? id.hashCode() : 0;
}

@Override
public boolean equals(Object o) {
	  if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      Flight flight = (Flight) o;

      return id != null ? id.equals(flight.id) : flight.id == null;
}
@Override
public String toString() {
    return "Flight{" +
            "id=" + id +
            ", fname='" + fname+ '\'' +
            ", passengers=" + passengers +
            '}';
}

}
