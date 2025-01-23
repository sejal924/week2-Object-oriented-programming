import java.util.*;

//creating library class 
class Library {
	//instance variable
  private  String libraryName;
   private List <Book> books;
	
	//constructor
	public Library(String libraryName){
	     this.libraryName = libraryName;
	     this.books = new ArrayList<>();
	}
	//method to add books
	public void getBook(Book book){
	   books.add(book);
	}
	//method to display details
	public void displayDetails(){
	    System.out.println("Library name: " + libraryName);
		
	   for(Book book : books){
	       System.out.print("List of book is: " );
		   book.details();
	   }
	   System.out.println();
	}
}
//creating book class
class Book{
  private String title;
  private String author;
   
   //constructor 
   public Book(String title, String author){
        this.title = title;
		this.author = author;
   }
   //method to get title
   public String getTitle(){
        return title;
   }
   //method to get author
   public String getAuthor(){
        return author;
   }
   //method to display details
   public void details(){
       System.out.println("title : " + getTitle());
       System.out.println("author : " + getAuthor());
   }
}

public class LibraryAndBook{
   public static void main(String[] args){
	   //creating object
       Library lib1 = new Library("ABC"); 
       Library lib2 = new Library("XYZ");	   
	   
	   Book b1 = new Book("The Sun" , "John");
	   Book b2 = new Book("The moon" , "Peter");
	   Book b3 = new Book("The start" , "Richal");
	   Book b4 = new Book ("The universe" , "Nelson");
	   
	   lib1.getBook(b1);
	   lib1.getBook(b2);
	   
	   lib2.getBook(b3);
	   lib2.getBook(b4);
	  //method calling 
	   lib1.displayDetails();
	   lib2.displayDetails();
   }
}

