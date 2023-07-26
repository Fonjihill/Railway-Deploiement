package com.example.student.controller;


import com.example.student.model.entity.Student;
import com.example.student.model.view.StudentView;
import com.example.student.repository.StudentRepository;
import com.example.student.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Api(value="StudentController", description="Rest API for a Student.")
@RestController
@CrossOrigin
@AllArgsConstructor
@RequestMapping(value = "/v1/student")
public class StudentController {

    private StudentService studentService;
    private StudentRepository studentRepository;

    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);



    @ApiOperation(value = "Create a student" , response = StudentView.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Validation Exception"),
            @ApiResponse(code = 404, message = "Resource Not Found Exception"),
            @ApiResponse(code = 500, message = "Internal Exception")

    })
    @PostMapping(value = "/register")
    public ResponseEntity<String> register(@RequestBody Student student) {
        String a = studentService.register(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(a);

    }
}
