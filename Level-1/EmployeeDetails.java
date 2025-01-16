import java.util.*;

//creating employee class 
class Employee{
       String name;
	   int id;
	   double salary;
	   
	   //constructor
	   Employee(String name, int id, double salary){
	        this.name=name;
			this.id=id;
			this.salary=salary;
	   }
	   //method to display details
	   public  void displayDetails(){
	       System.out.println("Employee details: ");
	       System.out.println("Employee name is: " + name);
		   System.out.println("Employee id is: " + id);
		   System.out.println("Employee salary is: " + salary);
	   }
}
public class EmployeeDetails{  
    public static void main(String [] args){
	      Employee emp = new Employee("Arsh Tiwari" , 10456 , 80000);
		  //calling method
		  emp.displayDetails();
	}
}