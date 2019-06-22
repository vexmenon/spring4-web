package com.web.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.UserRole;
import com.web.repository.UserRoleRepository;

@Service("userService")
@Transactional
public class UserService {
	
	@Autowired
	private UserRoleRepository userRoleRepository;
	
	
	public UserRole fetchUserById(Integer id) throws Exception{
		return userRoleRepository.findById(id);
	}

}
