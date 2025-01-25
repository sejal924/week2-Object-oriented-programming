package com.praticeproblem.employeemanagementsystem;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        FullTimeEmployee fulltime = new FullTimeEmployee("Neha Tiwari",402,30000);
        fulltime.assignDepartment("Civil");
        fulltime.displayDetails();

        PartTimeEmployee parttime = new PartTimeEmployee("Riya Yadav",201,30000);
        parttime.assignDepartment("Electrical");
        parttime.displayDetails();
    }
}
