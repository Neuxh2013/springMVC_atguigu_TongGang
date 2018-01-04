package com.atguigu.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author CYH
 * @date 2018/1/3 0003
 */
@Controller
public class HelloWorld {


    @RequestMapping("/helloworld")
    public String hello() {
        System.out.println("Hello World!");
        return "success";
    }


}
