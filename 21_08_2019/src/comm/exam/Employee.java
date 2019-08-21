package comm.exam;

import java.util.Date;

public class Employee  implements Comparable<Object> {
private int id;
private String name;
private String dept;
private String doj;
private int age;
private int salary;
public Employee()
{
	super();
}
public Employee(int id,String name,String dept,String doj,int age,int salary)
{
	this.setId(id);
	this.setName(name);
	this.setDept(dept);
	this.setDoj(doj);
	this.setAge(age);
	this.setSalary(salary);
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getDoj() {
	return doj;
}
public void setDoj(String doj) {
	this.doj = doj;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public int compareTo(Object e) {
	Employee employee=(Employee)e;
	if((this.getSalary()==employee.getSalary()))
	{
return 0;
	}
else if((this.getSalary()>employee.getSalary()))
{
return 1;
}else
return -1;

}
public String toString()
{
	return "id"+id+"name"+name+"dept"+dept+"doj"+doj+"age"+age+"salary"+salary;
	
}
}
