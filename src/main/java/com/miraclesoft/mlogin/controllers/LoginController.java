/**
 * 
 */
package com.miraclesoft.mlogin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.miraclesoft.mlogin.dto.User;

/**
 * @author Phani Mahesh
 *
 */
@RestController
public class LoginController {
	
	@Autowired
	User user;
	
	@PostMapping("/login")
	public User login(@RequestBody final User request ) {
		
		return user;
		
	}
	
	private boolean isAuthorized() {
		
		boolean result = false;
		
		return result;
		
	}
	

}
