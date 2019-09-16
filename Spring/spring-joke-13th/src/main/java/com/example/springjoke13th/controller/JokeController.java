package com.example.springjoke13th.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.springjoke13th.model.Joke;
import com.example.springjoke13th.repository.JokeRepository;

@Controller
@RequestMapping("/jokes")

public class JokeController {
private JokeRepository jokeRepository;

public JokeController(JokeRepository jokeRepository) {
	super();
	this.jokeRepository = jokeRepository;
}
@RequestMapping("/joke")
public String getAllBooks(Model theModel)
{
	theModel.addAttribute("jokes",jokeRepository.findAll());
	return "jokes";
}
@GetMapping("/showFormForAdd")
public String showFormForAdd(Model theModel) {
	
	// create model attribute to bind form data
Joke theJoke = new Joke();
	
	theModel.addAttribute("joke", theJoke);
	
	return "joke-form";
}
@PostMapping("/save")
public String saveEmployee(@ModelAttribute("joke") Joke theLeague) {
	// save the employee
	jokeRepository.save(theLeague);
	// use a redirect to prevent duplicate submissions
	return "redirect:/jokes/list";
}
@GetMapping("/list")
public String listEmployees(Model theModel) {
	// get employees from db
	List<Joke> theLeague = (List<Joke>) jokeRepository.findAll();
	// add to the spring model
	theModel.addAttribute("jokes", theLeague);
	
	return "jokes";
}
}
