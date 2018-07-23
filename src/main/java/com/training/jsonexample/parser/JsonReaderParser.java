package com.training.jsonexample.parser;

import java.io.IOException;
import java.io.StringReader;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;

public class JsonReaderParser {
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
		try(JsonReader jsonReader = new JsonReader(new StringReader(json));) {
		    while(jsonReader.hasNext()){
		        JsonToken nextToken = jsonReader.peek();
		        System.out.println(nextToken);

		        if(JsonToken.BEGIN_OBJECT.equals(nextToken)){

		            jsonReader.beginObject();

		        } else if(JsonToken.NAME.equals(nextToken)){

		            String name  =  jsonReader.nextName();
		            System.out.println(name);

		        } else if(JsonToken.STRING.equals(nextToken)){

		            String value =  jsonReader.nextString();
		            System.out.println(value);

		        } else if(JsonToken.NUMBER.equals(nextToken)){

		            long value =  jsonReader.nextLong();
		            System.out.println(value);

		        }
		    }
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
}
