package com.kgs.tech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kgs.tech.entity.Recruitment;
import com.kgs.tech.entity.RecruitmentHistory;

@Repository
public interface RecruitmentHistoryRepository extends JpaRepository<RecruitmentHistory, Integer>{

	@Query("from RecruitmentHistory as T1 where T1.recruitment.id = ?1")
	List<RecruitmentHistory> findRecruitmentHistoryByRecruitmentId(Integer id);

}
