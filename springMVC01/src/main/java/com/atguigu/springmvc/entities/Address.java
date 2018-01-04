package com.atguigu.springmvc.entities;

import lombok.Data;

@Data
public class Address {

    private String province;
    private String city;

    @Override
    public String toString() {
        return "Address [province=" + province + ", city=" + city + "]";
    }

}
