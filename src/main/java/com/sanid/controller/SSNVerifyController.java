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
public class SSNVerifyController {
	
	@Autowired
	private AppProperties appProps;
	
	@GetMapping("/ssnVerification")
	public String handleVerificationRequest(Long ssnid) {
		
		String verify = appProps.getMessages().get(AppConstants.VERIFY);
		return "verify";
		
	}
}