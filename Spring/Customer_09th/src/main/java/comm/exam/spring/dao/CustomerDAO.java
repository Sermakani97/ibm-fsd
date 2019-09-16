package comm.exam.spring.dao;

import java.util.List;

import comm.exam.spring.entity.Customer;

public interface CustomerDAO {
	public List<Customer> getCustomers();
	public void deleteCustomers(int id);
	public Customer updateCustomers(int id);

public void createCustomer(Customer theCustomer);
}
