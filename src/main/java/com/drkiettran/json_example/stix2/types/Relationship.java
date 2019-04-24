package com.drkiettran.json_example.stix2.types;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Relationship extends StixObject {
	@JsonProperty("relationship_type")
	private String relationshipType;

	@JsonProperty("description")
	private String description;

	@JsonProperty("source_ref")
	private String sourceRef;

	@JsonProperty("target_ref")
	private String targetRef;

	public String getRelationshipType() {
		return relationshipType;
	}

	public void setRelationshipType(String relationshipType) {
		this.relationshipType = relationshipType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSourceRef() {
		return sourceRef;
	}

	public void setSourceRef(String sourceRef) {
		this.sourceRef = sourceRef;
	}

	public String getTargetRef() {
		return targetRef;
	}

	public void setTargetRef(String targetRef) {
		this.targetRef = targetRef;
	}

}
