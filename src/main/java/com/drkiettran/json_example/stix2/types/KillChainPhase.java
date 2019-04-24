package com.drkiettran.json_example.stix2.types;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KillChainPhase {
	@JsonProperty("kill_chain_name")
	private String killChainName;

	@JsonProperty("phase_name")
	private String phaseName;

	public String getKillChainName() {
		return killChainName;
	}

	public void setKillChainName(String killChainName) {
		this.killChainName = killChainName;
	}

	public String getPhaseName() {
		return phaseName;
	}

	public void setPhaseName(String phaseName) {
		this.phaseName = phaseName;
	}

}
