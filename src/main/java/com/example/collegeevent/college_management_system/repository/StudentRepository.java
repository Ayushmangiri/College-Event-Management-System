package com.example.collegeevent.college_management_system.repository;


import com.example.collegeevent.college_management_system.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
