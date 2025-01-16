import java.util.*;

//creating Book class
 class Book{
    String title;
	String author;
	double price;
	
	//constructor
	Book(String title, String author, double price){
	    this.title = title;
		this.author= author;
		this.price= price;
	}
	//method to display details of book
	public void displayDetails(){
	 System.out.println("Book Details: ");
	 System.out.println("Tile of the book is: " + title);
	 System.out.println("Author of the book is: " + author);
	 System.out.println("Price of the book is: " + price);
	}
}

public class BookDetails{
    public static void main(String[] args){
	    Book obj = new Book("Three Mistake of My life" , "Chetan Bhagat", 230);
		//calling the method
		obj.displayDetails();
	}
}