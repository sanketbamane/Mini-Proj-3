package com.sanid.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanid.entity.SSNEnrollEntity;
import com.sanid.repository.SSNEnrollRepository;
import com.sanid.request.SSNEnroll;
import com.sanid.response.SSNVerify;

//import com.sanid.pojo.SSNEnroll;

@Service
public class SSNServiceImpl implements SSNService {

	@Autowired
	private SSNEnrollRepository repo;
	
	@Override
	public Long saveSSNEnroll(SSNEnroll ssnrnroll) {
		// TODO Auto-generated method stub

		SSNEnrollEntity entity = new SSNEnrollEntity();
		BeanUtils.copyProperties(ssnrnroll, entity);
		
		SSNEnrollEntity savedEntity = repo.save(entity);
		Long sId = savedEntity.getSsnId();
		
		return sId;
	}

	@Override
	public SSNVerify findByssnid(Long ssn) {
		// TODO Auto-generated method stub
		Optional<SSNEnrollEntity> optional = repo.findById(ssn);
		SSNVerify ssnv = new SSNVerify();
		if(optional.isPresent()) {
			SSNEnrollEntity	 entity = optional.get();
			SSNVerify c= new SSNVerify();
			BeanUtils.copyProperties(entity, c);
			ssnv=c;
		}
		
		return ssnv;
	}

}