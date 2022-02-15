package com.kgs.tech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kgs.tech.entity.SkillMst;
import com.kgs.tech.entity.SourceMst;

@Repository
public interface SourceMstRepository extends JpaRepository<SourceMst,Integer>{

}
