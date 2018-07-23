package com.training.jsonexample.customserializer;

import java.lang.reflect.Type;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class BooleanSerializer implements JsonSerializer<Boolean> {

	public JsonElement serialize(Boolean aBoolean, Type arg1, JsonSerializationContext arg2) {
		if (aBoolean) {
			return new JsonPrimitive(1);
		}
		return new JsonPrimitive(0);
	}
}
