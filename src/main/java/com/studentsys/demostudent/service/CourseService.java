package com.studentsys.demostudent.service;

import com.studentsys.demostudent.data.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    
    @Autowired
    CourseFileService myFileService;
    private List<Course> courses = new ArrayList<>();

    public CourseService(){
        try {
            courses = myFileService.readCoursesFromFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public List<Course> getCourses(){
        return new ArrayList<>(courses);
    }

    public List<Course> getCoursesByTeacher(String teacher){
        List<Course> foundCourses = new ArrayList<>();

        for (Course c : courses) {
            if (c.getTeacher().equals(teacher)) {
                foundCourses.add(c);
            }
        }

        return foundCourses;
    }




}
