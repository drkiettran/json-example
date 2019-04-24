package com.drkiettran.json_example.stix2.types;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExternalReference {
	@JsonProperty("source_name")
	private String sourceName;

	@JsonProperty("description")
	private String description;

	@JsonProperty("url")
	private String url;

	@JsonProperty("hashes")
	private Hash hashes;

	@JsonProperty("external_id")
	private String externalId;

	public String getSourceName() {
		return sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Hash getHashes() {
		return hashes;
	}

	public void setHashes(Hash hashes) {
		this.hashes = hashes;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

}
