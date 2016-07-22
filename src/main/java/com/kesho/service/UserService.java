package com.kesho.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kesho.daoInterface.UserDaoInterface;
import com.kesho.model.User;
import com.kesho.serviceInterface.UserServiceInterface;

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
	
/*	public List<User> getEmail() {
	return userdao.getEmail();
	}*/

}
