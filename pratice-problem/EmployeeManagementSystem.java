import java.util.*;
//creating the Employee class 
class Employee{
	//creating instance variable
    String name;
	final int id;
	String designation;
    static String companyName = "ABC";
	static int totalEmployees =0;
	
	//constructor
	Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++; 
    }
	//method to display details
	public void displayEmployeeDetails() {
		 //checking whether the obj is an instance of  Employee
        if (this instanceof Employee) { 
            System.out.println("------Employee Details:------");
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
            System.out.println("Company: " + companyName);
        } else {
            System.out.println("Invalid Employee Object");
        }
    }
    //method to display total employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
}
public class  EmployeeManagementSystem{
    public static void main(String[] args) {
		//creating object
        Employee employee1 = new Employee("Neha Tiwari", 101, "Manager");
        Employee employee2 = new Employee("Riya Yadav", 102, "Engineer");
        
		//calling method
        employee1.displayEmployeeDetails();
        employee2.displayEmployeeDetails();

        Employee.displayTotalEmployees(); 
    }
}