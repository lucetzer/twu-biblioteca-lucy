package com.twu.biblioteca;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Library {

//    private final PrintStream out;
    PrintStream out = new PrintStream(System.out);
    ArrayList<String> menuItems = new ArrayList<String>(Arrays.asList("List library items"));
    ArrayList<String> userMenu = new ArrayList<String>();

    ArrayList<LibraryItem> bookList = new ArrayList<LibraryItem>();
    ArrayList<LibraryItem> movieList = new ArrayList<LibraryItem>();
    private ArrayList<User> userList = new ArrayList<User>();

//    Library() {
//        super();
//    }

    public void printMenu() {
        out.println("\nMAIN MENU");
        int index = 0;
        for (String item : menuItems) {
            index += 1;
            out.println(index + ". " + item);
        }
        out.println("Please make a selection by entering the number:");
    }

    public void printUserMenu() {
        System.out.println("\nUSER MENU");
        int index = 3;
        for (String item : userMenu) {
            index += 1;
            System.out.println(index + ". " + item);
        }
        System.out.println("Please enter the title you wish to checkout:");
        getOptionFromUserMenu();
    }

//    public void printBookList() {
////        int index = 0;
//        System.out.println("\nBOOKS");
//        for (LibraryItem book : bookList) {
////            index += 1;
////            out.print(index + ". " + book.getInfo());
//            out.print(book.getInfo());
//        }
//    }
//
//    public void printMovieList() {
////        int index = 0;
//        for (LibraryItem movie : movieList) {
//            index += 1;
//            out.print(index + ". " + movie.getInfo());
//        }
//    }

    public void printItemList() {
        System.out.println("\nBOOKS");
        for (LibraryItem book : bookList) {
            out.print(book.getInfo());
        }
        System.out.println("\nMOVIES");
        for (LibraryItem movie : movieList) {
            out.print(movie.getInfo());
        }
    }

    public void addToUserList(User user) {
        userList.add(user);
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public boolean removeBookFromList(Book book) {
        for (LibraryItem item : bookList) {
            if (item.equals(book)) {
                bookList.remove(item);
                return true;
            }
        }
        return false;
    }

    public boolean removeMovieFromList(Movie movie) {
        for (LibraryItem item : movieList) {
            if (item.equals(movie)) {
                movieList.remove(item);
                return true;
            }
        }
        return false;
    }

}
