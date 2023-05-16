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

import com.ojas.spring.DAO.StudentDao;
import com.ojas.spring.DAO.StudentDaoImpl;


@Configuration
@ComponentScan(basePackages = "com.ojas.spring")
@PropertySource("classpath:db.properties")
public class ConfigurationFile {

	@Autowired
	private Environment envirnoment;

	@Bean
	public DataSource getdatasoure() {

		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName(envirnoment.getProperty("driver"));

		ds.setUrl(envirnoment.getProperty("url"));
		ds.setUsername(envirnoment.getProperty("uname"));
		ds.setPassword(envirnoment.getProperty("pwd"));

		return ds;
	}

	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getdatasoure());
		return jdbcTemplate;
	}
	
//	@Bean
//	public StudentDao getStudentDAO() {
//		return new StudentDaoImpl();
//	}
}
