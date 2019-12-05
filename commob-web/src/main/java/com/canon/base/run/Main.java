package com.canon.base.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: canon-common
 * @Auther: canon
 * @Date: 2019/12/4 15:47
 * @Description:核心启动类
 */
@ComponentScan(basePackages = "com.canon.*")
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
