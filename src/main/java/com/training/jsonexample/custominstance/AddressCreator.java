package com.training.jsonexample.custominstance;

import java.lang.reflect.Type;

import com.google.gson.InstanceCreator;
import com.training.jsonexample.bean.Address;

public class AddressCreator implements InstanceCreator<Address> {

	public Address createInstance(Type type) {
		// TODO Auto-generated method stub
		Address address = new Address();
		address.setCity("Pune");
		return address;
	}

}
