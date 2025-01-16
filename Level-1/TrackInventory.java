import java.util.*;

//creating the class Items
class Items{
	String itemName;
	int itemCode;
	double price;
	
	//constructor
	Items(String itemName, int itemCode, double price){
	    this.itemName = itemName;
		this.itemCode = itemCode;
		this.price = price;
	}
	//creating the method calculateTotalCost
	public double calculateTotalCost(int quantity){
	       return quantity*price;
	}
	//creating the method displayItem to display the items details
	public void displayItemsDetails(){
	   System.out.println("Item details: ");
	   System.out.println("Name of the item is: " +itemName);
	   System.out.println("Code of the item is: " +itemCode);
	   System.out.println("price of the item is: " +price);
	   System.out.println("Total price of the item is: " + calculateTotalCost(4));
	}
}
public class TrackInventory{
    public static void main(String [] args){
		//creating the object
	    Items obj = new Items("Sugar" , 13456 , 24);
		//calling the displayItemsDetails
		obj.displayItemsDetails();
	}
}