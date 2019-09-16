package comm.exam.spring.dao;

import java.util.List;

import javax.annotation.PostConstruct;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import comm.exam.spring.entity.Customer;



@Repository

public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;
	private Session session;
	public CustomerDAOImpl() {
		super();
	}
	@PostConstruct
	public void createSession()
	{
		session=sessionFactory.openSession();
	}
	

	public CustomerDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}


	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Transactional
	public void createCustomer(Customer theCustomer) {
		
		session.saveOrUpdate(theCustomer);
	}
	@Transactional
	public List<Customer> getCustomers() {
			// get the current hibernate session
			Session currentSession = sessionFactory.getCurrentSession();
			// create a query ... sort by last name
			Query<Customer> theQuery = currentSession.createQuery("from Customer order by lastName", Customer.class);

			// execute query and get result list
			List<Customer> customers = theQuery.getResultList();

			// return the results
			return customers;}
	@Transactional
	public void deleteCustomers(int id) {
		// TODO Auto-generated method stub
		Customer customer=(Customer) sessionFactory.getCurrentSession().load(Customer.class, id);
		this.sessionFactory.getCurrentSession().delete(customer);	
	}
	public Customer updateCustomers(int id) {
		Customer customer=(Customer) sessionFactory.getCurrentSession().load(Customer.class, id);
		 this.sessionFactory.getCurrentSession().update(customer);
	
	}
		
	}
	
	
	

