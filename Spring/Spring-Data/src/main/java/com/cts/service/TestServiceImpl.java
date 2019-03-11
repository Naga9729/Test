package com.cts.service;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Service;

@Service
@PropertySource(value = { "application.properties" })
public class TestServiceImpl {

	@Autowired
	private Environment env;

	@Bean
	public DriverManagerDataSource getDataSource() {
		String driverClass = env.getProperty("driver");
		String url = env.getProperty("url");
		String user = env.getProperty("userName");
		String pwd = env.getProperty("password");

		System.out.println("-- test");

		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl(url);
		driverManagerDataSource.setUsername(user);
		driverManagerDataSource.setPassword(pwd);
		driverManagerDataSource.setDriverClassName(driverClass);

		return driverManagerDataSource;

	}
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource ) {
		return  new JdbcTemplate(dataSource);
	}


}
