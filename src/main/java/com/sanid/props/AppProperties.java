package com.sanid.props;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "app")
@Data
public class AppProperties {
//	private String enroll;
//	private String verify;
	
	private Map<String, String> messages = 	new HashMap<>();
	
}
