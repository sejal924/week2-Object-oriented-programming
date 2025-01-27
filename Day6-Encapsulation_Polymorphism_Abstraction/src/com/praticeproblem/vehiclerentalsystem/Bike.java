package com.praticeproblem.vehiclerentalsystem;

class Bike extends Vehicle implements Insurable{
    private int rate;
    private int days;
    private int insurance;
    Bike(String vehicleNumber, String type, int rentalRate,int insurance){
        super(vehicleNumber, type, rentalRate);
        this.insurance = insurance;
    }
    public int getInsurance(){
        return insurance;
    }
    void calculateRentalCost(int days){
        this.days= days;
        this.rate = getRentalRate();
        rate = rate*days;
    }
    public double calculateInsurance(){
        return getRentalRate()*getInsurance()/100;
    }
    public void getInsuranceDetails(){
        System.out.println("Insurance cost: " + getInsurance());
        System.out.println("calculated insurance is: " + calculateInsurance());
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Rental cost is: " + rate);
        getInsuranceDetails();
    }
}



