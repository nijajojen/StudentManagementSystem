package com.kgs.tech.dto;

import java.io.Serializable;

public class SourceMstDto implements Serializable{

	
	private Integer id;
	private String sourceName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSourceName() {
		return sourceName;
	}
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}
	
	
	

}
