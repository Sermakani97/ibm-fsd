package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("theEmployee")

public class Employee implements Address {
	//@Value("2")
	private int id;
	//@Value("serma")
	private String firstname;
	//@Value("kani")
	private String lastName;
	//@Value("ser@gg.com")
	private String email;
	private Address address;
//@Autowired
//public Employee(AddressImpl address)
//{
//	this.address=address;
//}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Employee()
	{
		super();
	}
	public Employee(int id,String firstName,String lastName,String email) {
		this.id=id;
		this.firstname=firstName;
		this.lastName=lastName;
		this.email=email;
	}
	public String getDetails()
	{
		return "id "+id+"Fistname"+firstname+"lastname"+lastName+"email"+email;
	}
	
	public void getInit()
	{
		System.out.println("welcome");
	}
	public void getDestroy()
	{
		System.out.println("Destroyed");
	}

	public String getAddress() {
		// TODO Auto-generated method stub
		return address.getAddress();
	}

}
