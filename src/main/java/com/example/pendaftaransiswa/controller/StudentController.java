package com.example.pendaftaransiswa.controller;

import com.example.pendaftaransiswa.model.Student;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @PostMapping("/register")
    public String registerStudent(@RequestBody Student student) {
        // Logic to save student to database or perform registration process
        return "Student registered successfully: " + student.getName();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        // Logic to fetch student from database or service
        Student student = new Student();
        student.setId(id);
        student.setName("John Doe");
        student.setEmail("john.doe@example.com");
        student.setPhoneNumber("1234567890");
        return student;
    }

    // Additional methods for updating, deleting students, etc.
}
