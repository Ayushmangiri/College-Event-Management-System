package com.example.collegeevent.college_management_system.service;


import com.example.collegeevent.college_management_system.model.Student;
import com.example.collegeevent.college_management_system.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.classfile.instruction.ReturnInstruction;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
    public  Optional<Student> getStudentsById(Long id){
        return studentRepository.findById(id);
    }
}
