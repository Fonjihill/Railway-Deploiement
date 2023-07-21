package com.example.student.service;

import com.example.student.model.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    Optional<Student> getStudentById(long id);

    List<Student> getAllStudent();

    void deleteStudent(long id);

    Student updateStudent(long id);

    Optional<Student> getStudentByEmail(String email);

    public String register(Student student);
}
