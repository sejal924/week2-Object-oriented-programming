package com.assistedproblem.vehicletransportsystem;

//super class Vehicle
class Vehicle{
    String name;
    int maxSpeed;
    String fuelType;

    //constructor
    Vehicle(String name,int maxSpeed, String fuelType){
        this.name=name;
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    //method to display information
    public void displayInfo(){
        System.out.println("----Vehicle Details:---- ");
        System.out.println("The name of the vehicle is: " + name);
        System.out.println("maximum speed is: " + maxSpeed);
        System.out.println("FuelType is: " + fuelType);
    }
}
