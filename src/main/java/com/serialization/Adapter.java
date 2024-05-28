package com.serialization;

import com.google.gson.*;

import java.lang.reflect.Type;

public class Adapter implements JsonSerializer<Person<?>> {
  @Override
  public JsonElement serialize(Person<?> src, Type typeOfSrc, JsonSerializationContext context) {
    return switch (src.getName()) {
      case "Andy" -> context.serialize(src, Andy.class);
      case "Joe" -> context.serialize(src, Joe.class);
      default -> throw new JsonParseException("Unknown type: " + typeOfSrc);
    };
  }
}
