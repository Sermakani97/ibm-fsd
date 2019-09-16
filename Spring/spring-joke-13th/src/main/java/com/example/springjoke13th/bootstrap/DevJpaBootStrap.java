package com.example.springjoke13th.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.springjoke13th.model.Joke;
import com.example.springjoke13th.repository.JokeRepository;
@Component
public class DevJpaBootStrap implements ApplicationListener<ContextRefreshedEvent>{
private JokeRepository jokeRepository;


	public DevJpaBootStrap(JokeRepository jokeRepository) {
	super();
	this.jokeRepository = jokeRepository;
}
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		init();
		
	}
	public void init()
	{
		Joke l=new Joke("rajidwa");
		jokeRepository.save(l);
		
	}

}
