package com.example.springh2soccer.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.springh2soccer.model.League;
import com.example.springh2soccer.repository.LeagueRepository;
@Component
public class DevJpaBootStrap implements ApplicationListener<ContextRefreshedEvent>{
private LeagueRepository leagueRepository;


	public DevJpaBootStrap(LeagueRepository leagueRepository) {
	super();
	this.leagueRepository = leagueRepository;
}
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		init();
		
	}
	public void init()
	{
		League l=new League(2019,"League","summer");
		leagueRepository.save(l);
		
	}

}
