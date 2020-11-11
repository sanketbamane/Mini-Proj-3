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
import com.sanid.entity.SSNVerifyEntity;
import com.sanid.props.AppProperties;
import com.sanid.repository.SSNEnrollRepository;

import com.sanid.request.ssnEnroll;
import com.sanid.service.SSNService;

//import com.sanid.pojo.SSNEnroll;

@RestController
public class SSNEnrollController {

	@Autowired
	private SSNService service;

	@PostMapping(value = "/ssnEnrollment",

			 consumes= {
						
					 "application/json"
			 }	
			)
	/*
	 * (bracket), produces = { "application/xml", "application/json"
	 * 
	 * } )
	 */

	public ResponseEntity<String> handleEnrollmentBtn(@RequestBody ssnEnroll ssnEnroll) {
		// logger.info("started");
		SSNVerifyEntity ssnDtls = service.saveSSNEnroll(ssnEnroll);
		char arr[] = null;
		char a;
		
		String ssn= ssnDtls.getSsnId();
		
		/*for(int i=0;i<ssn.length();i++) {
					
			if(arr[i]==3) {
				ssn.replace(arr[i], '-');
			}else if (arr[i]==5) {
				ssn.replace(arr[i], '-');
			}
			
			
			
		}*/
		
				
		String msg = "Enrollment success!!! ssn no is :- " +ssn;
		
		// logger.info("completed");
		return new ResponseEntity<>(msg, HttpStatus.CREATED);

	}

}