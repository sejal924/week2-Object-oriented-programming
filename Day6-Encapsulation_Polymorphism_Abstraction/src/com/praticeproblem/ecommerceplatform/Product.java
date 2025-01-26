package com.praticeproblem.ecommerceplatform;

abstract class Product {
    private int productId;
    private String productName;
    private double price;

    Product(String productName, int productId, double price) {
        this.productName = productName;
        this.productId = productId;
        this.price = price;
    }

    public double setPrice() {
         return price;
    }

    abstract void calculateDiscount();
    public void displayDetails(){
        System.out.println("---Product Details---");
        System.out.println("Product name: " + productName);
        System.out.println("Product Id is: " + productId);
        System.out.println("price is:" + price);
    }
}
