package com.assistedproblem.vehicletransportsystem;

//sub class Car
class Car extends Vehicle{
    int seatCapacity;

    //constructor
    Car(String name,int maxSpeed, String fuelType, int seatCapacity){
        super(name,maxSpeed,fuelType);
        this.seatCapacity = seatCapacity;
    }
    //overriding method display details
    public void displayInfo(){
        System.out.println("----Car Details:---- ");
        System.out.println("The name of the car is: " + name);
        System.out.println("maximum speed is: " + maxSpeed);
        System.out.println("FuelType is: " + fuelType);
        System.out.println("Seat capacity is : " + seatCapacity);
    }
}
