package comm.example;
import java.io.Serializable;
public class Person implements Serializable {
	private String fname;
	private String lname;
	public Person()
	{
		
	}
	public Person(String fname,String lname)
	{
		this.fname=fname;
		this.lname=lname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String toString()
	{
		return "lastname"+fname+"lastname"+lname;
	}
	public Person createMthd(String fname,String lname)throws MisMatchException
	{
		this.fname=fname;
		this.lname=lname;
		if(Character.isUpperCase(fname.charAt(0))&&(Character.isUpperCase(lname.charAt(0))))
		{ 
			return new Person(fname,lname);
	
		}
		throw new MisMatchException("mismatch");
		
	
		
	}
	
	
	

}
