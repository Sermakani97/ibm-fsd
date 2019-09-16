package com.exam;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	
	
	@RequestMapping(method = RequestMethod.GET,name = "/showView")
	public String showHelloWorldForm()
	{
		return "helloworld-form";
	}

//	@RequestMapping(method = RequestMethod.POST, name = "/processForm")
//	public String processStudentForm()
//	{
//		return "hello-world";
//	}
	@RequestMapping(name = "/processForm")
	public String processStudentFormVersionThree(@RequestParam("FirstName") String firstName,@RequestParam("LastName") String lastName,@RequestParam("Email") String Email,
			Model theModel)
	
	{
		theModel.addAttribute("M", new Student(firstName,lastName,Email));
		return "hello-world";
	}
}