package comm.exam.spring;

import java.util.LinkedHashMap;

public class Student {
	private String FirstName;
	private String LastName;
	private String Country;
private LinkedHashMap<String, String> countryOptions;
	
	private String favoriteLanguage;
	private String[] operatingSystems;
	
	public String[] getOperatingSystems() {
		return operatingSystems;
	}
	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	public Student() {
		
		// populate country options: used ISO country code
		countryOptions = new LinkedHashMap<String,String>();
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United States of America");		

	}
	@Override
	public String toString() {
		return "Student [FirstName=" + FirstName + ", LastName=" + LastName +  "]";
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
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		this.Country = country;
	}
	
	public Student(String firstName,String lastName)
	{
		this.FirstName=firstName;
		this.LastName=lastName;
		//this.Email=Email;
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	

}
