package com.kesho.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kesho.daoInterface.UserDaoInterface;
import com.kesho.model.User;

@Repository
public class UserDao implements UserDaoInterface{

	@Autowired
    private SessionFactory sessionFactory;
	
/*	@Override
	public void userValidate(String email) {
		// TODO Auto-generated method stub
		//User user = (User) sessionFactory.getCurrentSession().load(User.class, email);
		System.out.println("m in DAO");
		//System.out.println("----------"+user);
	}*/
	
	@Override
	public List<User> validateUser(){
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		String hql = "From User";
		@SuppressWarnings("unchecked")
		List<User> users = (List<User>) session.createQuery(hql).list();
		tx.commit();
		session.close();
		return users;
	}

}
