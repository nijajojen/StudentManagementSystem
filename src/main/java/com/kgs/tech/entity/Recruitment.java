package com.kgs.tech.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="recruitment")
public class Recruitment{
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	@Column(name="alt_emailt")
	private String altEmail;
	@Column(name="phone_no")
	private String phoneNo;
	@Column(name="alt_phone_no")
	private String altPhoneNo;
	@Column(name="skills")
	private String skills;
	@Column(name="visa_status")
	private String visaStatus;	
	@Column(name="visa_start_date")
	@Temporal(TemporalType.DATE)
	private Date visaStartDate;
	@Column(name="visa_end_date")
	@Temporal(TemporalType.DATE)
	private Date visaEndDate;
	@Column(name="pay_type")
	private String payType;
	@Column(name="pay_rate")
	private Double payRate;
	@Column(name="university")
	private String university;
	@Column(name="prefered_location")
	private String preferedLocation;
	@Column(name="current_location")
	private String currentLocation;
	@Column(name="graduation_date")
	@Temporal(TemporalType.DATE)
	private Date graduationDate;
	@Column(name="fees")
	private Double fees;
	@Column(name="candidate_status")
	private String candidateStatus;
	@Column(name="recruiting_source")
	private String recruitingSource;
	@Column(name="followup_date")
	@Temporal(TemporalType.DATE)
	private Date followupDate;
	@Column(name="followup_remarks")
	private String followupRemarks;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="recruitment")
	private List<RecruitmentHistory> recruitmentHistories;
	
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getVisaStatus() {
		return visaStatus;
	}
	public void setVisaStatus(String visaStatus) {
		this.visaStatus = visaStatus;
	}
	public List<RecruitmentHistory> getRecruitmentHistories() {
		return recruitmentHistories;
	}
	public void setRecruitmentHistories(List<RecruitmentHistory> recruitmentHistories) {
		this.recruitmentHistories = recruitmentHistories;
	}
	
	
	
	
	

}
