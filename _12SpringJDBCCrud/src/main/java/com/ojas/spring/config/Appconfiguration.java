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
@ComponentScan(basePackages ="com.ojas.spring")
@PropertySource("classpath:db.properties")
public class Appconfiguration {

	@Autowired
	private Environment environment;

	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dbs = new DriverManagerDataSource();
		dbs.setUrl(environment.getProperty("url"));
		dbs.setDriverClassName(environment.getProperty("driver"));
		dbs.setUsername(environment.getProperty("uname"));
		dbs.setPassword(environment.getProperty("pwd"));
		return dbs;
	}

	@Bean
    public JdbcTemplate getJdbcTemplate(){
    	JdbcTemplate jt = new JdbcTemplate(getDataSource());
    	return jt;
    }
	
}
