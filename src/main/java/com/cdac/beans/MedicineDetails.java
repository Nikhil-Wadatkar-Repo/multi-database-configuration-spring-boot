package com.cdac.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medicine_details")
public class MedicineDetails {
	@Id
	private Integer medId;
	private String medicineName;
	private String medicineType;
	private Integer medicineQuantity;
	private String medicineExpiry;

	public MedicineDetails(Integer medId, String medicineName, String medicineType, Integer medicineQuantity,
			String medicineExpiry) {
		super();
		this.medId = medId;
		this.medicineName = medicineName;
		this.medicineType = medicineType;
		this.medicineQuantity = medicineQuantity;
		this.medicineExpiry = medicineExpiry;
	}

	public MedicineDetails() {
		super();
	}

	public Integer getMedId() {
		return medId;
	}

	public void setMedId(Integer medId) {
		this.medId = medId;
	}

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

	public String getMedicineExpiry() {
		return medicineExpiry;
	}

	public void setMedicineExpiry(String medicineExpiry) {
		this.medicineExpiry = medicineExpiry;
	}

	@Override
	public String toString() {
		return "MedicineDetails [medId=" + medId + ", medicineName=" + medicineName + ", medicineType=" + medicineType
				+ ", medicineQuantity=" + medicineQuantity + ", medicineExpiry=" + medicineExpiry + "]";
	}

}
