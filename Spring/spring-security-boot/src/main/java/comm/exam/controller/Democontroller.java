package comm.exam.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Democontroller {

	@GetMapping("/")
	public String showHome() {
		
		return "home";
	}
	@GetMapping("/showMyLoginPage")
	public String showMyLoginPage() {
		
		// return "plain-login";

		return "fancy-login";
		
	}
}