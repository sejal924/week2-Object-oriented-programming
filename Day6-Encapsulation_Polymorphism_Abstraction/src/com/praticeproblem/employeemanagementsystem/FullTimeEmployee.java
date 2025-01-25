package com.praticeproblem.employeemanagementsystem;

class FullTimeEmployee extends Employee implements Department {
    private double newSalary;
    private String department;

    FullTimeEmployee(String name, int employeeId, double baseSalary) {
        super(name, employeeId, baseSalary);
    }

    void calculateSalary() {
        this.newSalary = setSalary();
        newSalary = newSalary + 20000;
    }

     public void assignDepartment(String department) {
        this.department = department;
    }
    @Override
     public String getDepartmentDetails() {
        return department ;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        calculateSalary();
        System.out.println("Employee department is: " + department);
        System.out.println("The employee is full time employee");
        System.out.println("New Salary is: " + newSalary);
    }
}
