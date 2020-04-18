package com.xyoung.hospital.dao.module.vo;

import java.util.Date;

public class BranchInfoVo {

	private Integer id;

	private String branchCode;

	private String branchName;

	private String branchFullName;

	private String systemCode;

	private String upBranchCode;

	private Integer status;

	private Date createTime;

	private Date modifyTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode == null ? null : branchCode.trim();
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName == null ? null : branchName.trim();
	}

	public String getBranchFullName() {
		return branchFullName;
	}

	public void setBranchFullName(String branchFullName) {
		this.branchFullName = branchFullName == null ? null : branchFullName.trim();
	}

	public String getSystemCode() {
		return systemCode;
	}

	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode == null ? null : systemCode.trim();
	}

	public String getUpBranchCode() {
		return upBranchCode;
	}

	public void setUpBranchCode(String upBranchCode) {
		this.upBranchCode = upBranchCode == null ? null : upBranchCode.trim();
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
