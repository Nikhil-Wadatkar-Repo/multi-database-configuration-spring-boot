package com.cdac.beans;

public class UpdateRaiseRequestResponse {
	private Integer id;
	private String changedStatus;
	private String responseMessage;

	public UpdateRaiseRequestResponse() {
		// TODO Auto-generated constructor stub
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getChangedStatus() {
		return changedStatus;
	}

	public void setChangedStatus(String changedStatus) {
		this.changedStatus = changedStatus;
	}

	public UpdateRaiseRequestResponse(Integer id, String changedStatus, String responseMessage) {
		super();
		this.id = id;
		this.changedStatus = changedStatus;
		this.responseMessage = responseMessage;
	}

	@Override
	public String toString() {
		return "UpdateRaiseRequestBean [id=" + id + ", changedStatus=" + changedStatus + "]";
	}

}
