package com.sanid.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sanid.constants.AppConstants;
import com.sanid.entity.SSNEnrollEntity;
import com.sanid.props.AppProperties;
import com.sanid.repository.SSNEnrollRepository;
import com.sanid.request.SSNEnroll;
import com.sanid.response.SSNVerify;
import com.sanid.service.SSNService;

//import com.sanid.pojo.SSNEnroll;

@RestController
public class SSNEnrollController {
	
	@Autowired
	private AppProperties appProps;
	
	@Autowired
	private SSNService service;
	
	@PostMapping(value = "/ssnEnrollment",
				 consumes= {
						 "application/xml",
						 "application/json"
						
				 },
				 produces = {
						 "application/xml",
						 "application/json"
						 
				 }
			
			)
	public ResponseEntity<SSNVerify> handleEnrollmentBtn(@RequestBody SSNEnroll ssnenroll) {
		service.saveSSNEnroll(ssnenroll);
		SSNVerify ssnverify = new SSNVerify();
		
		ssnverify.setFname(ssnenroll.getFname());
		ssnverify.setLname(ssnenroll.getLname());
		ssnverify.setDob(ssnenroll.getDob());
		ssnverify.setGender(ssnenroll.getGender());
		ssnverify.setStateName(ssnenroll.getStateName());
		
		return new ResponseEntity<>(ssnverify, HttpStatus.CREATED);
		
	}
}