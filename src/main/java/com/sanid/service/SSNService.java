package com.sanid.service;

import java.util.List;
import java.util.Map;

import com.sanid.entity.SSNVerifyEntity;

import com.sanid.request.ssnEnroll;
import com.sanid.response.SSNVerify;


public interface SSNService {

	public SSNVerifyEntity findByssnid(String ssnid);

	public SSNVerifyEntity saveSSNEnroll(ssnEnroll ssnenroll);

}