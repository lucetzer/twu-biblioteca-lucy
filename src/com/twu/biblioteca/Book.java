package com.twu.biblioteca;

public class Book {

    private String title;
    private String author;
    private String year;

    public Book(String title, String author, String year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getBookDetails() {
        return String.format("%-25s  %-15s  %s%n", title, author, year);
    }

}
