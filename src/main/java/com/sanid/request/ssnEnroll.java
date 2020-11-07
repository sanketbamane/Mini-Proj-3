package com.sanid.request;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class ssnEnroll {
	
	private String ssnId;
	private String fname;
	private String lname;
	private String dob;
	private String gender;
	private String state_name;
	
}
