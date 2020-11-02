package com.sanid.service;

import java.util.List;
import java.util.Map;

import com.sanid.entity.SSNEnrollEntity;
import com.sanid.request.SSNEnroll;
import com.sanid.response.SSNVerify;

public interface SSNService {

	public SSNVerify findByssnid(Long ssn);
	
	public Long saveSSNEnroll(SSNEnroll ssnrnroll);

}