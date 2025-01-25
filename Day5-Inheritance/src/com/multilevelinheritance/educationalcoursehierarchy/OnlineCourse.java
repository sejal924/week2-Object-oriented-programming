package com.multilevelinheritance.educationalcoursehierarchy;

//sub class OnlineCourse
class OnlineCourse extends Course{
    String platform;
    String isRecorded;

    //constructor
    OnlineCourse(String courseName, String duration,String platform,String isRecorded){
        super(courseName,duration);
        this.platform=platform;
        this.isRecorded=isRecorded;
    }
    //overriden method to display details
    public void displayDetails(){
        super.displayDetails();
        System.out.println("platform is: " + platform);
        System.out.println("is course is recorded: " + isRecorded);
    }
}
