package com.cdac.controller;

import java.io.Serializable;

public class LoginResponse implements Serializable {
	private String mail;
	private String password;
	private String role;
	private String message;
	private Integer id;

	public LoginResponse(String mail, String password, String role, String message, Integer id) {
		super();
		this.mail = mail;
		this.password = password;
		this.role = role;
		this.message = message;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LoginResponse() {
		super();
	}

	@Override
	public String toString() {
		return "LoginResponse [mail=" + mail + ", password=" + password + ", role=" + role + ", message=" + message
				+ ", id=" + id + "]";
	}

}
