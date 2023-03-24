package com.example.demo.model.entities;

import jakarta.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name = "students")
public class Student extends User {
    @ManyToOne
    private Speciality speciality;
    @ManyToOne
    private Subject subject;
    private Double grade;

    // private Map<Subject,Double> subjectGradeMap;


    public Speciality getSpeciality() {
        return speciality;
    }

    public Student setSpeciality(Speciality speciality) {
        this.speciality = speciality;
        return this;
    }

    public Subject getSubject() {
        return subject;
    }

    public Student setSubject(Subject subject) {
        this.subject = subject;
        return this;
    }

    public Double getGrade() {
        return grade;
    }

    public Student setGrade(Double grade) {
        this.grade = grade;
        return this;
    }
}
