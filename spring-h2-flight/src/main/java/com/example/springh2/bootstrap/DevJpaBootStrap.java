package com.example.springh2.bootstrap;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.springh2.model.Passenger;
import com.example.springh2.model.Flight;
import com.example.springh2.model.Reservation;
import com.example.springh2.repository.PassengerRepository;
import com.example.springh2.repository.FlightRepository;
import com.example.springh2.repository.ReservationRepository;

@Component
public class DevJpaBootStrap implements ApplicationListener<ContextRefreshedEvent> {

	private FlightRepository flightRepository;
	private ReservationRepository reservationRepository;
	private PassengerRepository passengerRepository;

	public DevJpaBootStrap(FlightRepository flightRepository, ReservationRepository reservationRepository,
			PassengerRepository passengerRepository) {
		super();
		this.flightRepository = flightRepository;
		this.reservationRepository = reservationRepository;
		this.passengerRepository = passengerRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		init();
	}

	private void init() {
		// TODO Auto-generated method stub
		Reservation reservation = new Reservation();
		reservation.setFirstName("serma");
		reservation.setLastName("kani");
		reservation.setEmail("ser@gg.com");
		reservation.setFname("kingfisher");
		reservationRepository.save(reservation);
		// Eric
		Passenger eric = new Passenger("Eric", "Evans","ser@gg.com");
		Flight ddd = new Flight("aaaaaa");
		eric.getFlights().add(ddd);
		ddd.getPassengers().add(eric);
		passengerRepository.save(eric);
		flightRepository.save(ddd);
	}

}