package com.drkiettran.json_example.stix2.types;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Indicator extends StixObject {
	@JsonProperty("name")
	private String name;

	@JsonProperty("description")
	private String description;

	@JsonProperty("pattern")
	private String pattern;

	@JsonProperty("valid_from")
	private String validFrom;

	@JsonProperty("valid_until")
	private String validUntil;

	@JsonProperty("kill_chain_phases")
	private List<KillChainPhase> killChainPhases;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public String getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}

	public String getValidUntil() {
		return validUntil;
	}

	public void setValidUntil(String validUntil) {
		this.validUntil = validUntil;
	}

	public List<KillChainPhase> getKillChainPhases() {
		return killChainPhases;
	}

	public void setKillChainPhases(List<KillChainPhase> killChainPhases) {
		this.killChainPhases = killChainPhases;
	}
}
