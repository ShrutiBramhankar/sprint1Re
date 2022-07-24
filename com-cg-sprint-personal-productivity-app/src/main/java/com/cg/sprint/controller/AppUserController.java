package com.cg.sprint.controller;

import java.lang.System.Logger;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.sprint.model.AppUser;
import com.cg.sprint.model.Todo;
import com.cg.sprint.service.AppUserService;
import com.cg.sprint.service.TodoService;

@RestController
@RequestMapping("/user")

public class AppUserController {
	// private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	@Autowired
	AppUserService appUserService;

	@Autowired
	TodoService todoService;

	@PostMapping("/saveuser")
	public ResponseEntity<AppUser> saveRegistration(@RequestBody AppUser appUser) { // LOG.info(user.toString());

		HttpStatus status = HttpStatus.CREATED;
		AppUser u = appUserService.saveRegistration(appUser);
		return new ResponseEntity<AppUser>(u, status);
	}

	@PostMapping("/login")
	public ResponseEntity<AppUser> login(@RequestBody AppUser appUser) {
	//	LOG.info(appUser.toString());
		HttpHeaders headers = new HttpHeaders();
		
		
		AppUser appUser2 = appUserService.loginUser(appUser);
		
		if(appUser2!=null) {
			headers.add("message", "User " + appUser.getUserName() + " logged in successfully.");
		}else {
			headers.add("message", "UserName or Password is in correct .");

		}
		return new ResponseEntity<AppUser>(appUser2, headers, HttpStatus.OK);
	}

	@GetMapping("/getUserAllDataById/{userId}")
	public AppUser  getUserAllDataById(@PathVariable int userId) { // LOG.info(user.toString());
		AppUser appUser = appUserService.getUserAllDataById(userId);
		return appUser;
	}
	
	
	
}
