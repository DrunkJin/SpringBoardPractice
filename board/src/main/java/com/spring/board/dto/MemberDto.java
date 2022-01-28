package com.spring.board.dto;

import java.util.Date;

public class MemberDto {
	
	private String userId;
	private String userPass;
	private String userName;
	private String regDate;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
	@Override
	public String toString() {
		return "MemberDto [userId=" + userId + ", userPass=" + userPass +", userName=" + userName + ", regDate=" + regDate + "]"; 
	}

}
