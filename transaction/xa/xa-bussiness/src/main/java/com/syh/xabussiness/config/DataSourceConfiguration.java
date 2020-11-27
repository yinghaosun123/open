package com.syh.xabussiness.config;


import com.alibaba.druid.pool.xa.DruidXADataSource;
import com.atomikos.jdbc.AtomikosDataSourceBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

//@Configuration
public class DataSourceConfiguration {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.one")
    public DruidXADataSource dataSourceOne() {
        return new DruidXADataSource();
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.two")
    public DruidXADataSource dataSourceTwo() {
        return new DruidXADataSource();
    }


    @Bean
    public DataSource dataSourceA(DruidXADataSource dataSourceOne) {
        AtomikosDataSourceBean xaDataSource = new AtomikosDataSourceBean();
        xaDataSource.setXaDataSource(dataSourceOne);
        xaDataSource.setUniqueResourceName("dataSourceA");
        return xaDataSource;
    }

    @Bean
    public DataSource dataSourceB(DruidXADataSource dataSourceTwo) {
        AtomikosDataSourceBean xaDataSource = new AtomikosDataSourceBean();
        xaDataSource.setXaDataSource(dataSourceTwo);
        xaDataSource.setUniqueResourceName("dataSourceB");
        return xaDataSource;
    }


    @Bean
    public JdbcTemplate jdbcTemplateA(DataSource dataSourceA) {
        return new JdbcTemplate(dataSourceA);
    }

    @Bean
    public JdbcTemplate jdbcTemplateB(DataSource dataSourceB) {
        return new JdbcTemplate(dataSourceB);
    }
}
