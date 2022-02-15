package com.kgs.tech.dto;

import java.io.Serializable;

public class SkillMstDto implements Serializable{

	
	private Integer id;
	private String skillName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	
	

}
