package com.example.demo;

public class Student {
    private String name;
    private String course;
    private int marks;


    public Student(String name, String course,int marks) {
        this.name = name;
        this.marks = marks;
        this.course = course;
    }

 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
