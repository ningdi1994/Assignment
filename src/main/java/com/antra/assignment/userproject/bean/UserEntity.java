package com.antra.assignment.userproject.bean;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "user_table")
public class UserEntity  {
    @Id
    @GeneratedValue
    private Integer id;

    @JsonProperty("UserName")
    private String name;

    @JsonProperty("UserSalary")
    private BigDecimal salary;

    @JsonProperty("UserAge")
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
