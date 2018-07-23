package com.training.jsonexample.versionbean;

import com.google.gson.annotations.Since;

public class PhoneVersion {
	
	@Since(2.0)
	private String type;
	
	@Since(1.0)
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
