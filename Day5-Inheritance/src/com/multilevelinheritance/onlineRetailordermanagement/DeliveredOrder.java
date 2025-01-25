package com.multilevelinheritance.onlineRetailordermanagement;

//sub class DeliveredOrder
class DeliveredOrder extends ShippedOrder{
    String deliveryDate;
    //constructor
    DeliveredOrder(String name, int orderId, String orderDate,long trackingNumber,String deliveryDate){
        super(name, orderId,orderDate,trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    //overriden method to display order status
    public void  getOrderStatus(){
        super.getOrderStatus();
        System.out.println("Delivery date is: " + deliveryDate);
    }
}
