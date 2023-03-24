package com.example.demo.model.dtos;

import com.example.demo.model.entities.Speciality;

public class StudentDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Speciality speciality;

    public Long getId() {
        return id;
    }

    public StudentDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public StudentDTO setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public StudentDTO setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public StudentDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public StudentDTO setPassword(String password) {
        this.password = password;
        return this;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public StudentDTO setSpeciality(Speciality speciality) {
        this.speciality = speciality;
        return this;
    }
}
