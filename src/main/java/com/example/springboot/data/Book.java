package com.example.springboot.data;

public class Book {
    private String name;
    private String author;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }


}
