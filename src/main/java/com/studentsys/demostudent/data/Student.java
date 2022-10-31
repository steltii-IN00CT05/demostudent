package com.studentsys.demostudent.data;

public class Student {
    private String firstName;
    private String lastName;
    private int studentId;
    
    public static int studentIdCount = 0;

    public Student(){
        
    }
    
    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        this.studentId = studentIdCount++;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentId() {
        return this.studentId;
    }


}
