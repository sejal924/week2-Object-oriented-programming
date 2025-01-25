package com.assistedproblem.vehicletransportsystem;

public class VehicleTransportSystem{
    public static void main(String [] args){
        //creating vehicle array
        Vehicle[] vehicle = new Vehicle[3];

        vehicle[0]=new Car("SUV",160,"Disel",4);
        vehicle[1]=new Truck("Mahindra truck",200,"Disel",8);
        vehicle[2]=new Motorcycle("Pulsor",150,"Petrol",100);

        //calling method
        vehicle[0].displayInfo();
        vehicle[1].displayInfo();
        vehicle[2].displayInfo();
    }
}
