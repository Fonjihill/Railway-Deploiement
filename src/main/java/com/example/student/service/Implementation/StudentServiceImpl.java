package com.example.student.service.Implementation;


import com.example.student.dao.StudentDAO;
import com.example.student.model.entity.Student;
import com.example.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {


    private final StudentDAO studentDAO;

    @Autowired
    public StudentServiceImpl(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    public Optional<Student> getStudentById(long id) {
        return studentDAO.getStudentById(id);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentDAO.getAllStudent();
    }

    @Override
    public void deleteStudent(long id) {
        studentDAO.deleteStudent(id);
    }

    @Override
    public Student updateStudent(long id) {
        return null;
    }

    @Override
    public Optional<Student> getStudentByEmail(String email) {
        return studentDAO.getStudentByEmail(email);
    }

    @Override
    public String register(Student student) {
        return studentDAO.register(student);
    }
}
