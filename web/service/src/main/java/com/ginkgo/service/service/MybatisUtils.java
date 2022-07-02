package com.ginkgo.service.service;

import com.ginkgo.service.Config.DBConfig;
import com.ginkgo.service.bi.AccountMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.sql.DataSource;

@Slf4j
@Component
public class MybatisUtils {

    @Resource
    private DBConfig dbConfig;

    private static SqlSessionFactory sqlSessionFactory;

    public  SqlSessionFactory build() {
        DataSource dataSource = new PooledDataSource(dbConfig.getDriver(), dbConfig.getServer(),
                dbConfig.getAccount(), dbConfig.getPassword());
        Environment environment = new Environment("dev", new JdbcTransactionFactory(), dataSource);
        Configuration configuration = new Configuration(environment);
        configuration.addMapper(AccountMapper.class);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(configuration);
        return factory;
    }

    @PostConstruct
    public void init() {
        sqlSessionFactory = build();
    }

    public static SqlSessionFactory getSessionFactory() {
        return sqlSessionFactory;
    }
}