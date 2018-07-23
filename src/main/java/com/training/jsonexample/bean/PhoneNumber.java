package com.training.jsonexample.bean;

public class PhoneNumber {
	private String type;
	private long number;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	
	@Override
	public String toString(){
		return getType() + ": "+getNumber();
	}
	
}
