package com.studentsys.demostudent.data;

public class Course {
    private String courseName = "";
    private String teacher = "";
    private int courseId = 0;

    public static int count = 0;

    public Course(){
        this("","");
    }

    public Course(String courseName, String teacher){
        this.courseName = courseName;
        this.teacher = teacher;
        
        this.courseId = count++;
    }
    
    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacher() {
        return this.teacher;
    }
    
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
    
    public int getCourseId() {
        return this.courseId;
    }
    
    
    
}
