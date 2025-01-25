package com.assistedproblem.animalhierarchy;

public class AnimalHierarchy {
    public static void main(String [] args){
        Animal animal = new Animal("Animal name" , 0);
        System.out.println("The name of the animal is: " + animal.getName());
        System.out.println("The age of the animal is: " + animal.getAge());
        animal.makeSound();

        Dog dog = new Dog("Simba",10);
        System.out.println("The name of the dog is: " + dog.getName());
        System.out.println("The age of the dog is: " + dog.getAge());
        dog.makeSound();

        Cat cat = new Cat("Luci",5);
        System.out.println("The name of the cat is: " + cat.getName());
        System.out.println("The age of the cat is: " + cat.getAge());
        cat.makeSound();

        Bird bird = new Bird("Sinni",8);
        System.out.println("The name of the bird is: " + bird.getName());
        System.out.println("The age of the bird is: " + bird.getAge());
        bird.makeSound();
    }
}
