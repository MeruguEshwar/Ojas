package com.ojas.spring.config;

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
@PropertySource("classpath:application.properties")
@ComponentScan("com.ojas.spring")
public class CourseConfigurationFile {

	@Autowired
	public Environment env;

	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dm = new DriverManagerDataSource();
		dm.setUrl(env.getProperty("url"));
		dm.setUsername(env.getProperty("uname"));
		dm.setPassword(env.getProperty("pwd"));
		dm.setDriverClassName(env.getProperty("driver"));
		return dm;
	}
	
	@Bean
	public JdbcTemplate jdbctemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
		return jdbcTemplate;
	}

}
