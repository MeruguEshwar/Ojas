package com.ojas.spring._12SpringMVC.config;

import javax.sql.DataSource;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.ojas.spring._12SpringMVC")
//@PropertySource("classpath:db.properties")
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter {

//	@Autowired
//	private Environment env;

	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
//		datasource.setDriverClassName(env.getProperty("driver"));
//		datasource.setUrl(env.getProperty("url"));
//		datasource.setUsername(env.getProperty("uname"));
//		datasource.setPassword(env.getProperty("pwd"));
		
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		datasource.setUsername("root");
		datasource.setPassword("root");
		return datasource;
	}

	@Bean
	public JdbcTemplate getjdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
		return jdbcTemplate;
	}

//	@Bean
//	public BookDao getBook() {
//		return new BookImpl(getDataSource());
//	}
}
