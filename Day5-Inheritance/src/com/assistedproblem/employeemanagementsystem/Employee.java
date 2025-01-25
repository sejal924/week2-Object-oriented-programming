package com.assistedproblem.employeemanagementsystem;

//creating super class Employee
class Employee {
    protected String name;
    protected int id;
    protected double salary;

    //constructor
    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public double getSalary(){
        return salary;
    }
    //method to display details
    public void displayDetails(){
        System.out.println("----The Employee Details:---- " );
        System.out.println("The Employee name is: " + name);
        System.out.println("The id is: " + id);
        System.out.println("The salary is: " + salary);
    }

}
