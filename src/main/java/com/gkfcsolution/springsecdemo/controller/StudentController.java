package com.gkfcsolution.springsecdemo.controller;

import com.gkfcsolution.springsecdemo.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2025 at 07:02
 * File: null.java
 * Project: spring-sec-demo
 *
 * @author Frank GUEKENG
 * @date 02/08/2025
 * @time 07:02
 */
@RestController
public class StudentController {

    List<Student> students = new ArrayList<>(List.of(
            new Student(1, "John Doe", "Java"),
            new Student(2, "Jane Smith", "Python"),
            new Student(3, "Alice Johnson", "JavaScript")
    ));

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
       return (CsrfToken) request.getAttribute("_csrf");
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return students;
    }
    @PostMapping("/students")
    public void addStudent(@RequestBody Student student) {
        students.add(student);
        System.out.println(students);
    }
}
