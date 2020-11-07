package com.sanid.service;

import java.util.List;
import java.util.Map;

import com.sanid.entity.SSNVerifyEntity;

import com.sanid.request.ssnEnroll;
import com.sanid.response.SSNVerify;


public interface SSNService {

	public SSNVerify findByssnid(String ssnid);

	public String saveSSNEnroll(ssnEnroll ssnenroll);

}