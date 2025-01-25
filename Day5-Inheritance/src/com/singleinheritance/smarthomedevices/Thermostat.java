package com.singleinheritance.smarthomedevices;

//sub class thermostat
class Thermostat extends Device{
    String temperatureSetting;

    //constructor
    Thermostat(String temperatureSetting,int deviceId,String status){
        super(deviceId,status);
        this.temperatureSetting = temperatureSetting;
    }
    //overriden method to display status
    public void displayStatus(){
        super.displayStatus();
        System.out.println("Temperature setting: " + temperatureSetting);
    }

}
