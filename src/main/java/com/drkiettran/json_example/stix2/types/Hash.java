package com.drkiettran.json_example.stix2.types;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Hash {
	@JsonProperty("hashes")
	private String hashes;

	public String getHashes() {
		return hashes;
	}

	public void setHashes(String hashes) {
		this.hashes = hashes;
	}
}
