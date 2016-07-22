package com.kesho.serviceInterface;

import java.util.List;

import com.kesho.model.User;

public interface UserServiceInterface {

	//public void userValidate(String email);
	public List<User> validateUser();
}
