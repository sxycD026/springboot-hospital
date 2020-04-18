package com.xyoung.hospital.dao.module.vo;

import java.util.Date;

/**
 * @author Lee
 */
public class UserInfoVo {

	private Integer id;

	private String userCode;

	private String userName;

	private String userNickName;

	private String userSex;

	private String cardType;

	private String userIdCard;

	private String userRole;

	private String upUserCode;

	private String branchCode;

	private String telephone;

	private String address;

	private Integer status;

	private Date createTime;

	private Date modifyTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode == null ? null : userCode.trim();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	public String getUserNickName() {
		return userNickName;
	}

	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName == null ? null : userNickName.trim();
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex == null ? null : userSex.trim();
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType == null ? null : cardType.trim();
	}

	public String getUserIdCard() {
		return userIdCard;
	}

	public void setUserIdCard(String userIdCard) {
		this.userIdCard = userIdCard == null ? null : userIdCard.trim();
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole == null ? null : userRole.trim();
	}

	public String getUpUserCode() {
		return upUserCode;
	}

	public void setUpUserCode(String upUserCode) {
		this.upUserCode = upUserCode == null ? null : upUserCode.trim();
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode == null ? null : branchCode.trim();
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone == null ? null : telephone.trim();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
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
