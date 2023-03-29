package com.example.demo.services;

import com.example.demo.model.entities.Student;
import com.example.demo.repositories.StudentRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.
                findAll().
                stream().
                toList();
    }
    public Optional<Student> getStudentById(Long studentId) {
        return studentRepository.
                findById(studentId);
    }

}
