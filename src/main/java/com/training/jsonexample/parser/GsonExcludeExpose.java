package com.training.jsonexample.parser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.training.jsonexample.excludefield.exposebean.EmployeeExpose;

public class GsonExcludeExpose {
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
	// TODO Auto-generated method stub
	System.out.println(json);
	System.out.println("First way of GSON initalization");
	
	Gson gson = new Gson();
	//Parsing json into EmployeeExpose Object
	EmployeeExpose emp = gson.fromJson(json, EmployeeExpose.class);
	System.out.println(emp);
	System.out.println("****************");
	//Generating JSON from EmployeeExpose Object
	String mJson = gson.toJson(emp);
	System.out.println(mJson);	
	System.out.println("****************");
	
	System.out.println("Second way of GSON initalization");
	
	GsonBuilder builder = new GsonBuilder().excludeFieldsWithoutExposeAnnotation();
	Gson gson1 = builder.create();
	//Parsing json into EmployeeExpose Object
	EmployeeExpose emp1 = gson1.fromJson(json, EmployeeExpose.class);
	System.out.println(emp1);
	System.out.println("****************");
	//Generating JSON from EmployeeExpose Object
	String mJson1 = gson1.toJson(emp1);
	System.out.println(mJson1);	
	System.out.println("****************");
	
	System.out.println("Pretty printing in Second way of GSON initalization");
	
	Gson gson2 = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create();
	//Parsing json into EmployeeExpose Object
	EmployeeExpose emp2 = gson2.fromJson(json, EmployeeExpose.class);
	System.out.println(emp2);
	System.out.println("****************");
	//Generating JSON from EmployeeExpose Object
	String mJson2 = gson2.toJson(emp2);
	System.out.println(mJson2);	
	System.out.println("****************");
}
}
