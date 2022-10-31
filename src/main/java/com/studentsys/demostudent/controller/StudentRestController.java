package com.studentsys.demostudent.controller;

import com.studentsys.demostudent.data.Course;
import com.studentsys.demostudent.service.CourseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentRestController {

    @Autowired
    CourseService myCourseService;
    
    @GetMapping("courses")
    public List<Course> getCourses(){
        return myCourseService.getCourses();
    }


}
