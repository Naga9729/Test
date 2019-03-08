package com.cts.product.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.cts.product.dao","com.cts.product.service"})
public class AppConfig {
	
	

}
