package com.drkiettran.json_example;

import java.io.IOException;
import java.util.Date;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

/**
 * An example on how to marshal and unmarshal a JSON object using Java
 * libraries.
 * 
 */
public class Main {
	public static void main(String... args) throws JsonParseException, JsonMappingException, IOException {
		Message msg = new Message();
		msg.setCreatedBy(new Date());
		msg.setMessage("Hello, world!");
		msg.setName("Sample Message");
		msg.setSerialNumber((long) (Math.random() * Long.MAX_VALUE));
		String json = msg.toString();
		System.out.println("Message in JSON format:\n" + json);

		Message msg2 = new Message(json);

		System.out.println("msg equals to msg2: " + msg.equals(msg2));
	}
}
