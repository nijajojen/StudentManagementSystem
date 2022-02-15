package com.kgs.tech.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kgs.tech.dto.RecruitmentDto;
import com.kgs.tech.dto.SkillMstDto;
import com.kgs.tech.dto.SourceMstDto;
import com.kgs.tech.dto.StatusMstDto;
import com.kgs.tech.dto.VisaMstDto;
import com.kgs.tech.service.RecruitmentService;

@Controller
public class RecruitmentController {
	
	@Autowired
	private RecruitmentService recruitmentService;
	
	@InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
	
	
	public void displayMsg(Model model,Integer status,String msg) {
		if(status.equals(0)) {
			model.addAttribute("successMsg", msg);
		}else {
			model.addAttribute("errorMsg", msg);
		}
	}
	
	
	public void loadBasicData(Model model,RecruitmentDto recruitmentDto) {
		
		List<SkillMstDto> skillMstDtos = recruitmentService.findAllSkills();
		
		List<SourceMstDto> sourceMstDtos = recruitmentService.findAllSources();
		
		List<VisaMstDto> visaMstDtos = recruitmentService.findAllVisas();
		
		List<StatusMstDto> statusMstDtos = recruitmentService.findAllStatusList();
		
		
		model.addAttribute("skillMstDtos", skillMstDtos);
		model.addAttribute("sourceMstDtos", sourceMstDtos);
		model.addAttribute("visaMstDtos", visaMstDtos);
		model.addAttribute("statusMstDtos", statusMstDtos);
		model.addAttribute("recruitmentDto", recruitmentDto);
	}
	
	@RequestMapping(value="/recruitment",method=RequestMethod.GET)
	public String openRcruitment(Model model) {
		
		List<RecruitmentDto> recruitmentDtos = recruitmentService.findAllRecruitmentList();
		
		model.addAttribute("recruitmentDtos", recruitmentDtos);
		
		loadBasicData(model, new RecruitmentDto());
		
		
		return "recruitmentList";
	}
	
	
	@RequestMapping(value="/recruitment",method=RequestMethod.POST,params= {"save"})
	public String save(Model model,@ModelAttribute("recruitmentDto")RecruitmentDto recruitmentDto) {
		
		
		recruitmentDto = recruitmentService.save(recruitmentDto);
		
		loadBasicData(model,recruitmentDto);
		
		displayMsg(model,0,"Recruitment Detail saved Successfully.");
		
		return "recruitment";
	}
	
	
	
	
	@RequestMapping(value="/recruitment",method=RequestMethod.POST,params= {"add"})
	public String add(Model model,@ModelAttribute("recruitmentDto")RecruitmentDto recruitmentDto) {
		
		
		recruitmentDto = recruitmentService.loadDetails(recruitmentDto);
		
		loadBasicData(model,recruitmentDto);
		
		return "recruitment";
	}
	
	@RequestMapping(value="/recruitment",method=RequestMethod.POST,params= {"back"})
	public String back(Model model,@ModelAttribute("recruitmentDto")RecruitmentDto recruitmentDto) {
		
		
		
		
		return "redirect:recruitment";
	}

}
