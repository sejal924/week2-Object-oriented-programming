import java.util.*;

//creating the student class
class Student{
    String name;
	int rollNumber;
	double marks;
	
	//constructor
	Student(String name , int rollNumber , double marks){
	      this.name= name;
		  this.rollNumber = rollNumber;
		  this.marks = marks;
	}
	//method to find grade
	public char grade(double marks){  
        if(marks >=80){
		  return 'A';
        }
        else if(marks >=70){
		  return 'B';
        }
        else if(marks >=60){
		  return 'C';
        }
        else if(marks >=50){
		   return 'D';
        }
        else if(marks >=40){
		 return 'E';
        }
        else{
		  return 'R';
        }		
	}
	//method to display details
	public void displayDetails(){
	   System.out.println("Student Details: ");
       System.out.println("Name of the student is: " + name);
       System.out.println("Roll Number is: " + rollNumber);
       System.out.println("Marks of the student is: " + marks);
       System.out.println("Grade is: " + grade(marks));	   
	}
}
public class StudentReport{
    public static void main(String [] args){

	   Student st = new Student("Ram" , 49 , 76.4);
	   //calling method
	   st.displayDetails();
	}
}