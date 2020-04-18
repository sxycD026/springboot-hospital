package com.xyoung.hospital.dao.module.vo;

import java.util.Date;

public class RoleInfo {

	private Integer id;

	private String roleCode;

	private String roleName;

	private String upRoleCode;

	private Integer status;

	private Date createTime;

	private Date modifyTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode == null ? null : roleCode.trim();
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName == null ? null : roleName.trim();
	}

	public String getUpRoleCode() {
		return upRoleCode;
	}

	public void setUpRoleCode(String upRoleCode) {
		this.upRoleCode = upRoleCode == null ? null : upRoleCode.trim();
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
}
