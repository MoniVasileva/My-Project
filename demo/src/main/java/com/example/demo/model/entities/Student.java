package com.example.demo.model.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student extends User{
    @ManyToOne
    private Speciality speciality;


    public Speciality getSpeciality() {
        return speciality;
    }

    public Student setSpeciality(Speciality speciality) {
        this.speciality = speciality;
        return this;
    }
}
