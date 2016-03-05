package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name, email, phoneNumber, libraryNumber, password;
    private boolean status;
    private List<Object> borrowedItems = new ArrayList<Object>();

    public User(String name, String email, String number, String libraryNumber, String password) {
        this.name = name;
        this.email = email;
        this.phoneNumber = number;
        this.libraryNumber = libraryNumber;
        this.password = password;
    }

    public String getUserInfo() {
        if (status) {
            return String.format("%-15s  %-25s  %s%n", name, email, phoneNumber);
        }
        return "Please sign in to see your details.";
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }

    public String getPassword() {
        return password;
    }

    public boolean changeStatus() {
        status = true;
        return true;
    }

    public boolean getStatus() {
        return status;
    }

    public boolean signOut(Library library) {
        status = false;
        library.printMenu();
        return false;
    }

    public void addToBorrowedItems(Object item) {
        borrowedItems.add(item);
    }

    public List<Object> getBorrowedItems() {
        return borrowedItems;
    }

}
