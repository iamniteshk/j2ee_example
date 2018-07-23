package com.training.jsonexample.customserializer;

import java.util.Arrays;

import com.training.jsonexample.bean.Address;
import com.training.jsonexample.bean.PhoneNumber;

public class EmployeeCustom {
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private Address address;
	private PhoneNumber[] phoneNumbers;
	private int salary;
	private boolean isActive;
	
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public PhoneNumber[] getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(PhoneNumber[] phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public boolean isActive() {
		return isActive;
	}
	
	public void setActive(boolean isActive) {
		this.isActive = isActive;
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
		sb.append("Active="+isActive()+"\n");
		sb.append("\n*****************************");
		
		return sb.toString();
	}
}
