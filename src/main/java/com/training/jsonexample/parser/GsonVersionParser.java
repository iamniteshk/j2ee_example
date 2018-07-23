package com.training.jsonexample.parser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.training.jsonexample.versionbean.EmpVersion;

public class GsonVersionParser {
	static String json = "{"
			+ "\"id\": 10001,"
			+ "\"firstName\":\"Nitesh\","
			+ "\"lastName\": \"Thakur\","
			+ "\"age\": 27,"
			+ "\"address\":"
			+ "{"
			+ "\"streetAddress\": \"hoodi,whitefield\","
			+ "\"city\": \"Bengaluru\","
			+ "\"state\":\"Karnataka\","
			+ "\"zipcode\":560048"
			+ "},"
			+ "\"phoneNumbers\": "
			+ "["
			+ "{"
			+ "\"type\": \"home\","
			+ "\"number\": 9620300200"
			+ "},"
			+ "{"
			+ "\"type\": \"work\","
			+ "\"number\": 1234567890"
			+ "}"
			+ "],"
			+ "\"salary\": 40000"
			+ "}";

public static void main(String[] args) {
	
	System.out.println("Second way of GSON initalization");
	
	GsonBuilder builder = new GsonBuilder();
	builder.setVersion(1.0);
	Gson gson1 = builder.create();
	//Parsing json into Employee Object
	EmpVersion emp1 = gson1.fromJson(json, EmpVersion.class);
	System.out.println(emp1);
	System.out.println("****************");
	//Generating JSON from Employee Object
	String mJson1 = gson1.toJson(emp1);
	System.out.println(mJson1);	
	System.out.println("****************");
	
	System.out.println("Pretty printing in Second way of GSON initalization");
	
	GsonBuilder builder1 = new GsonBuilder();
	builder1.setVersion(2.0);
	Gson gson2 = builder1.setPrettyPrinting().create();
	//Parsing json into Employee Object
	EmpVersion emp2 = gson2.fromJson(json, EmpVersion.class);
	System.out.println(emp2);
	System.out.println("****************");
	//Generating JSON from Employee Object
	String mJson2 = gson2.toJson(emp2);
	System.out.println(mJson2);	
	System.out.println("****************");
}
}
