package com.cdac.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "raise_request_rab")
public class RaiseRequest {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer raiseRequestmedId;
//	private Integer medId;
//	private Integer requesterID;
	private String medicineName;
	private String medicineType;
	private Integer medicineQuantity;
//	private String medicineExpiry;
	private String role;
	private String status;

	public RaiseRequest() {
		
	}
	public RaiseRequest(Integer medId, String medicineName, String medicineType,
			Integer medicineQuantity, String medicineExpiry, String role, String status) {
		super();
		
//		this.medId = medId;
		this.medicineName = medicineName;
		this.medicineType = medicineType;
		this.medicineQuantity = medicineQuantity;
//		this.medicineExpiry = medicineExpiry;
		this.role = role;
		this.status = status;
	}
	
	public Integer getRaiseRequestmedId() {
		return raiseRequestmedId;
	}

	public void setRaiseRequestmedId(Integer raiseRequestmedId) {
		this.raiseRequestmedId = raiseRequestmedId;
	}

//	public Integer getMedId() {
//		return medId;
//	}
//
//	public void setMedId(Integer medId) {
//		this.medId = medId;
//	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public String getMedicineType() {
		return medicineType;
	}

	public void setMedicineType(String medicineType) {
		this.medicineType = medicineType;
	}

	public Integer getMedicineQuantity() {
		return medicineQuantity;
	}

	public void setMedicineQuantity(Integer medicineQuantity) {
		this.medicineQuantity = medicineQuantity;
	}

//	public String getMedicineExpiry() {
//		return medicineExpiry;
//	}
//
//	public void setMedicineExpiry(String medicineExpiry) {
//		this.medicineExpiry = medicineExpiry;
//	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "RaiseRequest [raiseRequestmedId=" + raiseRequestmedId + ", medicineName=" + medicineName
				+ ", medicineType=" + medicineType + ", medicineQuantity=" + medicineQuantity + ", role=" + role
				+ ", status=" + status + "]";
	}
	

	
}
