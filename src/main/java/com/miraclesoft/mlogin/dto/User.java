/**
 * 
 */
package com.miraclesoft.mlogin.dto;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

/**
 * @author Phani Mahesh
 *
 */
@Component
public class User {
	
	private String userName;
	private String passwordHash;
	private String loginStatus;
	private Map<String, String> locations;
	
	
	
	public Map<String, String> getLocations() {
		return locations;
	}
	public void setLocations(Map<String, String> locations) {
		this.locations = locations;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPasswordHash() {
		return passwordHash;
	}
	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}
	public String getLoginStatus() {
		return loginStatus;
	}
	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}
	

}
