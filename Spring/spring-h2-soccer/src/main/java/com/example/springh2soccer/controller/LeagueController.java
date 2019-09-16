package com.example.springh2soccer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.springh2soccer.model.League;
import com.example.springh2soccer.repository.LeagueRepository;

@Controller
@RequestMapping("/leagues")
public class LeagueController {
	private LeagueRepository leagueRepository;

	public LeagueController(LeagueRepository leagueRepository) {
		super();
		this.leagueRepository = leagueRepository;
	}
	@RequestMapping("/league")
	public String getAllBooks(Model theModel)
	{
		theModel.addAttribute("leagues",leagueRepository.findAll());
		return "leagues";
	}
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
	League theLeague = new League();
		
		theModel.addAttribute("league", theLeague);
		
		return "league-form";
	}
	@PostMapping("/delete")
	public String delete(@RequestParam("leagueId") long theId) {
		
		// delete the employee
		leagueRepository.deleteById(theId);
		
		// redirect to /employees/list
		return "redirect:/leagues/list";
		
	}
	@PostMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("leagueId") long theId,
									Model theModel) {
		
		// get the employee from the service
		Optional<League> theLeague =leagueRepository.findById(theId);
		
		// set employee as a model attribute to pre-populate the form
		theModel.addAttribute("league", theLeague);
		
		// send over to our form
		return "league-form";			
	}

	
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("league") League theLeague) {
		// save the employee
		leagueRepository.save(theLeague);
		// use a redirect to prevent duplicate submissions
		return "redirect:/leagues/list";
	}
	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		// get employees from db
		List<League> theLeague = leagueRepository.findAll();
		// add to the spring model
		theModel.addAttribute("leagues", theLeague);
		
		return "leagues";
	}

}
