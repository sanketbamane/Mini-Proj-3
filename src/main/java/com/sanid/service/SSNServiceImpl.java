package com.sanid.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sanid.entity.SSNVerifyEntity;
import com.sanid.exceptions.NoSsnFoundException;
import com.sanid.repository.SSNEnrollRepository;
import com.sanid.request.ssnEnroll;
import com.sanid.response.SSNVerify;
import com.sanid.request.ssnEnroll;

//import com.sanid.pojo.SSNEnroll;

@Service
public class SSNServiceImpl implements SSNService {

	@Autowired
	private SSNEnrollRepository repo;
	
	@Override
	public String saveSSNEnroll(ssnEnroll ssnEnroll) {
		// TODO Auto-generated method stub

		SSNVerifyEntity entity = new SSNVerifyEntity();
		BeanUtils.copyProperties(ssnEnroll,entity);
		
		SSNVerifyEntity savedEntity = repo.save(entity);
		String ssnId = savedEntity.getSsnId();
		
		return ssnId;
	}

	@Override
	public SSNVerify findByssnid(String ssn) {
		// TODO Auto-generated method stub
		 Optional<SSNVerifyEntity> optional = repo.findById(ssn);
		 SSNVerify ssnVerify = new SSNVerify();
		if(optional.isPresent()) {
			SSNVerifyEntity	 entity = optional.get();
			
			BeanUtils.copyProperties(entity, ssnVerify);
			return ssnVerify;
			
		}else {
			throw new NoSsnFoundException("SSN not found");
		}
		
		
	}

}