package com.cyh.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cyh.service.HelloService;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String controllerHello(String name) {
        return "Hello " + name + ". Now is " + new Date();
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    @ResponseBody
    public String controllerHello2(String name) {
        return helloService.serviceHello(name);
    }


}
