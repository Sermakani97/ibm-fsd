package comm.exam.spring.service;

import java.util.List;

import comm.exam.spring.entity.Customer;

public interface CustomerService {
	public List<Customer>getCustomers();
public void createCustomer(Customer theCustomer);
public void deleteCustomers(int id);

public Customer updateCustomers(int id);
}
