package com.yusiwen.bean;

import lombok.Data;

@Data
public class Person {
    String name;
    String phone;

    public Person() {
    }

    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}
