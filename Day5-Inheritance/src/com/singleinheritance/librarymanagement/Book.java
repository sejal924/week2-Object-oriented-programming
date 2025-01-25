package com.singleinheritance.librarymanagement;

//super class Book
class Book{
    String title;
    int publicationYear;

    //constructor
    Book(String title, int publicationYear){
        this.title = title;
        this.publicationYear=publicationYear;
    }
    //method to display information
    public void displayInfo(){
        System.out.println("---The book details:--- ");
        System.out.println("The title of the book is: " + title);
        System.out.println("The publication year is: " + publicationYear);
    }

}
