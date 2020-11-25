package com.xixue.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private long id;
    private String name;
    private int age;

    /*public Student(long l, String 张三, int i) {
    }*/

    public Long getId() {
        return this.id;
    }
}
