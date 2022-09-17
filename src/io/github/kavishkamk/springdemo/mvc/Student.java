package io.github.kavishkamk.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private String favLanguage;
	private String[] osType;
	private LinkedHashMap<String, String> countryOptions;
	
	public Student() {
		this.countryOptions = new LinkedHashMap<>();
		
		this.countryOptions.put("A", "America");
		this.countryOptions.put("B", "Australia");
		this.countryOptions.put("C", "Caneda");
		this.countryOptions.put("D", "Newseland");
		this.countryOptions.put("E", "Sri Lanka");
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFavLanguage() {
		return favLanguage;
	}
	public void setFavLanguage(String favLanguage) {
		this.favLanguage = favLanguage;
	}
	public String[] getOsType() {
		return osType;
	}
	public void setOsType(String[] osType) {
		this.osType = osType;
	}
	
}
