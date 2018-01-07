package com.atguigu.springmvc.crud.entities;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import lombok.Data;

@Data
public class Employee {

    private Integer id;
    @NotEmpty
    private String lastName;

    @Email
    private String email;
    /** 1 male, 0 female */
    private Integer gender;

    private Department department;

    @Past
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birth;

    @NumberFormat(pattern = "#,###,###.#")
    private Float salary;

    public Employee() {}

    public Employee(Integer id, String lastName, String email, Integer gender, Department department) {
        super();
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", lastName=" + lastName + ", email=" + email + ", gender=" + gender
                + ", department=" + department + ", birth=" + birth + ", salary=" + salary + "]";
    }
}
