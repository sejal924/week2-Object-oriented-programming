//creating the Student class 
class Student {
    //creating instance variable
    String name;
    final int rollNumber;
    char grade;
    static String universityName = "XYZ University";
    static int totalStudents = 0;
	
    //constructor
    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }
    //method to display details
    public void displayStudentDetails() {
				 //checking whether the obj is an instance of  Student
        if (this instanceof Student) {
            System.out.println("Student Details:");
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
            System.out.println("University: " + universityName);
        } else {
            System.out.println("Invalid Student Object");
        }
    }
    //method to upgrade old grade
    public void updateGrade(char newGrade) {
            this.grade = newGrade;
       
    }
    //method to display total students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }
}
public class UniversityStudentManagement{
    public static void main(String[] args) {
		//creating object
        Student student1 = new Student("Neha", 101, 'A');
        Student student2 = new Student("Riya", 102, 'B');
        
		//calling methods
        student1.displayStudentDetails();
        student2.displayStudentDetails();

        student1.updateGrade('A+');
        student1.displayStudentDetails();

        displayTotalStudents(); 
    }
}