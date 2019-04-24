package com.drkiettran.json_example.stix2.types;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Bundle extends StixObject {
	@JsonProperty("spec_version")
	private String specVersion;

	@JsonProperty("objects")
	private List<StixObject> objects;

	public String getSpecVersion() {
		return specVersion;
	}

	public void setSpecVersion(String specVersion) {
		this.specVersion = specVersion;
	}

	public List<StixObject> getObjects() {
		return objects;
	}

	public void setObjects(List<StixObject> objects) {
		this.objects = objects;
	}

}
