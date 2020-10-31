package com.sanid.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sanid.constants.AppConstants;
import com.sanid.props.AppProperties;

//import com.sanid.pojo.SSNEnroll;

@RestController
public class SSNEnrollController {
	
	@Autowired
	private AppProperties appProps;
	
	@PostMapping("/ssnEnrollment")
	public String handleEnrollmentBtn() {
	
		String enroll = appProps.getMessages().get(AppConstants.ENROLL);
		return "enroll";
	}

}