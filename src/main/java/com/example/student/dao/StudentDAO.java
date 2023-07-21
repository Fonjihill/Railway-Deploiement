package com.example.student.dao;


import com.example.student.model.entity.Student;

import java.util.List;
import java.util.Optional;


public interface StudentDAO {

    Optional<Student> getStudentById(long id);

    List<Student> getAllStudent();

    void deleteStudent(long id);

    String register(Student student);

    Student updateStudent(long id);

    Optional<Student> getStudentByEmail(String email);
}
