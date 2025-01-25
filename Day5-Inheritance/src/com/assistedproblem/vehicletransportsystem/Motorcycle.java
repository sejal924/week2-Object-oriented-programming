package com.assistedproblem.vehicletransportsystem;

//sub class motorcycle
class Motorcycle extends Vehicle{
    int enginePower;
    //constructor
    Motorcycle(String name,int maxSpeed, String fuelType, int enginePower){
        super(name,maxSpeed,fuelType);
        this.enginePower = enginePower;
    }
    //overriding method display details
    public void displayInfo(){
        System.out.println("----Motorcycle Details:---- ");
        System.out.println("The name of the Truck is: " + name);
        System.out.println("maximum speed is: " + maxSpeed);
        System.out.println("FuelType is: " + fuelType);
        System.out.println("engine power is : "+ enginePower);
    }
}

