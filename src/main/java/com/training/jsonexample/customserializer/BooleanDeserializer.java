package com.training.jsonexample.customserializer;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

public class BooleanDeserializer implements JsonDeserializer<Boolean> {

    public Boolean deserialize(JsonElement jsonElement, Type type,
    JsonDeserializationContext jsonDeserializationContext)
    throws JsonParseException {

        return jsonElement.getAsInt() == 0 ? false : true;
    }
}
