package com.training.jsonexample.versionbean;

import java.util.Arrays;

import com.google.gson.annotations.Since;

public class EmpVersion {
	@Since(1.0)
	private int id;
	
	@Since(1.0)
	private String firstName;
	
	@Since(2.0)
	private String lastName;
	
	@Since(1.0)
	private int age;
	
	@Since(1.0)
	private AddVersion address;
	
	@Since(2.0)
	private PhoneVersion[] phoneNumbers;
	
	@Since(3.0)
	private int salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public AddVersion getAddress() {
		return address;
	}
	public void setAddress(AddVersion address) {
		this.address = address;
	}
	public PhoneVersion[] getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(PhoneVersion[] phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("***** Employee Details *****\n");
		sb.append("ID="+getId()+"\n");
		sb.append("First Name="+getFirstName()+"\n");
		sb.append("Last Name="+getLastName()+"\n");
		sb.append("Phone Numbers="+Arrays.toString(getPhoneNumbers())+"\n");
		sb.append("Address="+getAddress()+"\n");
		sb.append("Salary="+getSalary()+"\n");
		sb.append("\n*****************************");
		
		return sb.toString();
	}
}
