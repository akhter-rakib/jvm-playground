package com.rakib.beans;

import lombok.Getter;

@Getter
public class Person {

    private final Integer id;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String gender;
    private final Integer age;

    public Person(Integer id,
                  String firstName,
                  String lastName,
                  String email,
                  String gender,
                  Integer age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
