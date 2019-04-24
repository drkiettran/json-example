package com.drkiettran.json_example.stix2.types;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GranularMarking {
	@JsonProperty("marking_ref")
	private Identifier markingRef;
	
	@JsonProperty("selectors")
	private List<String> selectors;

	public Identifier getMarkingRef() {
		return markingRef;
	}

	public void setMarkingRef(Identifier markingRef) {
		this.markingRef = markingRef;
	}

	public List<String> getSelectors() {
		return selectors;
	}

	public void setSelectors(List<String> selectors) {
		this.selectors = selectors;
	}
	
	
}
