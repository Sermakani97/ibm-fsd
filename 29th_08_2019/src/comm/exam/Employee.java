package comm.exam;

public class Employee {
private String name,address;
private int salary;
public Employee()
{
	super();
}
public Employee(String name,String adress,int salary)
{
	this.name=name;
	this.address=address;
	this.salary=salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
}
