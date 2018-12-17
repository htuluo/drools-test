package com.llm.entity;

/**
 * @description:
 * @author: luolm
 * @createTime： 2018/12/17
 * @version: v1.0.0
 * @history: (版本) 作者 时间 注释
 */
//@Dat
public class Person {
    private Integer age;
    private String name;

    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
