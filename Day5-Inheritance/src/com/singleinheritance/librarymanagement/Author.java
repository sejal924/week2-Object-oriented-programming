package com.singleinheritance.librarymanagement;

//sub class author
class Author extends Book{
    String name;
    String bio;
    //constructor
    Author(String title, int publicationYear,String name, String bio){
        super(title,publicationYear);
        this.name= name;
        this.bio= bio;
    }
    //overriden method to display information
    public void displayInfo(){
        super.displayInfo();
        System.out.println("The name of the author is: " + name);
        System.out.println("Bio is: " + bio);
    }
}
