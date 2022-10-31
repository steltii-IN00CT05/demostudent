package com.studentsys.demostudent.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Service;

import com.studentsys.demostudent.data.Course;

@Service
public class CourseFileService {

    public void writeCoursesToFile(List<Course> courses) throws IOException {
        FileWriter fw = new FileWriter( new File("courses.txt"));
    }

    public List<Course> readCoursesFromFile() throws FileNotFoundException{
        Scanner sc = new Scanner(new File("courses.txt"));
        List<Course> courses = new ArrayList<>();
        
        return courses;
    }

}
