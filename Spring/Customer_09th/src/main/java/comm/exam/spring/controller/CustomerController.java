package comm.exam.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import comm.exam.spring.entity.Customer;
import comm.exam.spring.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService service;
	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		
		// get customers from the service
		List<Customer> theCustomers = service.getCustomers();
				
		// add the customers to the model
		theModel.addAttribute("customers", theCustomers);
		
		return "list-customers";
	}
	@GetMapping("/Customer-home")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Customer theCustomer = new Customer();
		
		theModel.addAttribute("customer", theCustomer);
		
		return "Customer-home";
	}
	@GetMapping("/deleteCustomers/{id}")
	public String deleteCustomers(@PathVariable int id)
	{
		service.deleteCustomers(id);
		return "redirect:/customer/list";
	}
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int id,
									Model theModel) {
		
		// get the customer from our service
		Customer theCustomer = service.updateCustomers(id);
		
		// set customer as a model attribute to pre-populate the form
		theModel.addAttribute("customer", theCustomer);
		
		// send over to our form		
		return "Customer-home";
	}
//	@PostMapping("/saveCustomer")
//	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
//		// save the customer using our service
//		service.saveCustomer(theCustomer);	
//		
//		return "redirect:/customer/list";
//	}

	@PostMapping("/create")
	public String create(@ModelAttribute("customer") Customer theCustomer, Model theModel)
	{
		service.createCustomer(theCustomer);
		return "redirect:/customer/list";
	}
}