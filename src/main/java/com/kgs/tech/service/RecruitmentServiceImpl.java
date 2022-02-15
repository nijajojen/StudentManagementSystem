package com.kgs.tech.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kgs.tech.dto.RecruitmentDto;
import com.kgs.tech.dto.RecruitmentHistoryDto;
import com.kgs.tech.dto.SkillMstDto;
import com.kgs.tech.dto.SourceMstDto;
import com.kgs.tech.dto.StatusMstDto;
import com.kgs.tech.dto.VisaMstDto;
import com.kgs.tech.entity.Recruitment;
import com.kgs.tech.entity.RecruitmentHistory;
import com.kgs.tech.entity.SkillMst;
import com.kgs.tech.entity.SourceMst;
import com.kgs.tech.entity.StatusMst;
import com.kgs.tech.entity.VisaMst;
import com.kgs.tech.repository.RecruitmentHistoryRepository;
import com.kgs.tech.repository.RecruitmentRepository;
import com.kgs.tech.repository.SkillMstRepository;
import com.kgs.tech.repository.SourceMstRepository;
import com.kgs.tech.repository.StatusMstRepository;
import com.kgs.tech.repository.VisaMstRepository;
import com.kgs.tech.util.Util;

@Service
public class RecruitmentServiceImpl implements RecruitmentService{
	
	@Autowired
	private SkillMstRepository skillMstRepository;
	
	@Autowired
	private SourceMstRepository sourceMstRepository;
	
	@Autowired
	private StatusMstRepository statusMstRepository;
	
	@Autowired
	private VisaMstRepository visaMstRepository;
	
	
	@Autowired
	private RecruitmentRepository recruitmentRepository;
	
	@Autowired
	private RecruitmentHistoryRepository recruitmentHistoryRepository;


	@Override
	@Transactional
	public List<SkillMstDto> findAllSkills() {
		List<SkillMst> skillMsts = skillMstRepository.findAll();
		
		List<SkillMstDto> skillMstDtos = new ArrayList<SkillMstDto>();
		if(!(skillMsts == null || skillMsts.size() == 0)) {
			for(SkillMst skillMst : skillMsts) {
				SkillMstDto skillMstDto = new SkillMstDto();
				
				BeanUtils.copyProperties(skillMst, skillMstDto);
				
				skillMstDtos.add(skillMstDto);
				
			}
		}
		
		return skillMstDtos;
	}

	@Override
	@Transactional
	public List<RecruitmentDto> findAllRecruitmentList() {
		List<Recruitment> recruitments = recruitmentRepository.findAll();
		
		List<RecruitmentDto> recruitmentDtos = new ArrayList<RecruitmentDto>();
		
		if(!(recruitments == null || recruitments.size() == 0)) {
			for(Recruitment recruitment : recruitments) { 
				
				RecruitmentDto recruitmentDto = new RecruitmentDto();
				
				BeanUtils.copyProperties(recruitment, recruitmentDto, "skills","visaStatus");
				
				recruitmentDtos.add(recruitmentDto);
			}
		}
		
		
		return recruitmentDtos;
		
	}

	@Override
	@Transactional
	public List<SourceMstDto> findAllSources() {

		List<SourceMst> sourceMsts = sourceMstRepository.findAll();
		
		List<SourceMstDto> sourceMstDtos = new ArrayList<SourceMstDto>();
		
		if(!(sourceMsts == null || sourceMsts.size() == 0)) {
			for(SourceMst sourceMst : sourceMsts) {
				SourceMstDto sourceMstDto = new SourceMstDto();
				
				BeanUtils.copyProperties(sourceMst, sourceMstDto);
				
				sourceMstDtos.add(sourceMstDto);
				
			}
		}
		
		return sourceMstDtos;
	
	}

