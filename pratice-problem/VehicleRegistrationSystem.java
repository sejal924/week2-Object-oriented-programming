 //creating the Vehicle class 
 class Vehicle {
    //creating instance variable
    String ownerName;
    String vehicleType;
    final String registrationNumber;
    static double registrationFee = 1000.0; 
	
    //constructor
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber; 
    }
    //method to display details
    public void displayRegistrationDetails() {
	     //checking whether the obj is an instance of  Vehicle
        if (this instanceof Vehicle) { 
            System.out.println("Registration Details:");
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee); 
        } else {
            System.out.println("Invalid Vehicle Object");
        }
    }
     //method to updade registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}
public class VehicleRegistrationSystem{
    public static void main(String[] args) {
		//creating object
        Vehicle car = new Vehicle("Neha Tiwari", "Car", "MH01AB1234");
        Vehicle bike = new Vehicle("Riya Yadav", "Motorcycle", "MH02CD5678");

        // Update registration fee
        Vehicle.updateRegistrationFee(1200.0);
        
		//calling object
        car.displayRegistrationDetails();
        bike.displayRegistrationDetails();
    }
}