import java.util.*;

//creating the class Cart
class CartItem{
    String itemName;
	double price;
	double quantity;
	
	//method to add item into card
	public void addToCard(String itemName){
	    this.itemName = itemName;
	}
	
	//method to calculate the total cost
	public void totalCost(double price , double quantity){
	    double result = price*quantity;
		System.out.println("The name of the Item is: " + itemName);
	    System.out.println("The total price of the item is: " + result);
	}
	//method to remove item from cart
	 CartItem(){
	      itemName = null;
		  price = 0;
		  quantity =0;
		  System.out.println("The name of the Item is: " + itemName);
		  System.out.println("The price of the item is: " + price);
		  System.out.println("The quantity of the item is: " + quantity);
	}
}

public class ShoppingCart{
    public static void main(String [] args){
	    Scanner sc = new Scanner(System.in);
		
		//taking input item from user
		System.out.print("Enter the item: ");
		String itemName = sc.next();
		
		System.out.print("Enter the quantity: ");
		//taking input quantity from user
		double quantity = sc.nextDouble();
		
		//taking input price from user	
		System.out.print("Enter the price: ");
		double price = sc.nextDouble();
		
		//creating object items
		CartItem items = new CartItem();
		
		//calling method
		items.addToCard(itemName);
		items.totalCost(quantity, price);
		//items.CardItem();
		
		sc.close();
	}
}
