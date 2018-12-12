package com.tiandisifang.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.tiandisifang.Application;



@Configuration
@ComponentScan(basePackageClasses = Application.class, useDefaultFilters = true)
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	

	
}