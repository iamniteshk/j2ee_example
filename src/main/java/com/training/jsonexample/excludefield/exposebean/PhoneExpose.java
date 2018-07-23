package com.training.jsonexample.excludefield.exposebean;

import com.google.gson.annotations.Expose;

public class PhoneExpose {
	@Expose(serialize = true, deserialize = true)
	private String type;
	@Expose(serialize = true, deserialize = true)
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
