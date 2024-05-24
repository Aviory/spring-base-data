package com.example.springboot.data;


import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<Book>();
    public Library(){
        init();
    }
   public void init(){
       books.add(new Book("Harry Potter", "J.K. Rowling"));
       books.add(new Book("Lord of the Rings", "J.R.R. Tolkien"));
       books.add(new Book("The Hobbit", "J.R.R. Tolkien"));
   }
   public ArrayList<Book> getBooks(){
       return books;
   }

    public void addBook(Book book) {
        books.add(book);
    }
}
