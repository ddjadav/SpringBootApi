package com.ddjadav.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
       private final StudentService studentService;
       @Autowired
        public StudentController(StudentService studentService) {
            this.studentService = studentService;
        }
        @GetMapping
        public List<Student> getStudents(){
            return studentService.getStudents();
        }
        @PostMapping(
                path = "create",
                consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
        )
        public Student registerNewStudent(@RequestBody Student student){
           return studentService.addNewStudent(student);
        }
}
