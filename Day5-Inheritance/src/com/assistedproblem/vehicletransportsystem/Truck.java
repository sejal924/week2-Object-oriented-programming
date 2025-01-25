package com.assistedproblem.vehicletransportsystem;

//sub class Truck
class Truck extends Vehicle{
    int noOfWheel;
    Truck(String name,int maxSpeed, String fuelType, int noOfWheel){
        super(name,maxSpeed,fuelType);
        this.noOfWheel = noOfWheel;
    }
    //overriding method display details
    public void displayInfo(){
        System.out.println("----Truck Details:---- ");
        System.out.println("The name of the Truck is: " + name);
        System.out.println("maximum speed is: " + maxSpeed);
        System.out.println("FuelType is: " + fuelType);
        System.out.println("number of wheels is : " + noOfWheel);
    }
}
