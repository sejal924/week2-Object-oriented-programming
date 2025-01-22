 //creating the Product class 
 class Product {
    //creating instance variable
    String productName;
    double price;
    int quantity;
    final int productID;
    static double discount = 0.0; 
    static int productCount = 0; 
    
	//constructor
    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = ++productCount; 
    }
    //method to get discount 
    public double getDiscountedPrice() {
	    //checking whether the obj is an instance of  Product
        if (this instanceof Product) { 
            return price - (price * discount / 100);
        } else {
            System.out.println("Invalid Product Object");
            return 0.0; 
        }
    }
    //method to get toal price
    public double getTotalPrice() {
            return getDiscountedPrice() * quantity;
        
    }
	//method to update discount
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }
 }
public class ShoppingCartSystem{
    public static void main(String[] args) {
		//creating object
        Product product1 = new Product("Laptop", 1000.0, 1);
        Product product2 = new Product("Mouse", 50.0, 2);

        // Apply a 10% discount
        Product.updateDiscount(10);
        
		//calling method
        System.out.println("Product 1 Total Price: " + product1.getTotalPrice()); 
        System.out.println("Product 2 Total Price: " + product2.getTotalPrice());
    }
}