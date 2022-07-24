package com.cg.sprint.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.sprint.model.AppUser;
import com.cg.sprint.repository.AppUserRepository;

//
//import com.cg.sprint.model.User;
//import com.cg.sprint.repository.UserRepository;

@Service
public class AppUserService {

	
	@Autowired
	private AppUserRepository  appUserRepository;
	
	public AppUser saveRegistration(AppUser appUser) {
		return appUserRepository.save(appUser);
	}



	public AppUser getUserAllDataById(int userId) {
		return appUserRepository.findById(userId).get();
	}


	public AppUser loginUser(AppUser appUser) {
	//	LOG.info(appUser.toString());
		AppUser userOptional = appUserRepository.findByUserName(appUser.getUserName());
		if (userOptional!=null) {
			if (appUser.getUserName().equalsIgnoreCase(userOptional.getUserName())) {
				//LOG.info(userOptional.get().toString());
				//loggedInUser = appUser; // successful login
				return userOptional;
			}
	}
		return userOptional;
	
    
}
}


