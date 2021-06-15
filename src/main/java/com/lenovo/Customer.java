package com.lenovo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	
	private String firstName;
	
	@NotNull(message = "is Required")
	@Size(min=1,message = "Enter valid last name")
	private String lastName;
	
	@Min(value = 0,message ="must be greater than or equal to 0")
	@Max(value = 10,message = "must be less than or equal to 10")
	private int freepases;
	
	@Pattern(regexp = "^[a-zA-Z0-9]{5}",message = "only 5 char or digit")
	private String postalCode;
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public int getFreepases() {
		return freepases;
	}
	public void setFreepases(int freepases) {
		this.freepases = freepases;
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
