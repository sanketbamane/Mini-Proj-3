package com.sanid.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.models.Response;

@RestController
@ControllerAdvice
public class RestExceptionHandler {
	
	@ExceptionHandler(value = NoSsnFoundException.class)
	public ResponseEntity<ApiError> handleNoSsnFoundException() {
		
		ApiError error = new ApiError(400, "No prod found", new Date());
		
		return new ResponseEntity<ApiError>(error, HttpStatus.BAD_REQUEST);
	}
}
