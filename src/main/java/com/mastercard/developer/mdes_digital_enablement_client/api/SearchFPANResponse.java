package com.mastercard.developer.mdes_digital_enablement_client.api;

public class SearchFPANResponse {

	private String pan;
	private String status;

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "SearchFPANResponse [pan=" + pan + ", status=" + status + "]";
	}

}
