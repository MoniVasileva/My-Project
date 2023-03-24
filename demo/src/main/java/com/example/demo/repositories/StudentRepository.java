package com.example.demo.repositories;

import com.example.demo.model.entities.Student;
import com.example.demo.model.entities.Subject;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {


}
