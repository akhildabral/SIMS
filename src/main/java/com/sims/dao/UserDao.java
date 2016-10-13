package com.sims.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sims.daoInterface.UserDaoInterface;
import com.sims.model.User;

@Repository
public class UserDao implements UserDaoInterface {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<User> validateUser() {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		String hql = "From User";
		@SuppressWarnings("unchecked")
		List<User> users = (List<User>) session.createQuery(hql).list();
		tx.commit();
		session.close();
		return users;
	}

	@Override
	public List<User> currentUser(int id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		String hql = "From User where userId=" + id;
		@SuppressWarnings("unchecked")
		List<User> currentUser = (List<User>) session.createQuery(hql).list();
		tx.commit();
		session.close();
		return currentUser;
	}

	@SuppressWarnings({ "unchecked"})
	@Override
	public List<Object[]> subjectMarks(int userId, int testId) {
	    	  Session session = sessionFactory.openSession();
	          String sql = "select subjectId, marks FROM student_test where userId="+userId+" AND testId="+testId;
	          SQLQuery query = session.createSQLQuery(sql);
	          query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
	          List<Object[]> result = query.list();
	return result;
}}
