package com.gkfcsolution.springsecdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * Created on 2025 at 07:02
 * File: null.java
 * Project: spring-sec-demo
 *
 * @author Frank GUEKENG
 * @date 02/08/2025
 * @time 07:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Student {
    private int id;
    private String name;
    private String tech;
}
