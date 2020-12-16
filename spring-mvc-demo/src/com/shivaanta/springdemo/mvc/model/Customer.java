package com.shivaanta.springdemo.mvc.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.shivaanta.springdemo.mvc.validation.CourseCode;

public class Customer {

	private String firstName;

	@NotNull(message = "is Required")
	@Size(min = 1, message = "is Required")
	private String lastName;
	
	@NotNull(message = "is Required")
	@Min(value = 0, message = "value must be grater then 0")
	@Max(value = 10, message = "value must be less then 10")
	private Integer freePasses;
	
	@NotNull(message = "is Required")
	@Pattern(regexp = "[a-zA-Z0-9]{5}", message = "Only 5 alphanumeric pattern allow")
	private String postalCode;
	
	@CourseCode(value = "ZXC", message = "Course code should start with ZXC")
	@NotNull(message = "is Required")
	private String courseCode;

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
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

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

}
