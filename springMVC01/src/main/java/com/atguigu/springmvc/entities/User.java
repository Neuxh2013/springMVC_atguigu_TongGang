package com.atguigu.springmvc.entities;

import lombok.Data;

@Data
public class User {

    private Integer id;
    private String username;
    private String password;
    private String email;
    private int age;
    private Address address;

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", username='" + username + '\'' + ", password='" + password + '\'' + ", email='"
                + email + '\'' + ", age=" + age + ", address=" + address + '}';
    }
}
