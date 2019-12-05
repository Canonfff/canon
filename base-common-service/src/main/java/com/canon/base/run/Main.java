package com.canon.base.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @program: canon-common
 * @Auther: canon
 * @Date: 2019/12/5 16:54
 * @Description:
 */
@EnableEurekaClient
@SpringBootApplication
@RestController
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @RequestMapping("/hi")
    public String hello(@RequestParam(value = "name", defaultValue = "beigege") String name) {
        return "hi " + name + " ,i am from port:" + UUID.randomUUID().toString();
    }
}
