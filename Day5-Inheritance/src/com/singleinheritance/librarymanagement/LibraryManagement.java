package com.singleinheritance.librarymanagement;

public class  LibraryManagement{
    public static void main(String[] args){
        //creating object
        Book book = new Book("100 rules",1990);
        //calling method
        book.displayInfo();
        Author author = new Author("100 rules",1990,"Chetan Bhagat","fictional writer");
        author.displayInfo();
    }
}