	@Override
	@Transactional
	public List<VisaMstDto> findAllVisas() {
		List<VisaMst> visaMsts = visaMstRepository.findAll();
		
		List<VisaMstDto> visaMstDtos  = new ArrayList<VisaMstDto>();
		
		if(!(visaMsts == null || visaMsts.size() == 0)) {
			for(VisaMst visaMst : visaMsts) {
				VisaMstDto visaMstDto = new VisaMstDto();
				
				BeanUtils.copyProperties(visaMst, visaMstDto);
				
				visaMstDtos.add(visaMstDto);
				
			}
		}
		
		return visaMstDtos;
	}

	@Override
	@Transactional
	public List<StatusMstDto> findAllStatusList() {
		List<StatusMst> statusMsts = statusMstRepository.findAll();
		
		List<StatusMstDto> statusMstDtos  = new ArrayList<StatusMstDto>();
		
		if(!(statusMsts == null || statusMsts.size() == 0)) {
			for(StatusMst statusMst : statusMsts) {
				StatusMstDto statusMstDto = new StatusMstDto();
				
				BeanUtils.copyProperties(statusMst, statusMstDto);
				
				statusMstDtos.add(statusMstDto);
				
			}
		}
		
		return statusMstDtos;
	}

	@Override
	@Transactional
	public RecruitmentDto save(RecruitmentDto recruitmentDto) {
		
		Recruitment recruitment = new Recruitment();
		
		BeanUtils.copyProperties(recruitmentDto, recruitment, "skills","visaStatus");
		
		
		recruitment.setVisaStatus(Util.toCSV(recruitmentDto.getVisaStatus()));
		recruitment.setSkills(Util.toCSV(recruitmentDto.getSkills()));
		
		if(recruitment.getId() == null) {
			recruitmentRepository.save(recruitment);
			recruitmentDto.setId(recruitment.getId());
		}else {
			
			RecruitmentHistory recruitmentHistory = new RecruitmentHistory();
			
			Recruitment recruitmentOld = recruitmentRepository.getOne(recruitment.getId());
			
			BeanUtils.copyProperties(recruitmentOld, recruitmentHistory,"id");
			
			recruitmentHistory.setRecruitment(recruitmentOld);
			
			recruitmentHistoryRepository.save(recruitmentHistory);
			
			recruitmentRepository.save(recruitment);
		}
		
		recruitmentDto = loadDetails(recruitmentDto);
		
		return recruitmentDto;
		
		
	}
	
	
	

	@Override
	@Transactional
	public RecruitmentDto loadDetails(RecruitmentDto recruitmentDto) {
		if(recruitmentDto.getId() != null) {
			Optional<Recruitment> optional = recruitmentRepository.findById(recruitmentDto.getId());
			
			if(optional.isPresent()) {
				Recruitment recruitment = optional.get();
				
				BeanUtils.copyProperties(recruitment, recruitmentDto, "skills","visaStatus");
				
				recruitmentDto.setVisaStatus(Util.csvToList(recruitment.getVisaStatus()));
				recruitmentDto.setSkills(Util.csvToList(recruitment.getSkills()));
				
				
			}
			
			
			List<RecruitmentHistory> recruitmentHistories = recruitmentHistoryRepository.findRecruitmentHistoryByRecruitmentId(recruitmentDto.getId());
			
			if(!(recruitmentHistories == null || recruitmentHistories.size() == 0)) {
				List<RecruitmentHistoryDto> recruitmentHistoryDtos = new ArrayList<RecruitmentHistoryDto>(); 
				
				for(RecruitmentHistory recruitmentHistory : recruitmentHistories) {
					RecruitmentHistoryDto recruitmentHistoryDto = new RecruitmentHistoryDto();
					
					BeanUtils.copyProperties(recruitmentHistory, recruitmentHistoryDto,"recruitment");
					
					recruitmentHistoryDtos.add(recruitmentHistoryDto);
				}
				
				recruitmentDto.setRecruitmentHistoryDtos(recruitmentHistoryDtos);
			}
			
			
		}
		
		
		
		
		return recruitmentDto;
	}

	
}
