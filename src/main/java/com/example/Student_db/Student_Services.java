package com.example.Student_db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class Student_Services {

    @Autowired
    Student_Repository studentRepository;




    // add student details
      public String addStudent(Student student)
      {
          studentRepository.save(student);
          return "sucessfully save";

      }

      //get student details by id
      public Student getStudentById(int id) {
          Optional<Student> optionalStudent = studentRepository.findById(id);
          if (optionalStudent.isPresent()) {
              return optionalStudent.get();
          } else {
              return null;
          }
      }


    //update student details
    public void  updateStudent(int id,Student student)
      {
          Student existingStudent =  getStudentById(id);
          existingStudent.setName(student.getName());
          existingStudent.setEmail(student.getEmail());
          existingStudent.setPhone(student.getPhone());
          studentRepository.save(existingStudent);
      }

      //delete details
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
