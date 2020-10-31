package com.sanid.exceptions;


import java.util.Date;

import lombok.Data;

@Data
public class ApiError {

	private Integer errorCode;
	private String errorDesc;
	private Date date;
	public ApiError(Integer errorCode, String errorDesc, Date date) {
		super();
		this.errorCode = errorCode;
		this.errorDesc = errorDesc;
		this.date = date;
	}
	public ApiError() {
		super();
	}
	
	
}
