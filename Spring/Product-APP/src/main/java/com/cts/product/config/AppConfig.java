package com.cts.product.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages= {"com.cts.product.dao","com.cts.product.service"})
@ComponentScans(value= {@ComponentScan("com.cts.product.dao"),@ComponentScan("com.cts.product.service")})
public class AppConfig {

}
