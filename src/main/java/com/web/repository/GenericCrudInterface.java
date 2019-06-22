package com.web.repository;

import java.util.List;
import java.util.Map;

public interface GenericCrudInterface<T> {
	
	T findById(Integer pk);
	
	void save(T obj);
	
	List<T> findByNamedQuery(String query,Map<String,Object> queryParams);
	
	List<T> findAll();
	
}
