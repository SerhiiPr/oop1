package com.company;

import java.time.LocalDate;

public class Person {
    private  String firstName;
    private String lastName;
    private String patronymic;
    private String gender;
    private LocalDate birthday;

    public Person() {
    }
    //TODO:
    public Boolean isAdult(){
        return null;
    }

    public Person(String firstName, String lastName, String patronymic, String gender, LocalDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.gender = gender;
        this.birthday = birthday;
    }
}
