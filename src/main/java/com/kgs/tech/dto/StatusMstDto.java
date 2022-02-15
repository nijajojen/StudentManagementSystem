package com.kgs.tech.dto;

import java.io.Serializable;

public class StatusMstDto implements Serializable{

	
	private Integer id;
	private String statusName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	
	
	

}
