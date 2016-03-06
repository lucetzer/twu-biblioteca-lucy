package com.twu.biblioteca;

public class Book extends LibraryItem {

    private String title;
    private String author;
    private String year;

    public Book(String title, String author, String year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getInfo() {
        return String.format("%-25s  %-15s  %s%n", title, author, year);
    }

    public String getName() {
        return title;
    }


}
