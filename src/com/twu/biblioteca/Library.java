package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Library {

    private final PrintStream out;
    ArrayList<String> menuItems = new ArrayList<String>(Arrays.asList("List Books"));
    ArrayList<Book> bookList = new ArrayList<Book>();
    ArrayList<Movie> movieList = new ArrayList<Movie>();
    private ArrayList<User> userList = new ArrayList<User>();

    public Library(PrintStream out) {
        this.out = out;
    }

    public void printMenu() {
        out.println("MAIN MENU");
        int index = 0;
        for (String item : menuItems) {
            index += 1;
            out.println(index + ". " + item);
        }
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

    public void addToUserList(User user) {
        userList.add(user);
    }

    public ArrayList getUserList() {
        return userList;
    }

}
