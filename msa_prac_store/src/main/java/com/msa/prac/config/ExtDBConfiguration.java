/*
package com.msa.prac.config;

import com.msa.prac.annotation.ExtMariaDB;
import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Slf4j
@Configuration
@MapperScan(value = "com.my.test.store.mapper", annotationClass = ExtMariaDB.class, sqlSessionFactoryRef = "extSqlSessionFactory")
@EnableTransactionManagement
public class ExtDBConfiguration {

    @Value("${mybatis.config-location}")
    public String CONFIG_LOCATION_PATH;

    @Bean(name = "extDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.hikari.test")
    public DataSource dataSource() {
        return DataSourceBuilder.create().type(HikariDataSource.class).build();
    }

    @Bean(name = "extSqlSessionFactory")
    public SqlSessionFactory regionSqlSessionFactory(@Qualifier("extDataSource") DataSource extDataSource,
                                                     ApplicationContext applicationContext) throws Exception {

        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(extDataSource);
        sqlSessionFactoryBean.setVfs(SpringBootVFS.class);
        sqlSessionFactoryBean.setConfigLocation(applicationContext.getResource(CONFIG_LOCATION_PATH));
        sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:mybatis/mariadb/*.xml"));

        return sqlSessionFactoryBean.getObject();
    }

    @Bean(name = "extSqlSessionTemplate")
    public SqlSessionTemplate regionSqlSessionTemplate(SqlSessionFactory extSqlSessionFactory) {
        return new SqlSessionTemplate(extSqlSessionFactory);
    }

}
*/
