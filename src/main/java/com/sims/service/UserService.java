package com.sims.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sims.daoInterface.UserDaoInterface;
import com.sims.model.User;
import com.sims.serviceInterface.UserServiceInterface;

@Service()
public class UserService implements UserServiceInterface {
	
	@Autowired(required=true)
	private UserDaoInterface userdao;

	@Override
	@Transactional
	public List<User> validateUser() {
		// TODO Auto-generated method stub
		return userdao.validateUser();
	}
	
	@Autowired(required=true)
	public void setUserDao(UserDaoInterface userDao) {
		this.userdao = userDao;
	}
	
	@Override
	@Transactional
	public List<User> currentUser(int id) {
		// TODO Auto-generated method stub
		return userdao.currentUser(id);
	}

}
