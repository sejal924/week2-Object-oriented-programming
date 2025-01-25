package com.multilevelinheritance.educationalcoursehierarchy;

//sub class PaidOnlineCourse
class  PaidOnlineCourse extends OnlineCourse{
    int fee;
    int discount;

    //constructor
    PaidOnlineCourse(String courseName, String duration,String platform,String isRecorded){
        super(courseName,duration,courseName,isRecorded);
    }
    //getter method
    public void getFee(int fee){
        this.fee = fee;
    }
    public void getDiscount(int discount){
        this.discount = discount;
    }
    //setter method
    public int setFee(){
        return fee;
    }
    public int setDiscount(){
        return discount;
    }
    public int discountedFees(){
        return fee - ((fee*discount)/100);
    }
    //overriding method to display details
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Course fees: " +  setFee());
        System.out.println("Discount on the fees: " + setDiscount() + "%");
        System.out.println("After discount on the fees: " + discountedFees());
    }
}
