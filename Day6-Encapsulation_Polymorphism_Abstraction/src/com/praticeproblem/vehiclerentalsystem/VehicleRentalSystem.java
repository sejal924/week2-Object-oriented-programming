package com.praticeproblem.vehiclerentalsystem;

public class VehicleRentalSystem {
    public static void main(String [] args){
        Vehicle[] vehicle = new Vehicle[3];

        vehicle[0]=new Car("C2354","Car",800,300);
        vehicle[1]=new Bike("B1032","Bike",500,100);
        vehicle[2]=new Truck("T4553","Truck",1000,400);

        //calling method
        vehicle[0].calculateRentalCost(5);
        vehicle[1].calculateRentalCost(5);
        vehicle[2].calculateRentalCost(5);

        vehicle[0].displayDetails();
        vehicle[1].displayDetails();
        vehicle[2].displayDetails();
    }
}
