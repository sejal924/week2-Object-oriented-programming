package com.multilevelinheritance.onlineRetailordermanagement;

//super class order
class Order{
    String name;
    int orderId;
    String orderDate;

    //constructor
    Order(String name, int orderId, String orderDate){
        this.name = name;
        this.orderId = orderId;
        this.orderDate= orderDate;
    }
    //method to display order status
    public void  getOrderStatus(){
        System.out.println("---The Status of the order---");
        System.out.println("The order name is: " + name);
        System.out.println("The oderId is: " + orderId);
        System.out.println("Order date is: " + orderDate);
    }
}
