package com.atguigu.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.atguigu.springmvc.entities.User;

/**
 * @author CYH
 * @date 2018/1/3 0003
 */
@Controller
@RequestMapping("/springmvc")
public class SpringMVCTest {

    private static final String SUCCESS = "success";

    @RequestMapping("/testRequestMapping")
    public String testRequestMapping() {
        System.out.println("testRequestMapping");
        return SUCCESS;
    }

    @RequestMapping(value = "/testMethod", method = RequestMethod.POST)
    public String testMethod() {
        System.out.println("testMethod");
        return SUCCESS;
    }

    @RequestMapping(value = "/testParamsAndHeaders", params = {"username", "age!=10"},
            headers = {"Accept-Language=zh-CN,zh;q=0.9"})
    public String testParamsAndHeaders() {
        System.out.println("testParamsAndHeaders");
        return SUCCESS;
    }

    @RequestMapping("/testAntPath/*/abc")
    public String testAntPath() {
        System.out.println("testAntPath");
        return SUCCESS;
    }

    @RequestMapping("/testPathVariable/{id}")
    public String testPathVariable(@PathVariable("id") String id) {
        System.out.println("testPathVariable: " + id);
        return SUCCESS;
    }

    @RequestMapping(value = "/testRestGet/{id}", method = RequestMethod.GET)
    public String testRestGet(@PathVariable String id) {
        System.out.println("testRestGet: " + id);
        return SUCCESS;
    }

    @RequestMapping(value = "/testRestPost", method = RequestMethod.POST)
    public String testRestPost() {
        System.out.println("testRestPost");
        return SUCCESS;
    }

    @RequestMapping(value = "/testRestDelete/{id}", method = RequestMethod.DELETE)
    public String testRestDelete(@PathVariable String id) {
        System.out.println("testRestDelete: " + id);
        return SUCCESS;
    }

    @RequestMapping(value = "/testRestPut/{id}", method = RequestMethod.PUT)
    public String testRestPut(@PathVariable String id) {
        System.out.println("testRestPut: " + id);
        return SUCCESS;
    }

    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam("username") String username,
            @RequestParam(value = "age", required = false, defaultValue = "0") Integer age) {

        System.out.println("testRequestParam: username: " + username + ", age: " + age);
        return SUCCESS;
    }

    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader("Accept-Language") String language) {
        System.out.println("testRequestHeader: " + language);
        return SUCCESS;
    }

    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue("JSESSIONID") String sessionId) {
        System.out.println("testCookieValue: " + sessionId);
        return SUCCESS;
    }

    @RequestMapping("/testPojo")
    public String testPojo(User user) {
        System.out.println("testPojo: " + user);
        return SUCCESS;
    }

}
