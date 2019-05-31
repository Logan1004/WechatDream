package com.example.wechatdream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


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