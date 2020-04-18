package com.xyoung.hospital.dao.module.vo;

import java.util.Date;

public class AlterationInfoVo {

	private Integer id;

	private String methodCode;

	private String uniqueCode;

	private String rawData;

	private Date updateDate;

	private Date createTime;

	private String oprsUserCode;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMethodCode() {
		return methodCode;
	}

	public void setMethodCode(String methodCode) {
		this.methodCode = methodCode == null ? null : methodCode.trim();
	}

	public String getUniqueCode() {
		return uniqueCode;
	}

	public void setUniqueCode(String uniqueCode) {
		this.uniqueCode = uniqueCode == null ? null : uniqueCode.trim();
	}

	public String getRawData() {
		return rawData;
	}

	public void setRawData(String rawData) {
		this.rawData = rawData == null ? null : rawData.trim();
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getOprsUserCode() {
		return oprsUserCode;
	}

	public void setOprsUserCode(String oprsUserCode) {
		this.oprsUserCode = oprsUserCode == null ? null : oprsUserCode.trim();
	}
}
