package com.ab.configs;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;

import com.ab.SpringBootMvcCiCdApplication;

@Configuration
public class SpringConfig extends SpringBootServletInitializer{
	
	 @Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringBootMvcCiCdApplication.class);
	}

}
