package io.github.kavishkamk.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import io.github.kavishkamk.springdemo.mvc.validator.CourseCode;

public class Customer {
	
	@NotNull(message = "is required")
	@Size(min = 1, message = "required")
	private String firstName;
	
	@NotNull(message = "is required")
	@Size(min = 1, message = "required")
	private String lastName;
	
	@NotNull(message = "is required")
	@Min(value = 0, message = "Minimum number should be 0 or grager then it")
	@Max(value = 10, message = "Minimum number should be less than or equal 10")
	private Integer freePass;
	
	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 char digites")
	private String postalCode;
	
	@CourseCode(value = "TOPS", message = "Must start with TOPS")
	private String courseCode;
	
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
	public Integer getFreePass() {
		return freePass;
	}
	public void setFreePass(Integer freePass) {
		this.freePass = freePass;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
}
