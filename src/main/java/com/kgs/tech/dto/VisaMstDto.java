package com.kgs.tech.dto;

import java.io.Serializable;

public class VisaMstDto implements Serializable{

	
	private Integer id;
	private String visaName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getVisaName() {
		return visaName;
	}
	public void setVisaName(String visaName) {
		this.visaName = visaName;
	}
	
	

}
