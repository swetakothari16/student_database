package com.example.Student_db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class Student_Controller {

    @Autowired
    Student_Services student_services;

    @GetMapping("/get")
    public List<Student> getAllStudents() {
        return student_services.getAllStudents();
    }

    @PostMapping("add_student")
    public String addStudent(@RequestBody Student student)
    {
        return student_services.addStudent(student);
    }

    @PutMapping("/{id}")
    public void updateStudent(@PathVariable int id, @RequestBody Student student) {
        student_services.updateStudent(id, student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int id) {
        student_services.deleteStudent(id);

    }
}


