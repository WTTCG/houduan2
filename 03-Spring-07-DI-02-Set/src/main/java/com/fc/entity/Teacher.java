package com.fc.entity;

public class Teacher {
    private String name;
    private Integer age;
    private Student student;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
