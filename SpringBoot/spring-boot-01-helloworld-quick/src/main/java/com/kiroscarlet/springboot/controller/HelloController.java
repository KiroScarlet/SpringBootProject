package com.kiroscarlet.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author KiroScarlet
 * @date 2019-06-04  -22:57
 */

//这个类的所有方法返回的数据直接写给浏览器（如果是对象转为json数据）
/*@Controller
@ResponseBody*/
@RestController//等价于上面两个注解
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello world quick!";
    }
}
