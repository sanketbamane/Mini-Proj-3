package com.sanid.response;

import lombok.Data;

@Data
public class SSNVerify {
	
	private Long ssnid;
	private String fname;
	private String lname;
	private String dob;
	private String gender;
	private String stateName;
}
