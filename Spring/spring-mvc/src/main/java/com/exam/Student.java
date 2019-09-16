package com.exam;

public class Student {
	private String FirstName;
	private String LastName;
	private String Email;
	@Override
	public String toString() {
		return "Student [FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email + "]";
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Student(String firstName,String lastName,String Email)
	{
		this.FirstName=firstName;
		this.LastName=lastName;
		this.Email=Email;
	}
	

}
