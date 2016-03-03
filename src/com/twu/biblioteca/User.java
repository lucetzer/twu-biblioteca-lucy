package com.twu.biblioteca;

public class User {

    private String name, email, phoneNumber, libraryNumber, password;
    private boolean status;

    public User(String name, String email, String number, String libraryNumber, String password) {
        this.name = name;
        this.email = email;
        this.phoneNumber = number;
        this.libraryNumber = libraryNumber;
        this.password = password;
    }

    public String getUserInfo() {
        return String.format("%-15s  %-25s  %s%n", name, email, phoneNumber);
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

}
