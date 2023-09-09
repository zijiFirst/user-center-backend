package com.summer.usercenter;



import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author <a href="https://github.com/zijiFirst">summer</a>
 * @from <a href="https://github.com/zijiFirst">学习</a>
 */
@SpringBootApplication
@MapperScan("com.summer.usercenter.mapper")
public class UserCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserCenterApplication.class, args);
    }

}

// https://github.com/zijiFirst