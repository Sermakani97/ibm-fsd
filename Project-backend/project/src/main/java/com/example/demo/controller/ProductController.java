package com.example.demo.controller;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Product;
import com.example.demo.model.CreateCustomerRequestModel;
import com.example.demo.model.CreateCustomerResponseModel;
import com.example.demo.model.CreateProductRequestModel;
import com.example.demo.model.CreateProductResponseModel;
import com.example.demo.service.CustomerService;
import com.example.demo.service.ProductService;
import com.example.demo.shared.CustomerDto;
import com.example.demo.shared.ProductDto;
@RestController
@RequestMapping("/")

public class ProductController {
	@Autowired
	private ProductService productService;
	@RequestMapping("/products")
	public ResponseEntity<Iterable<Product>> getAllProducts()
	{
		return ResponseEntity.ok(productService.getAllProduct());
	}
	@SuppressWarnings("unchecked")
	@GetMapping("/findById/{id}")
	public ResponseEntity<Product> findById(@PathVariable("id") Long id){
		
		return ResponseEntity.ok((productService).findById(id));
	}
	@GetMapping("/deleteproduct/{id}")
	public ResponseEntity<?> deleteProject(@PathVariable("id")Long id){
		productService.deleteProduct(id);
		return ResponseEntity.ok("deleted");
	}
	@PostMapping("/saveproduct")
	public ResponseEntity<CreateProductResponseModel> saveProduct(@RequestBody CreateProductRequestModel customerDetail){
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		ProductDto uDto=mapper.map(customerDetail, ProductDto.class);
		ProductDto tempDto=productService.saveProduct(uDto);
		CreateProductResponseModel model=mapper.map(tempDto, CreateProductResponseModel.class);;
		return ResponseEntity.status(HttpStatus.CREATED).body(model);

		
		}
}
