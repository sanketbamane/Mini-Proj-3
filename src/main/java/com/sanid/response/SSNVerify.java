package com.sanid.response;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class SSNVerify {
	
	private String ssnId;
	private String fname;
	private String lname;
	private String dob;
	private String gender;
	private String state_name;
}
