//creating the Patient class 
 class Patient {
    //creating instance variable
    String name;
    int age;
    String ailment;
    final int patientID;
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;
    
	//constructor
    public Patient(String name, int age, String ailment) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = ++totalPatients; // Generate unique ID
    }
    //method to display details
    public void displayPatientDetails() {
		 //checking whether the obj is an instance of  Patient
        if (this instanceof Patient) { 
            System.out.println("-----Patient Details:-----");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Hospital: " + hospitalName);
        } else {
            System.out.println("Invalid Patient Object");
        }
    }
    //method to get total patients
    public static int getTotalPatients() {
        return totalPatients;
    }
}
public class HospitalManagementSystem{
    public static void main(String[] args) {
		//creating object
        Patient patient1 = new Patient("Neha Tiwari", 45, "Fever");
        Patient patient2 = new Patient("Riya Yadav", 30, "Injury");

        //calling methods
        patient1.displayPatientDetails();
        patient2.displayPatientDetails();

        System.out.println("Total Patients Admitted: " + Patient.getTotalPatients()); 
    }
}