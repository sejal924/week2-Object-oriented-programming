import java.util.*;

//creating the Book class 
class Book{
	//creating instance variable
    static String libraryName = "ABC";
	String title;
	String author;
	final long isbn;
	
	//constructor
	Book(String title, String author, long isbn){
	    this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	//static method to display library name
	static void displayLibraryName(){
	 System.out.println("The name of the library is: " + libraryName);
	}
	//method to display details
	public void displayDetails(){
		displayLibraryName();
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("isbn: " + isbn);
	}
}

public class  LibraryManagementSystem{
    public static void main(String [] args){
		//creating object
	   Book obj = new Book("The three mistake of my life" , "Chetan Bhagat" , 345672);
       
	   //checking whether the obj is an instance of Book 
       if(obj instanceof Book){
	    obj.displayDetails(); 
       }
       else{
	    System.out.println("The object is not an instance of Book class");
       }
         	
	}
}
