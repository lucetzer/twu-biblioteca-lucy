package com.twu.biblioteca;

public class Movie extends LibraryItem {

    private String title;
    private String year;
    private String director;
    private String rating;

    public Movie(String title, String year, String director, String rating) {
        this.title = title;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }

    public String getInfo() {
        return String.format("%-25s  %-5s  %-25s  %s%n", title, year, director, rating);
    }

    public String getName() {
        return title;
    }

}
