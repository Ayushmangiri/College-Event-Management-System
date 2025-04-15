package com.example.collegeevent.college_management_system.controller;


import com.example.collegeevent.college_management_system.model.Student;
import com.example.collegeevent.college_management_system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")

public class StudentController {
    @Autowired
    private StudentService studentService;


      @PostMapping

        public Student createStudent(@RequestBody Student student){
          return  studentService.createStudent(student);
      }
}
