package com.example.Student_db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Student_Repository extends JpaRepository<Student,Integer> {
}
