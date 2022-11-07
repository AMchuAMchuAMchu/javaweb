package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceStatLoggerImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * Description ==> TODO
 * BelongsProject ==> javaweb
 * BelongsPackage ==> com.itheima.config
 * Version ==> 1.0
 * CreateTime ==> 2022-11-07 08:52:38
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class CFDruidDataSource {

    @Value("${jdbc.driverClassName}")
    private String pdriverClassName;
    @Value("${jdbc.url}")
    private String purl;
    @Value("${jdbc.username}")
    private String pusername;
    @Value("${jdbc.password}")
    private String ppassword;

    @Bean
    public DataSource getDruidDataSource(){

        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(pdriverClassName);
        druidDataSource.setUrl(purl);
        druidDataSource.setUsername(pusername);
        druidDataSource.setPassword(ppassword);
        return druidDataSource;

    }


    @Bean
    public PlatformTransactionManager getPTF(DataSource dataSource){
        DataSourceTransactionManager dstm = new DataSourceTransactionManager();
        dstm.setDataSource(dataSource);
        return dstm;
    }









}
