package com.kgs.tech.service;

import java.util.List;

import com.kgs.tech.dto.RecruitmentDto;
import com.kgs.tech.dto.SkillMstDto;
import com.kgs.tech.dto.SourceMstDto;
import com.kgs.tech.dto.StatusMstDto;
import com.kgs.tech.dto.VisaMstDto;

public interface RecruitmentService {
	
	List<SkillMstDto> findAllSkills();

	List<RecruitmentDto> findAllRecruitmentList();

	List<SourceMstDto> findAllSources();

	List<VisaMstDto> findAllVisas();

	List<StatusMstDto> findAllStatusList();

	RecruitmentDto save(RecruitmentDto recruitmentDto);

	RecruitmentDto loadDetails(RecruitmentDto recruitmentDto);

}
