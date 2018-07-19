package com.cyh.service;

import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String serviceHello(String name) {
        return "HELLO_2 " + name + "..... Time is " + new Date();
    }
}
