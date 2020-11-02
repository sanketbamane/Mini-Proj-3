package com.sanid.request;

import lombok.Data;

@Data
public class SSNEnroll {
	
	private Long ssnid;
	private String fname;
	private String lname;
	private String dob;
	private String gender;
	private String stateName;
	
}
