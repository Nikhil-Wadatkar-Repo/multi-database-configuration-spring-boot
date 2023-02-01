package com.cdac.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.beans.UserDetails;
import com.cdac.repo.UserRepository;

@Service
public class UserServiceImpl implements UserServiceI {

	@Autowired
	private UserRepository repo;

	@Override
	public UserDetails createUser(UserDetails user) {
		return repo.save(user);
	}

	@Override
	public UserDetails updateUserByID(Integer userID) {
		UserDetails existedUser = null;
		// get user based on ID
		Optional<UserDetails> findById = repo.findById(userID);
		// check whether we get object from DB or not
		if (findById.isPresent()) {
			existedUser = findById.get();
			// update each property except userID
			existedUser.setAge(22);
//			existedUser.setCity("Pune");
//			existedUser.setUserName("John");
			repo.save(existedUser);

		} else
			existedUser = null;

		return existedUser;
	}

	@Override
	public UserDetails updateUserWithDynamicValues(UserDetails newUser) {
		// get existed user from DB
		UserDetails existedUser = null;
		// get user based on ID
		Optional<UserDetails> findById = repo.findById(newUser.getUserID());
		// check whether we get object from DB or not
		if (findById.isPresent()) {
			existedUser = findById.get();
			// update each property except userID
			existedUser.setAge(newUser.getAge());
//			existedUser.setCity(newUser.getCity());
//			existedUser.setUserName(newUser.getUserName());
			repo.save(existedUser);
		}
		return existedUser;
	}

	@Override
	public String deleteUserbyID(Integer userID) {
		String message = null;
		boolean flag = false;
		// check whether it is present or not
		UserDetails existedUser = null;
		// get user based on ID
		Optional<UserDetails> findById = repo.findById(userID);

		// check whether we get object from DB or not
		if (findById.isPresent()) {
			flag = true; // if user is present
			// delete user
			repo.deleteById(userID);
		} else
			flag = false;// if user is not present

		// based on flag , send success or error message
		if (flag == true)
			message = "User is deleted Successfully";
		else
			message = "User not Found";
		return message;
	}

	@Override
	public UserDetails getUserByID(Integer userID) {
		// check whether it is present or not
		UserDetails existedUser = null;
		// get user based on ID
		Optional<UserDetails> findById = repo.findById(userID);

		// check whether we get object from DB or not
		if (findById.isPresent()) {
			existedUser = findById.get();
		} else
			existedUser = null;
		return existedUser;
	}

	@Override
	public List<UserDetails> getAllUser() {
		List<UserDetails> allUsers = repo.findAll();
		if (allUsers.size() > 0)
			return allUsers;
		else
			return null;
	}

}
