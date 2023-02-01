package com.cdac.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hospital_details")
public class HospitalDetails {
	@Id
	private Integer hospID;
	private String hospName;
	private Integer hospContact;

	public HospitalDetails(Integer hospID, String hospName, Integer hospContact) {
		super();
		this.hospID = hospID;
		this.hospName = hospName;
		this.hospContact = hospContact;
	}

	public HospitalDetails() {
		super();
	}

	public Integer getHospID() {
		return hospID;
	}

	public void setHospID(Integer hospID) {
		this.hospID = hospID;
	}

	public String getHospName() {
		return hospName;
	}

	public void setHospName(String hospName) {
		this.hospName = hospName;
	}

	public Integer getHospContact() {
		return hospContact;
	}

	public void setHospContact(Integer hospContact) {
		this.hospContact = hospContact;
	}

	@Override
	public String toString() {
		return "HospitalDetails [hospID=" + hospID + ", hospName=" + hospName + ", hospContact=" + hospContact + "]";
	}

}
