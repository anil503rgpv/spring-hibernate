package com.shivaanta.springdemo.mvc.model;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;

	private String country;

	private LinkedHashMap<String, String> countryOption;
	
	private String[] operatingSystem;

	public String[] getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	private String favoriteLanguage;

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public Student() {
		countryOption = new LinkedHashMap<>();

		countryOption.put("IN", "India");
		countryOption.put("USA", "America");
		countryOption.put("BR", "Brazil");
		countryOption.put("DE", "Germany");
		countryOption.put("FR", "France");
	}

	public LinkedHashMap<String, String> getCountryOption() {
		return countryOption;
	}

	public void setCountryOption(LinkedHashMap<String, String> countryOption) {
		this.countryOption = countryOption;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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

}
