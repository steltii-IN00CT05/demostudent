package com.studentsys.demostudent.controller;

import java.util.List;

import com.studentsys.demostudent.data.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentRestController {
    
    @GetMapping("courses")
    public List<Course> getCourses(){
        return my;
    }
}
