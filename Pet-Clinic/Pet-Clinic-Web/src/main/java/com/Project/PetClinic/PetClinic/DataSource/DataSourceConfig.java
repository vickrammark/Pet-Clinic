package com.Project.PetClinic.PetClinic.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:datasource.properties")
public class DataSourceConfig {

	@Value("${data.user}")
	private String user;
	
	@Value("${data.password}")
	private String password;
	
	@Value("${data.url}")
	private String url;
	
	@Bean
	public FakeDataSource dataSourceConf()
	{
	  FakeDataSource fakeDataSource=new FakeDataSource();
	  fakeDataSource.setUser(user);
	  fakeDataSource.setPassword(password);
	  fakeDataSource.setUrl(url);
	  return fakeDataSource;
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer dataConfig()
	{
		PropertySourcesPlaceholderConfigurer placeholderConfigurer=new PropertySourcesPlaceholderConfigurer();
		return placeholderConfigurer;
	}
}
