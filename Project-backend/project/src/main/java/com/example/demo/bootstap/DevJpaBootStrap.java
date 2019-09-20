package com.example.demo.bootstap;
import java.util.UUID;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Category;
import com.example.demo.entity.Customer;
import com.example.demo.entity.Product;
import com.example.demo.entity.Seller;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.SellerRepository;
@Component
public class DevJpaBootStrap implements ApplicationListener<ContextRefreshedEvent> {
	private CustomerRepository customerRepository;
	private ProductRepository productRepository;
	private CategoryRepository categoryRepository;
	private SellerRepository sellerRepository;
	
	
	
public DevJpaBootStrap(CustomerRepository customerRepository, ProductRepository productRepository,
			CategoryRepository categoryRepository, SellerRepository sellerRepository) {
		super();
		this.customerRepository = customerRepository;
		this.productRepository = productRepository;
		this.categoryRepository = categoryRepository;
		this.sellerRepository = sellerRepository;
	}
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		init();
	}
	private void init() {
		// TODO Auto-generated method stub
		Customer cus = new Customer("vetri","ser@gg.com","vetri");
		cus.setCustomerId(UUID.randomUUID().toString());
		Customer cus1=new Customer(cus.getName(),cus.getEmail(),cus.getPassword(),cus.getCustomerId());

		Product prod = new Product("TV",30000,1,"Samsung");
		Category cat=new Category("Electronics","aaa");
		Seller sel=new Seller("saras","sar@gg.com","saras","chennai");
		productRepository.save(prod);
		customerRepository.save(cus);
		customerRepository.save(cus1);
		categoryRepository.save(cat);
		sellerRepository.save(sel);
		prod.getCustomers().add(cus);
		cus.getProducts().add(prod);
//		cat.getProducts().add(prod);
//		sel.getProducts().add(prod);
//	
		
	}

}
