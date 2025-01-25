package com.praticeproblem.employeemanagementsystem;

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    Employee(String name, int employeeId, double baseSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
    }
    public void getSalary(double baseSalary){
        this.baseSalary=baseSalary;
    }
    public double setSalary()
    {
         return baseSalary;
    }

    abstract void calculateSalary();

    public void displayDetails() {
         System.out.println("---Employee Details:---");
         System.out.println("The name of the employee is: " + name);
         System.out.println("Employee id is: " + employeeId);
         System.out.println("Base salary is: " +  baseSalary);
    }
}
