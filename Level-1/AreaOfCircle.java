import java.util.*;

//created Circle class
 class Circle{
    double radius;
	
	//constructor
	Circle(double radius){
	this.radius = radius;
	}
	//method to calculate area of circle
	public double calculateArea(){
	      double area = 3.14*radius*radius;
		  return area;
	}
	//method to calculate circumference
	public double calculateCircumference(){
	    double circumference = 2*3.14*radius;
		return circumference;
	}
	//method to display result
	public void display(){
	    System.out.println("Radius of the circle is: " + radius);
		System.out.println("Area of the cirlce is: " + calculateArea());
		System.out.println("Circumference of the circle is: " + calculateCircumference());
	}
}
public class AreaOfCircle{
    public static void main(String[] args){
	   Circle obj = new Circle(4);
	   //calling method
	   obj.display();
 
	}
}