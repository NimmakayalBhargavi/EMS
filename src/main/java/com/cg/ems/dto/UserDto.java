package com.cg.ems.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "login_table")
public class UserDto {
	@Id
	@NotNull(message = "Sorry userId cannot Be Null")
	Integer userId;
	
	@Column(name = "upassword")
	@NotBlank(message = "Password cannnot blank")
	String passWord;
	
	@Column(name = "urole")
	@NotBlank(message = "User Role  cannot blank")
	String role;
	@Column(name = "uresult")
	@NotNull(message = "sorry result cannot be Null")
	Integer result;
	public UserDto(int userId, String passWord, String role, int result) {
		super();
		this.userId = userId;
		this.passWord = passWord;
		this.role = role;
		this.result = result;
	}
	public UserDto() {
		super();
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "UserDto [userId=" + userId + ", passWord=" + passWord + ", role=" + role + ", result=" + result + "]";
	}
	

}
