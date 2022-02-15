package com.kgs.tech.repository;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kgs.tech.entity.User;


public class UserDaoImpl implements UserDao{
	
	/*@Autowired
    private SessionFactory sessionFactory;


	@Override
	public User findByUsernameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
        Session session = sessionFactory.getCurrentSession();
        
        Query query =  session.createQuery("from User where username = :param1 and password = :param2");
        query.setParameter("param1", username);
        query.setParameter("param2", password);
        
        return (User) query.getSingleResult();
        
        
	}*/

	
}
