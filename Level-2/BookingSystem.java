import java.util.*;

//creating MovieTicket class
class MovieTicket{
    String movieName;
	int seatNumber;
	double price;
	
	// method to set name
    public void setName(String movieName){
	     this.movieName= movieName;
    }
    //method to book ticket	
	public void bookTicket(int seatNumber, double price){
	    this.seatNumber = seatNumber;
		this.price = price ;
    }
//method to display result	
	public void display(){
	   System.out.println("Ticket Details: ");
	   System.out.println("Name of the movie is: "+ movieName);
	   System.out.println("Seat number is: " + seatNumber);
	   System.out.println("Price of the ticket is: "+ price);
	}
}

public class BookingSystem{
    public static void main(String [] args){
	   Scanner sc = new Scanner(System.in);
	   
	   //taking input from user
       System.out.print("Enter the movie name: ");
       String movieName = sc.next();
       System.out.print("Enter the seat number: ");
       int seatNumber = sc.nextInt();
       System.out.print("Enter the price: ");
       double price = sc.nextDouble();

       MovieTicket tickets = new MovieTicket();
	   //calling methods
       tickets.setName(movieName);
       tickets.bookTicket(seatNumber, price);
       tickets.display();

       sc.close();	   
	}
}