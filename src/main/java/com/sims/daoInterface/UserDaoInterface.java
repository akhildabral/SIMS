package com.sims.daoInterface;

import java.util.List;

import com.sims.model.Subject;
import com.sims.model.User;

public interface UserDaoInterface {
	
	public List<User> validateUser();
	public List<User> currentUser(int id);
	public List subjectMarks(int userId, int testId);

	//public List<User> getEmail();

}
