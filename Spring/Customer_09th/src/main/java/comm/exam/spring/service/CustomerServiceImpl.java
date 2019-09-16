package comm.exam.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comm.exam.spring.dao.CustomerDAO;
import comm.exam.spring.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO dao;
	public void createCustomer(Customer theCustomer) {
		dao.createCustomer(theCustomer);

	}
	@Transactional
	public List<Customer> getCustomers() {
		return dao.getCustomers();
	}
	public void deleteCustomers(int id) {
		// TODO Auto-generated method stub
		dao.deleteCustomers(id);
		
	}
	public Customer updateCustomers(int id) {
	 return dao.updateCustomers(id);
		
	}


}