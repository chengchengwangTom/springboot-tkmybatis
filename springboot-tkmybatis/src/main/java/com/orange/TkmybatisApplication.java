package com.orange;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * <pre>
 *    @author : orange
 *    @e-mail : 495314527@qq.com
 *    @time   : 2019/4/26 11:36
 *    @desc   : springboot启动类
 *    @version: 1.0
 * </pre>
 */
@SpringBootApplication
@MapperScan(basePackages = "com.orange.mapper")
public class TkmybatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(TkmybatisApplication.class);
    }
}
