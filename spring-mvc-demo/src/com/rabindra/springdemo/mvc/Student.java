package com.rabindra.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private String[] favoriteLang;
//	private String sex;
	
//	private LinkedHashMap<String, String> sexOptions;
	

//	public LinkedHashMap<String, String> getSexOptions() {
//		return sexOptions;
//	}
//	public  Student(){
//		//populate country options
//		sexOptions = new LinkedHashMap<>();
//		sexOptions.put("Male", "Male");
//		sexOptions.put("Female", "Female");
//		
//	}

	public String[] getFavoriteLang() {
		return favoriteLang;
	}


	public void setFavoriteLang(String[] favoriteLang) {
		this.favoriteLang = favoriteLang;
	}

	private LinkedHashMap<String, String> countryOptions;
	
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	
	
	public Student(){
		//populate country options
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("IN", "India");
		countryOptions.put("FR", "France");
		countryOptions.put("NE", "Nepal");
		countryOptions.put("USA", "United States of America");
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
	
//	public String getSex() {
//		return sex;
//	}

//	public void setSex(String sex) {
//		this.sex = sex;
//	}
	
}
