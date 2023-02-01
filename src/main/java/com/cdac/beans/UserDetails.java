package com.cdac.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_details_tab1")
public class UserDetails {
	@Id
	@Column(name = "userID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userID;
	private String fullName;
	private String mail;
	private String userAddress;
	private String password;
	private String gender;
	private Long contact;
	private Integer age;
	private String bloodGroup;
	private String role;
	private String yearOfEst;
	private String regNo;
	private String memberName;

	// shift+alt+O => constructor
	public UserDetails() {
		super();
	}

	// shift+alt+S, O => constructor

	public UserDetails(Integer userID, String fullName, String mail, String userAddress, String password, String gender,
			Long contact, Integer age, String bloodGroup, String role) {
		super();
		this.userID = userID;
		this.fullName = fullName;
		this.mail = mail;
		this.userAddress = userAddress;
		this.password = password;
		this.gender = gender;
		this.contact = contact;
		this.age = age;
		this.bloodGroup = bloodGroup;
		this.role = role;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	

	public String getYearOfEst() {
		return yearOfEst;
	}

	public void setYearOfEst(String yearOfEst) {
		this.yearOfEst = yearOfEst;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "UserDetails [userID=" + userID + ", fullName=" + fullName + ", mail=" + mail + ", userAddress="
				+ userAddress + ", password=" + password + ", gender=" + gender + ", contact=" + contact + ", age="
				+ age + ", bloodGroup=" + bloodGroup + ", role=" + role + "]";
	}

}