package com.assistedproblem.animalhierarchy;

class Cat extends Animal{
    Cat(String name, int age){
        super(name,age);
    }
    public void makeSound(){
        System.out.println("Cat meow....");
    }
}