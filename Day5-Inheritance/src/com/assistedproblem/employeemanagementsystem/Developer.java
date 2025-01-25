package com.assistedproblem.employeemanagementsystem;

//subclass developer
class Developer extends Employee{
    protected String programmingLanguage ;
    //constructor
    Developer(String name, int id, double salary,String programmingLanguage){
        super(name,id,salary);
        this.programmingLanguage = programmingLanguage;
    }
    //overriding method displayDetails
    public void displayDetails(){
        System.out.println("----The Developer Details:---- " );
        System.out.println("The Developer name is: " + name);
        System.out.println("The id is: " + id);
        System.out.println("The salary is: " + salary);
        System.out.println("The programming language is: " + programmingLanguage);
    }
}
