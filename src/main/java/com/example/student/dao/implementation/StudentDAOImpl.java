package com.example.student.dao.implementation;

import com.example.student.dao.StudentDAO;
import com.example.student.model.entity.Student;
import com.example.student.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
@AllArgsConstructor
public class StudentDAOImpl implements StudentDAO {

    private final StudentRepository studentRepository;


    @Override
    public Optional<Student> getStudentById(long id) {
        return studentRepository.findById(id);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteStudent(long id) {
         studentRepository.deleteById(id);
    }

    @Override
    public String register(Student student) {

        Optional<Student> existingStudent = studentRepository.findByEmail(student.getEmail());
        if(existingStudent.isPresent()) {
            throw new IllegalStateException("Student already registered");
        }
        studentRepository.save(student);

        return "Student Created successfully";
    }

    @Override
    public Student updateStudent(long id) {
        return null;
    }

    @Override
    public Optional<Student> getStudentByEmail(String email) {
        return studentRepository.findByEmail(email);
    }
}
