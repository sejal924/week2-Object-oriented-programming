package com.praticeproblem.vehiclerentalsystem;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private int rentalRate;

    Vehicle(String vehicleNumber, String type, int rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }
    public int getRentalRate(){
        return rentalRate;
    }

    abstract void calculateRentalCost(int days);

    public void displayDetails() {
        System.out.println("---Vehicle Details:---");
        System.out.println("Vehicle number is: " + vehicleNumber);
        System.out.println("Vehicle type: "+ type);
        System.out.println("rental rate is: " + rentalRate + "per day");
    }
    }
