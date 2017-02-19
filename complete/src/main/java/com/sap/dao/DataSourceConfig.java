/**
 * 
 */
package com.sap.dao;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author I332955 Gangadhar
 * Dec 5, 2016
 */
@Configuration
public class DataSourceConfig {
	
	@Bean(name="dataSource")
	@ConfigurationProperties(prefix="dev.datasource")
	public DataSource dataSourceForDevEnv(){
		System.out.println("dataSource for Dev");
		return DataSourceBuilder.create().build();
	}
}