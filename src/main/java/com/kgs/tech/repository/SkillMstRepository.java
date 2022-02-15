package com.kgs.tech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kgs.tech.entity.SkillMst;

@Repository
public interface SkillMstRepository extends JpaRepository<SkillMst,Integer>{

}
