package com.cdac.beans;

public class UpdateRaiseRequestBean {
	private Integer id;
	private String changedStatus;

	public UpdateRaiseRequestBean() {
		// TODO Auto-generated constructor stub
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

	public UpdateRaiseRequestBean(Integer id, String changedStatus) {
		super();
		this.id = id;
		this.changedStatus = changedStatus;
	}

	@Override
	public String toString() {
		return "UpdateRaiseRequestBean [id=" + id + ", changedStatus=" + changedStatus + "]";
	}

}
