package com.assistedproblem.employeemanagementsystem;

public class EmployeeManagementSystem{
    public static void main(String [] args){
        //creating object
        Employee emp = new Employee("Neha Tiwari",101,45000);
        //method calling
        emp.displayDetails();

        Developer dev = new Developer("Anju Verma", 202 , 25000,"Java");
        dev.displayDetails();

        Manager mg = new Manager("Ram Kumar" , 504,30000 , 50);
        mg.displayDetails();

        Intern intern = new Intern("Riya Yadav" ,305,35000);
        intern.displayDetails();
    }
}

