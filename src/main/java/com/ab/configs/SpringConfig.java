package com.ab.configs;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.ab.SpringBootMvcCiCdApplication;


public class SpringConfig extends SpringBootServletInitializer{
	
	 @Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringBootMvcCiCdApplication.class);
	}

}
