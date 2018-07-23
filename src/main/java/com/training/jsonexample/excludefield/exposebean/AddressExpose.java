package com.training.jsonexample.excludefield.exposebean;

import com.google.gson.annotations.Expose;

public class AddressExpose {
	@Expose(serialize = true, deserialize = true)
	private String streetAddress;
	@Expose(serialize = true, deserialize = true)
	private String city;
	@Expose(serialize = true, deserialize = true)
	private String state;
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	private int zipcode;
	
	public String getstreetAddress() {
		return streetAddress;
	}
	public void setstreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
	@Override
	public String toString(){
		return getstreetAddress() + ", "+getCity()+", "+getZipcode();
	}
}
