package com.kgs.tech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kgs.tech.entity.User;
import java.lang.String;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

	@Query("from User where username = ?1 and password = ?2")
	User findByUsernameAndPassword(String username, String password);
	
	@Query("from User where username = ?1")
	User findByUsername(String username);

}
