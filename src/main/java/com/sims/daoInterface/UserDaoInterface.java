package com.sims.daoInterface;

import java.util.List;

import com.sims.model.User;

public interface UserDaoInterface {
	
	public List<User> validateUser();
	public List<User> currentUser(int id);

	//public List<User> getEmail();

}
