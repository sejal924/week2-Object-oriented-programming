package com.singleinheritance.smarthomedevices;

public class SmartHomeDevices{
    public static void main(String[] args){
        //creaating object
        Device device = new Device(104,"new");
        //calling method
        device.displayStatus();
        Thermostat thermostat = new Thermostat("normal",202,"new");
        thermostat.displayStatus();
    }
}

