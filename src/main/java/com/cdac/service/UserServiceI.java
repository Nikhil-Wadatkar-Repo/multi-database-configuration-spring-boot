package com.cdac.service;

import java.util.List;

import com.cdac.beans.UserDetails;

public interface UserServiceI {

	public UserDetails createUser(UserDetails user);
	public UserDetails updateUserWithDynamicValues(UserDetails user);

	public UserDetails updateUserByID(Integer userID);

	public String deleteUserbyID(Integer userID);

	public UserDetails getUserByID(Integer userID);

	public List<UserDetails> getAllUser();

}
