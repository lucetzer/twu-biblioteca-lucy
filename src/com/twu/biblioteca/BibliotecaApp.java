package com.twu.biblioteca;

import java.io.*;
import java.util.Scanner;


public class BibliotecaApp {


    public String assessUserInput(String input) {

    }


    public static void main(String[] args) throws IOException {
        User luce = new User();
        luce.printMessage();
        MainMenu libraryMenu = new MainMenu();
        libraryMenu.addMenuItem("Quit");
        libraryMenu.printMenu();



    }
}
