package com.gkfcsolution.springsecdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2025 at 21:13
 * File: null.java
 * Project: spring-sec-demo
 *
 * @author Frank GUEKENG
 * @date 01/08/2025
 * @time 21:13
 */
@RestController
public class HelloController {
    @GetMapping("hello")
    public String hello(HttpServletRequest request) {
        return "Hello, World! " + request.getSession().getId();
    }
    @GetMapping("about")
    public String about(HttpServletRequest request) {
        return "About " + request.getSession().getId();
    }
}
