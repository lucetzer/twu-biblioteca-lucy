package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

public class Library {

    private final PrintStream out;
    ArrayList<Book> bookList = new ArrayList<Book>();
    ArrayList<Movie> movieList = new ArrayList<Movie>();

    public Library(PrintStream out) {
        this.out = out;
    }

    public void printBookList() {
        int index = 0;
        for (Book book : bookList) {
            index += 1;
            out.print(index + ". " + book.getBookDetails());
        }
    }

    public void printMovieList() {
        int index = 0;
        for (Movie movie : movieList) {
            index += 1;
            out.print(index + ". " + movie.getMovieDetails());
        }
    }


}
