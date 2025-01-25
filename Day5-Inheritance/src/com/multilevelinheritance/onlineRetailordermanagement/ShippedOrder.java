package com.multilevelinheritance.onlineRetailordermanagement;

//sub class ShippedOrder
class ShippedOrder extends Order{
    long trackingNumber;

    //constructor
    ShippedOrder(String name, int orderId, String orderDate,long trackingNumber){
        super(name, orderId,orderDate);
        this.trackingNumber = trackingNumber;
    }
    //overriding method to display order status
    public void  getOrderStatus(){
        super.getOrderStatus();
        System.out.println("Tracking number of the order: " + trackingNumber);
    }
}
