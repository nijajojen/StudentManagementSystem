package com.kgs.tech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kgs.tech.entity.StatusMst;

@Repository
public interface StatusMstRepository extends JpaRepository<StatusMst,Integer>{

}
