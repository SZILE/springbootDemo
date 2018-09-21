package com.shipc.test.mybatis.config.datasource;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author ShiPC
 * @date 2018年9月5日
 * 数据源配置类
 */
@Configuration
public class ImpalaDataSourceConfig {
	
	@Bean(name = "impalaDataSource")
	@ConfigurationProperties(prefix = "impala.datasource")
	public DataSource impalaDataSource() {
		DataSource build = DataSourceBuilder.create().build();
		return build;
	}
	
	@Bean(name = "impalaSqlSessionFactory")
	public SqlSessionFactory impalaSqlSessionFactory(@Qualifier("impalaDataSource") DataSource dataSource) throws Exception {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		//设置mybatis的配置文件
		bean.setConfigLocation(new DefaultResourceLoader()
				.getResource("classpath:META-INF/mybatis/mybatis-config.xml"));
		//设置mapper（*.xml）路径
		bean.setMapperLocations(new PathMatchingResourcePatternResolver()
				.getResources("classpath*:META-INF/mybatis/mapper/*.xml"));
		return bean.getObject();
	}
	
	@Bean(name = "impalaJdbcTemplate")
	public JdbcTemplate impalaJdbcTemplate(@Qualifier("impalaDataSource") DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}
	
}
