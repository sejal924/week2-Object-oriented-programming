import java.util.*;

//creating the MobilePhone class
class MobilePhone{
    String brandName;
	String model;
	double price;
	
	//creating the method mobilePhone 
	public void mobilePhone(String brandName , String model , double price){
	       this.brandName = brandName;
		   this.model = model;
		   this.price = price;	   
	}
	//creating the method displayDetails for details of mobile phone
	public void displayDetails(){
	    System.out.println("Mobile details: ");
		System.out.println("Brand name of the mobile is: " + brandName);
		System.out.println("Mobile model is: " + model);
		System.out.println("price of the mobile is: " + price);
	}
}
public class MobilePhoneDetails{
    public static void main(String [] args){
		
	   //creating the object obj1 
	   MobilePhone obj1 = new MobilePhone();
	   //calling mobilePhone , displayDetails method
	   obj1.mobilePhone("Oppo" , "2345E5A" , 45000);
	   obj1.displayDetails();
	   
	   //creating the object obj2 
	   MobilePhone obj2 = new MobilePhone();
	   //calling mobilePhone , displayDetails method
	   obj2.mobilePhone("Vivo" , "6745E5D" , 55000);
	   obj2.displayDetails();
	}
}