package com.example.akshay.listadapterdemo;

/**
 * Created by Akshay on 26-02-2018.
 */

public class Person {
    private String name;
    private String date;
    private String sex;

    public Person(String name, String date, String sex) {
        this.name = name;
        this.date = date;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
