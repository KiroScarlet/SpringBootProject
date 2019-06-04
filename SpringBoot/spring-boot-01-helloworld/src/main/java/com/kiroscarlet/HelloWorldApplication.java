package com.kiroscarlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author KiroScarlet
 * @date 2019-04-22  -23:17
 */

/**
 * @SpringBootApplication 标注一个主程序类，说明这是一个Spring Boot应用
 */
@SpringBootApplication
public class HelloWorldApplication {
    public static void main(String[] args) {

        //spring应用启动起来
        SpringApplication.run(HelloWorldApplication.class,args);
    }
}
