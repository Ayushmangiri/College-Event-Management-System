package com.example.collegeevent.college_management_system.service;


import com.example.collegeevent.college_management_system.model.Student;
import com.example.collegeevent.college_management_system.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.lang.Long;

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
    public Student createStudent(Student student){
        return  studentRepository.save(student);
    }
    public  Student updateStudent(Long id , Student student) {
        if (studentRepository.existsById(id)) {
           student.setID(id);
            return  studentRepository.save(student);
        }
        return  null;
    }
    public void deleteStudent (Long id){
         studentRepository.deleteById(id);
    }
}