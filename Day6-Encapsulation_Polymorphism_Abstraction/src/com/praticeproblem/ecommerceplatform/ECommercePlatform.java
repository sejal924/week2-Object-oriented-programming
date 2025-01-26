package com.praticeproblem.ecommerceplatform;

public class ECommercePlatform {
    public static void main(String [] args){
        Electronics electronic = new Electronics("Fridge",4532,20000,10);
        electronic.getTax(5);
        electronic.displayDetails();

        Clothing cloths = new Clothing("Dress",5672,2000,5);
        cloths.getTax(4);
        cloths.displayDetails();

        Groceries groceries = new Groceries("Cereals",2267,1000,5);
        groceries.getTax(2);
        groceries.displayDetails();
    }
}
