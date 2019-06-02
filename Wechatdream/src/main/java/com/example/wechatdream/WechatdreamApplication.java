package com.example.wechatdream;

import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
@MapperScan(basePackages = "com.example.wechatdream")
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