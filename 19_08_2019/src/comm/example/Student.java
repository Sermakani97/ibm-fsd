package comm.example;
import java.lang.String;
public class Student implements Comparable<Object> {
	private String FirstName;
	private String LastName;
	private double GPA;
	public Student(String fname,String lname,double gpa)
	{
		this.FirstName=fname;
		this.LastName=lname;
		this.GPA=gpa;
	}

	

	@Override
	public int compareTo(Object o) {
		Student student=(Student)o;
		if((this.getGPA()==student.getGPA()))
				{
			return 0;
				}
	else if((this.getGPA()>student.getGPA()))
		{
			return 1;
		}else
		// TODO Auto-generated method stub
		return -1;
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
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}

}
