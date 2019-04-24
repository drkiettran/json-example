package com.drkiettran.json_example;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Message exchange class.
 * 
 * @author ktran
 *
 */
public class Message implements Serializable {
	private static final long serialVersionUID = 2120914098830910225L;

	@JsonProperty("name")
	private String name;

	@JsonProperty("message")
	private String message;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm a z")
	private Date createdBy;

	@JsonProperty("serial-number")
	private long serialNumber;

	public Message(String json) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper om = new ObjectMapper();
		Message msg = om.readValue(json, Message.class);
		this.createdBy = msg.getCreatedBy();
		this.message = msg.getMessage();
		this.name = msg.getName();
		this.serialNumber = msg.getSerialNumber();
	}

	public Message() {

	}

	public Date getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Date createdBy) {
		this.createdBy = createdBy;
	}

	public long getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(long serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private static final Logger LOGGER = LoggerFactory.getLogger(Message.class);

	public String toString() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			LOGGER.error("Error: {}", e);
		}
		return "Marhsaling error";
	}

	public boolean equals(Message target) {
		if (!target.message.equals(message) || !target.name.equals(name) || target.serialNumber != serialNumber
				|| target.createdBy.getTime() == createdBy.getTime()) {
			return false;
		}
		return true;
	}
}