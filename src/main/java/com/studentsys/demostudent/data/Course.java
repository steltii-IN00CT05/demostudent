package com.studentsys.demostudent.data;

public class Course {
    private String cname;
    private String teacher;
    private int room;
    private int cid;

    public static int count = 0;

    public Course(String cname, String teacher, int room){
        this.cname = cname;
        this.teacher = teacher;
        this.room = room;
        this.cid = count++;
    }
    
    public String getCname() {
        return this.cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getTeacher() {
        return this.teacher;
    }
    
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
    
    public int getRoom() {
        return this.room;
    }

    public void setRoom(int room) {
        this.room = room;
    }
    
    public int getCid() {
        return this.cid;
    }
    
    
    
}
