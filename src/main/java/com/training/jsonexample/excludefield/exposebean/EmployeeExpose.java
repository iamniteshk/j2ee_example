package com.training.jsonexample.excludefield.exposebean;

import java.util.Arrays;

import com.google.gson.annotations.Expose;

public class EmployeeExpose {
	
	@Expose(serialize = true, deserialize = true)
	private int id;
	
	@Expose(serialize = true, deserialize = true)
	private String firstName;
	
	@Expose(serialize = true, deserialize = true)
	private String lastName;
	
	@Expose(serialize = true, deserialize = true)
	private int age;
	
	@Expose(serialize = true, deserialize = true)
	private AddressExpose address;
	
	@Expose(serialize = true, deserialize = true)
	private PhoneExpose[] phoneNumbers;
	
	@Expose(serialize = false, deserialize = false)
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
	public AddressExpose getAddress() {
		return address;
	}
	public void setAddress(AddressExpose address) {
		this.address = address;
	}
	public PhoneExpose[] getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(PhoneExpose[] phoneNumbers) {
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
		sb.append("Age="+getAge()+"\n");
		sb.append("Phone Numbers="+Arrays.toString(getPhoneNumbers())+"\n");
		sb.append("Address="+getAddress()+"\n");
		sb.append("Salary="+getSalary()+"\n");
		sb.append("\n*****************************");
		
		return sb.toString();
	}
}
