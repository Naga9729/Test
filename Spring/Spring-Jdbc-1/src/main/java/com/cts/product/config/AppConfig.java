package com.cts.product.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages= {"com.cts.product.dao","com.cts.product.service"})
@PropertySource(value= {"application.properties"})
public class AppConfig {
	
	@Autowired
	private Environment env; // have access to all keys from application.properties
	
	// 1. Create Data source
	@Bean
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getProperty("driver"));
		dataSource.setUrl(env.getProperty("url"));
		dataSource.setUsername(env.getProperty("userName"));
		dataSource.setPassword(env.getProperty("password"));
		
		return dataSource;
	}
	
	// 2. Create JdbcTemplace class object and pass datasource to it
	
	@Bean
	public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
		JdbcTemplate jt=new JdbcTemplate(dataSource);
		return jt;
	}
	
	
	
	
	
	
	
	
	
	

}
