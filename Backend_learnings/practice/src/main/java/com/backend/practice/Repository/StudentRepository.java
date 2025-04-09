package com.backend.practice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.practice.Student.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long >{
    
}
