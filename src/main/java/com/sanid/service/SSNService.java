package com.sanid.service;

import java.util.List;
import java.util.Map;

import com.sanid.entity.SSNEnrollEntity;

public interface SSNService {

	public List<SSNEnrollEntity> findByssnid(Long ssn);
	
	public Long saveSSNEnroll();

}