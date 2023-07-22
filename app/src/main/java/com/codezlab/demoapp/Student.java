package com.codezlab.demoapp;

public class Student {

    private String name;
    private int age;
    private String stream;

    public Student(String name, int age, String stream) {
        this.name = name;
        this.age = age;
        this.stream = stream;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStream() {
        return stream;
    }
}
