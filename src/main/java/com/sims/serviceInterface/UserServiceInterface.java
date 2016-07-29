package com.sims.serviceInterface;

import java.util.List;

import com.sims.model.User;

public interface UserServiceInterface {

	//public void userValidate(String email);
	public List<User> validateUser();
	public List<User> currentUser(int id);
}
