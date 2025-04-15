package com.example.collegeevent.college_management_system.controller;


import com.example.collegeevent.college_management_system.model.Student;
import com.example.collegeevent.college_management_system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/students")

public class StudentController {
    @Autowired
    private StudentService studentService;

      @PostMapping

        public Student createStudent(@RequestBody Student student){
          return  studentService.createStudent(student);
      }

    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getStudentByID(@PathVariable Long id){
        Optional<Student> student = studentService.getStudentsById(id);
        if(student.isPresent()){
            return ResponseEntity.ok(student.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student not found with ID: " + id);
        }
    }



    @PutMapping ("/{id}")
    public Student updateStudent(@PathVariable Long id,@RequestBody Student updateStudent){
                return studentService.updateStudent(id, updateStudent);
    }

    @DeleteMapping("/{id}")
    public String  deleteStudent(@PathVariable Long id){
          studentService.deleteStudent(id);
          return "Student Details is Deleted ";
    }
}
