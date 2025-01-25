package com.praticeproblem.employeemanagementsystem;

class PartTimeEmployee extends Employee {
     private double newSalary;
    private String department;

    PartTimeEmployee(String name, int employeeId, double baseSalary){
        super(name, employeeId, baseSalary);
    }

    public void assignDepartment(String department) {
        this.department = department;
    }

    public String getDepartmentDetails() {
        return department ;
    }

    @Override
    void calculateSalary() {
        this.newSalary = setSalary();
        newSalary = newSalary/2;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        calculateSalary();
        System.out.println("Employee department is: " + department);
        System.out.println("The employee is part time employee");
        System.out.println("New salary is: " + newSalary);
    }
}
