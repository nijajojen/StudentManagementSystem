package com.kgs.tech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kgs.tech.entity.VisaMst;

@Repository
public interface VisaMstRepository extends JpaRepository<VisaMst,Integer>{

}
