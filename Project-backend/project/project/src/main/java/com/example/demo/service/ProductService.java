package com.example.demo.service;

import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Product;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.ProductRepository;
import com.example.demo.shared.CustomerDto;
import com.example.demo.shared.ProductDto;
@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	public List<Product> getAllProduct()
	{
		return (List<Product>)productRepository.findAll();
	}
	public Product findById(Long id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id).get();
	}
	public void deleteProduct(Long id) {
		// TODO Auto-generated method stub
	        productRepository.deleteById(id);
	}

	public ProductDto saveProduct(ProductDto customerDetail) {
		// TODO Auto-generated method stub
		
		
	//	customerDetail.setProductId(UUID.randomUUID().toString());
		
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		Product product=mapper.map(customerDetail, Product.class);
		productRepository.save(product);
		ProductDto cDto=mapper.map(product, ProductDto.class);
		return cDto;
		}

}
