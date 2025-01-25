package com.singleinheritance.smarthomedevices;

//super class Device
class Device{
    int deviceId;
    String status;
    //constructor
    Device(int deviceId,String status){
        this.deviceId = deviceId;
        this.status = status;
    }
    //method to display status
    public void displayStatus(){
        System.out.println("---Status of the device is---");
        System.out.println("Device id: " + deviceId);
        System.out.println("Status of the device is: " + status);
    }
}
