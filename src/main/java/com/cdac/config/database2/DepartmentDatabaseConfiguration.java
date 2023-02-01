package com.cdac.config.database2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.HashMap;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "departmentEntityManagerFactory",
        transactionManagerRef = "departmentTransactionManager",
        basePackages = "com.cdac.config.database2"

)
public class DepartmentDatabaseConfiguration {
    @Bean(name = "department-datasource")
    @ConfigurationProperties(prefix = "department.datasource")
    public DataSource getDatasourceDB() {
        return DataSourceBuilder.create().build();
    }



    @Bean(name = "departmentEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryDatabase1(EntityManagerFactoryBuilder builder, @Qualifier("department-datasource") DataSource dataSource) {

        // hbm2ddl properties
        HashMap<String, String> properties = new HashMap<>();
        properties.put("hibernate.hbm2ddl.auto", "update");
        return builder.dataSource(dataSource).properties(properties).packages("com.cdac.config.database2").persistenceUnit("db2").build();
    }


    @Bean(name = "departmentTransactionManager")
    public PlatformTransactionManager datasource1TransactionManager(@Qualifier("departmentEntityManagerFactory") EntityManagerFactory datasource1EntityManagerFactory) {
        return new JpaTransactionManager(datasource1EntityManagerFactory);
    }


}
