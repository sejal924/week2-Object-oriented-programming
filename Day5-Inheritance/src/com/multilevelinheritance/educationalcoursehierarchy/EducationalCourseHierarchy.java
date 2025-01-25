package com.multilevelinheritance.educationalcoursehierarchy;

public class  EducationalCourseHierarchy{
    public static void main(String[] args){
        //creating object
        PaidOnlineCourse pc = new PaidOnlineCourse("Java","4-month","youtube","yes");
        //calling method
        pc.getFee(5000);
        pc.getDiscount(10);
        pc.displayDetails();
    }
}

