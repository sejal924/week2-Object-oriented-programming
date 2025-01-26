package com.praticeproblem.ecommerceplatform;

class Electronics extends Product implements Taxable{
    private int discount;
    private double newPrice;
    private double tax;
    Electronics(String productName, int productId, double price,int discount){
        super(productName, productId, price);
        this.discount=discount;
    }
    public void calculateDiscount(){
        this.newPrice = setPrice();
        newPrice = newPrice - (newPrice*discount)/100;
    }
      public void getTax(int tax){
        this.tax = tax;
      }
      public double setTax(){
        return tax;
      }
      public double calculateTax(){
        this.tax = (newPrice*tax)/100;
        tax = newPrice + tax;
          return tax;
      }
    public void getTaxDetails(){
       System.out.println("Tax is: " + setTax() + "%");
        System.out.println("After calculating tax, final price is: " + calculateTax());
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        calculateDiscount();
        System.out.println("Discount is:" + discount + "%");
        System.out.println("After discount price is: " + newPrice);
        getTaxDetails();
    }
}
