package com.kgs.tech.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class RecruitmentHistoryDto implements Serializable{
	
	private Integer id;
	private String name;
	private String email;
	private String altEmail;
	private String phoneNo;
	private String altPhoneNo;
	private List<String> skills;
	private List<String> visaStatus;	
	private Date visaStartDate;
	private Date visaEndDate;
	
	private String payType;
	private Double payRate;
	private String university;
	
	private String preferedLocation;
	private String currentLocation;
	private Date graduationDate;
	
	private Double fees;
	private String candidateStatus;
	private String recruitingSource;
	
	private Date followupDate;
	private String followupRemarks;
	
	
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getFollowupDate() {
		return followupDate;
	}
	public void setFollowupDate(Date followupDate) {
		this.followupDate = followupDate;
	}
	public String getFollowupRemarks() {
		return followupRemarks;
	}
	public void setFollowupRemarks(String followupRemarks) {
		this.followupRemarks = followupRemarks;
	}
	public Double getFees() {
		return fees;
	}
	public void setFees(Double fees) {
		this.fees = fees;
	}
	public String getCandidateStatus() {
		return candidateStatus;
	}
	public void setCandidateStatus(String candidateStatus) {
		this.candidateStatus = candidateStatus;
	}
	public String getRecruitingSource() {
		return recruitingSource;
	}
	public void setRecruitingSource(String recruitingSource) {
		this.recruitingSource = recruitingSource;
	}
	public String getPreferedLocation() {
		return preferedLocation;
	}
	public void setPreferedLocation(String preferedLocation) {
		this.preferedLocation = preferedLocation;
	}
	public String getCurrentLocation() {
		return currentLocation;
	}
	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}
	public Date getGraduationDate() {
		return graduationDate;
	}
	public void setGraduationDate(Date graduationDate) {
		this.graduationDate = graduationDate;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public Double getPayRate() {
		return payRate;
	}
	public void setPayRate(Double payRate) {
		this.payRate = payRate;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public List<String> getVisaStatus() {
		return visaStatus;
	}
	public void setVisaStatus(List<String> visaStatus) {
		this.visaStatus = visaStatus;
	}
	public Date getVisaStartDate() {
		return visaStartDate;
	}
	public void setVisaStartDate(Date visaStartDate) {
		this.visaStartDate = visaStartDate;
	}
	public Date getVisaEndDate() {
		return visaEndDate;
	}
	public void setVisaEndDate(Date visaEndDate) {
		this.visaEndDate = visaEndDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAltEmail() {
		return altEmail;
	}
	public void setAltEmail(String altEmail) {
		this.altEmail = altEmail;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAltPhoneNo() {
		return altPhoneNo;
	}
	public void setAltPhoneNo(String altPhoneNo) {
		this.altPhoneNo = altPhoneNo;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	
	
	
	

}
