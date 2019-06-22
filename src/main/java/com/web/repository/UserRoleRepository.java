package com.web.repository;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.web.model.UserRole;

@Repository("userRoleRepo")
public class UserRoleRepository extends AbstractDao<Integer, UserRole> implements GenericCrudInterface<UserRole>{

	@Override
	public UserRole findById(Integer pk) {
		UserRole userRole = getByKey(pk);
		return userRole;
	}

	@Override
	public void save(UserRole obj) {
		persist( obj);
		
	}

	@Override
	public List<UserRole> findByNamedQuery(String query, Map<String, Object> queryParams) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserRole> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
