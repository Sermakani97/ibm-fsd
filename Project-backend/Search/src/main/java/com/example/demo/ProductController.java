package com.example.demo;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService productService;
	@RequestMapping("/id")
	public String index() 
	{
		return "index";
	}
	@RequestMapping("/search")
	@ResponseBody
	public List<String> search(HttpServletRequest request) {
		return productService.search(request.getParameter("term"));
	}
}