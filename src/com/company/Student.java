package com.company;

public class Student {
    private  Person person;
    private String group;
    private String  department;
    private  String  chair;

    public Student() {
    }

    public Student(Person person, String group, String department, String chair) {
        this.person = person;
        this.group = group;
        this.department = department;
        this.chair = chair;
    }
}
