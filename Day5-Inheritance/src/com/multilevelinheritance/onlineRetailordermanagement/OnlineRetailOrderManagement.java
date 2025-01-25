package com.multilevelinheritance.onlineRetailordermanagement;

public class OnlineRetailOrderManagement{
    public static void main(String [] args){
        //object creating
        DeliveredOrder deliveryOrder = new DeliveredOrder("Shirt",3456,"24/01/2025",23578394,"01/02/2024");
        //method calling
        deliveryOrder.getOrderStatus();
    }
}

