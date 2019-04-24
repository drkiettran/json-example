package com.drkiettran.json_example.stix2.types;

import java.sql.Timestamp;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StixObject {
	@JsonProperty("type")
	private String type;

	@JsonProperty("id")
	private Identifier id;

	@JsonProperty("create_by_ref")
	private String createByRef;

	@JsonProperty("created")
	private Timestamp created;

	@JsonProperty("modified")
	private Timestamp modified;

	@JsonProperty("revoked")
	private boolean revoked;

	@JsonProperty("labels")
	private List<String> labels;

	@JsonProperty("external_references")
	private List<ExternalReference> externalReferences;

	@JsonProperty("object_marking_refs")
	private List<Identifier> objectMarkingReferences;

	@JsonProperty("granular_markings")
	private List<GranularMarking> granularMarkings;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Identifier getId() {
		return id;
	}

	public void setId(Identifier id) {
		this.id = id;
	}

	public String getCreateByRef() {
		return createByRef;
	}

	public void setCreateByRef(String createByRef) {
		this.createByRef = createByRef;
	}

	public Timestamp getCreated() {
		return created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public Timestamp getModified() {
		return modified;
	}

	public void setModified(Timestamp modified) {
		this.modified = modified;
	}

	public boolean isRevoked() {
		return revoked;
	}

	public void setRevoked(boolean revoked) {
		this.revoked = revoked;
	}

	public List<String> getLabels() {
		return labels;
	}

	public void setLabels(List<String> labels) {
		this.labels = labels;
	}

	public List<ExternalReference> getExternalReferences() {
		return externalReferences;
	}

	public void setExternalReferences(List<ExternalReference> externalReferences) {
		this.externalReferences = externalReferences;
	}

	public List<Identifier> getObjectMarkingReferences() {
		return objectMarkingReferences;
	}

	public void setObjectMarkingReferences(List<Identifier> objectMarkingReferences) {
		this.objectMarkingReferences = objectMarkingReferences;
	}

	public List<GranularMarking> getGranularMarkings() {
		return granularMarkings;
	}

	public void setGranularMarkings(List<GranularMarking> granularMarkings) {
		this.granularMarkings = granularMarkings;
	}

}
