package com.drkiettran.json_example.stix2.types;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Identifier {
	@JsonProperty
	private String id;

	private String getIdentifier(String type) {
		StringBuilder sb = new StringBuilder(type);
		sb.append("--");
		sb.append(UUID.randomUUID().toString().toLowerCase());
		return sb.toString();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Identifier(String id) {
		this.id = id;
	}

}
