package com.example.wechatdream;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@MapperScan(basePackages = "com.example.wechatdream")
@SpringBootApplication
public class WechatdreamApplication {

    public static void main(String[] args) {
        SpringApplication.run(WechatdreamApplication.class, args);
    }

}

//@SpringBootApplication
//public class DreamweaverApplication extends SpringBootServletInitializer {
//
//    public static void main(String[] args) {
//        SpringApplication.run(DreamweaverApplication.class, args);
//    }
//
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(DreamweaverApplication.class);
//    }
//
//}