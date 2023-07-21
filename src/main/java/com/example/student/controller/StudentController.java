package com.example.student.controller;


import com.example.student.model.entity.Student;
import com.example.student.repository.StudentRepository;
import com.example.student.service.StudentService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@AllArgsConstructor
@RequestMapping(value = "/v1/student")
public class StudentController {

    private StudentService studentService;
    private StudentRepository studentRepository;

    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);


    @PostMapping(value = "/register")
    public ResponseEntity<String> register(@RequestBody Student student) {
        String a = studentService.register(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(a);

    }
}
