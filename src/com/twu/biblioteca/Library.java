package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Library {


    protected UserOutput output;
//    private final PrintStream out;
//    PrintStream out = new PrintStream(System.out);
    ArrayList<String> menuItems = new ArrayList<String>(Arrays.asList("List library items"));
//    ArrayList<String> userMenu = new ArrayList<String>();

    ArrayList<LibraryItem> bookList = new ArrayList<LibraryItem>();
    ArrayList<LibraryItem> movieList = new ArrayList<LibraryItem>();
    private ArrayList<User> userList = new ArrayList<User>();
    private static final String UNAVAILABLE_MSG = "That item is not available.";
    private static final String INVALID_RETURN_MSG = "That is not a valid item to return";
    ArrayList<LibraryItem> checkedOutItems = new ArrayList<LibraryItem>();


    public void printMenu() {
        System.out.println("\nMAIN MENU");
        int index = 0;
        for (String item : menuItems) {
            index += 1;
            System.out.println(index + ". " + item);
        }
        System.out.println("Please make a selection by entering the number:");
    }

    public void printItemList() {
        System.out.println("\nBOOKS");
        for (LibraryItem book : bookList) {
            System.out.print(book.getInfo());
        }
        System.out.println("\nMOVIES");
        for (LibraryItem movie : movieList) {
            System.out.print(movie.getInfo());
        }
    }

    public void addToUserList(User user) {
        userList.add(user);
    }

    public ArrayList<User> getUserList() {
        return userList;
    }



    public Object checkOutItem(String selectedItem, User currentUser) {
        for (LibraryItem book : bookList) {
            if (selectedItem.equals(book.getName())) {
                checkedOutItems.add(book);
                currentUser.addToBorrowedItems(book);
                System.out.println("You've successfully checked out " + book.getName() + ". Enjoy!");
                bookList.remove(book);
                return book;
            }
        }
        for (LibraryItem movie : movieList) {
            if (selectedItem.equals(movie.getName())) {
                checkedOutItems.add(movie);
                currentUser.addToBorrowedItems(movie);
                System.out.println("You've successfully checked out " + movie.getName() + ". Enjoy!");
                movieList.remove(movie);
                return movie;
            }
        }
        return UNAVAILABLE_MSG;
    }

    public Object returnItem(String itemToReturn, User user) {
        for (LibraryItem item : checkedOutItems) {
            if (itemToReturn.equals(item.getName())) {
                System.out.println("Thank you for returning " + itemToReturn + ".");
                addItemBackToRelevantList(item);
                user.removeFromBorrowedItems(item);
            }
        }
        return INVALID_RETURN_MSG;
    }

    public void addItemBackToRelevantList(LibraryItem item) {
        if (item instanceof Book) {
            bookList.add(item);
        } else {
            movieList.add(item);
        }
    }

}
