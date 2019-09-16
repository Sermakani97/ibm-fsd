package comm.exam.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	@GetMapping("/showForm")
public String viewPage(Model theModel)
{
		Student s=new Student();
		theModel.addAttribute("student",s);
	return "studentform";
}
@PostMapping("/processForm")
public String processPage(@ModelAttribute("student")Student theStudent,Model theModel)
{
	theModel.addAttribute("tempStudent",theStudent);
	StudentDao1 s=new StudentDao1();
	s.createEmployee(theStudent);
	return "student-detail";
}
}
