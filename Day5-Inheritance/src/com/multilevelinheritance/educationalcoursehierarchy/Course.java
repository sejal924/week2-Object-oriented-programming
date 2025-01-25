package com.multilevelinheritance.educationalcoursehierarchy;

//super class course
class Course{
    String courseName;
    String duration;
    //constructor
    Course(String courseName, String duration){
        this.courseName = courseName;
        this.duration = duration;
    }
    //method to display details
    public void displayDetails(){
        System.out.println("---Details of the course---");
        System.out.println("Course name: " + courseName);
        System.out.println("Duration of the course: " + duration);
    }
}
