package com.example.springh2.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Passenger {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    private String firstName;
	    private String lastName;
	    private String email;

	    @ManyToMany(mappedBy = "passengers")
	    private Set<Flight> flight = new HashSet<>();

		

	    public Set<Flight> getFlights() {
			return flight;
		}

		public void setFlights(Set<Flight> flights) {
			this.flight = flights;
		}

		public Passenger() {
	    }

	    public Passenger(String firstName, String lastName,String email) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.email=email;
	    }

	    public Passenger(String firstName, String lastName,String email, Set<Flight> flights) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.email=email;
	        this.flight = flights;
	    }

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;

	        Passenger passenger = (Passenger) o;

	        return id != null ? id.equals(passenger.id) : passenger.id == null;
	    }

	    @Override
	    public int hashCode() {
	        return id != null ? id.hashCode() : 0;
	    }

	    @Override
	    public String toString() {
	        return "Author{" +
	                "id=" + id +
	                ", firstName='" + firstName + '\'' +
	                ", lastName='" + lastName + '\'' +
	                 ", email='" + email + '\'' +
	                ", flights=" + flight +
	                '}';
	    }

		
}
