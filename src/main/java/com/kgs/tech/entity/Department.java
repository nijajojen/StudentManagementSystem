package com.kgs.tech.entity;

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
@Table(name="department")
public class Department {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	@Column(name="department_name")
	private String departmentName;
	
	@Column(name="active_flag")
	private String activeFlag;
	
	@Column(name="created_by")
	private String createdBy;
	@Column(name="modified_by")
	private String modifiedBy;
	@Column(name="created_date")
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	@Column(name="modified_date")
	@Temporal(TemporalType.DATE)
	private Date modifiedDate;
	@Column(name="delete_flag")
	private String deleteFlag;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="department")
	private List<UserDepartmentMap> userDepartmentMapList;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="department")
	private List<DeptRoleMap> deptRoleMapList;
	
	
	
	
	public List<DeptRoleMap> getDeptRoleMapList() {
		return deptRoleMapList;
	}
	public void setDeptRoleMapList(List<DeptRoleMap> deptRoleMapList) {
		this.deptRoleMapList = deptRoleMapList;
	}
	public String getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getDeleteFlag() {
		return deleteFlag;
	}
	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	public List<UserDepartmentMap> getUserDepartmentMapList() {
		return userDepartmentMapList;
	}
	public void setUserDepartmentMapList(List<UserDepartmentMap> userDepartmentMapList) {
		this.userDepartmentMapList = userDepartmentMapList;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
	
	

}
