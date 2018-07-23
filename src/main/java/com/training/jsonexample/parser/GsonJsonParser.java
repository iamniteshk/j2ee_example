package com.training.jsonexample.parser;

import java.util.Iterator;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class GsonJsonParser {
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
		JsonParser parser = new JsonParser();
		JsonElement tree = parser.parse(json);
		
		if(tree.isJsonObject()) {
			JsonObject object = tree.getAsJsonObject();
			
			JsonElement e1 = object.get("id");
			int id = e1.getAsInt();
			System.out.println("id: " + id);
			
			JsonElement e2 = object.get("firstName");
			String firstName = e2.getAsString();
			System.out.println("firstName: " + firstName);
			
			JsonElement e3 = object.get("lastName");
			String lastName = e3.getAsString();
			System.out.println("lastName: " + lastName);
			
			JsonElement e4 = object.get("age");
			int age = e4.getAsInt();
			System.out.println("age: " + age);
			
			JsonObject o5 = object.get("address").getAsJsonObject();
			System.out.println("address: ");
			
			JsonElement e5 = o5.get("streetAddress");
			String streetAddress = e5.getAsString();
			System.out.println("\tstreetAddress: " + streetAddress);
			
			JsonElement e6 = o5.get("city");
			String city = e6.getAsString();
			System.out.println("\tcity: " + city);
			
			JsonElement e7 = o5.get("state");
			String state = e7.getAsString();
			System.out.println("\tstate: " + state);
			
			JsonElement e8 = o5.get("zipcode");
			int zipcode = e8.getAsInt();
			System.out.println("\tzipcode: " + zipcode);
			
			System.out.println("phoneNumbers: ");
			JsonArray a9 = object.get("phoneNumbers").getAsJsonArray();
			Iterator<JsonElement> itr = a9.iterator();
			while(itr.hasNext()) {
				JsonObject o9 = (JsonObject) itr.next();
				if(o9.has("type")) {
					JsonElement e9 = o9.get("type");
					String type = e9.getAsString();
					System.out.println("\ttype: " + type);
				}
				if(o9.has("number")) {
					JsonElement e10 = o9.get("number");
					long number = e10.getAsLong();
					System.out.println("\tnumber: " + number);
				}
			}

			JsonElement e11 = object.get("salary");
			int salary = e11.getAsInt();
			System.out.println("salary: " + salary);
		}
	}
}
