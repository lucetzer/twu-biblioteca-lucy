package com.twu.biblioteca;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintStream;


public class BibliotecaApp {


    private static PrintStream out;
    Library library;

    private static final int LIBRARYLIST = 1;
    private static final int SIGNIN = 2;
//    private static final int CHECKOUT = 2;
//    private static final int RETURN = 3;
//    private static final int QUIT = 4;
//


    public BibliotecaApp(PrintStream out) {
        this.out = out;
        this.library = new Library(new PrintStream(out));
    }

    public void printWelcomeMsg() {
        out.println("Hello and welcome to Biblioteca! There is no friend as loyal as a book so find yours!");
    }
//
//    public void printGoodByeMsg() {
//        out.println("Thank you for using Biblioteca. Goodbye");
//    }
//
////    public void printInvalidMsg() {
////        out.print("Select a valid option!");
////    }
//
//    public void printPrompt() {
//        out.print("Please make a selection by entering the number:");
//    }
//
////    public void selectFromMenu(MainMenu menu, int option) {
////        switch(option) {
////            case BOOKLIST:
////                menu.printBookList();
////                prompt();
////                break;
////            case CHECKOUT:
////                getCheckOutBookFromUser(menu);
////                prompt();
////                break;
////            case RETURN:
////                getReturnBookFromUser(menu);
////                prompt();
////                break;
////            case QUIT:
////                printGoodByeMsg();
////                break;
////            default:
////                printInvalidMsg();
////                break;
////        }
////    }
//
//    public void prompt() {
//        printMenu();
//        printPrompt();
//    }
//
//    public enum ActionUserOption {
//
//        BOOKLIST(1),
//        CHECKOUT(2),
//        RETURN(3),
//        QUIT(4);
//
//        int item;
//
//        public static ActionUserOption getOption(int selectedOption) {
//            for(ActionUserOption option : values()) {
//                if (selectedOption == option.item) {
//                    return option;
//                } else {
//                    System.out.print("Select a valid option!");
//                }
//            }
//        }
//
//
//        BOOKLIST {
//            public void go() {
//                menu.printBookList();
//                prompt(menu);
//            }
//        },
//        CHECKOUT {
//            public void go() {
////                getCheckOutBookFromUser(menu);
////                prompt(menu);
//            }
//        },
//        RETURN {
//            public void go() {
////                getReturnBookFromUser(menu);
////                prompt(menu);
//            }
//        },
//        QUIT {
//            public void go() {
////                printGoodByeMsg();
//                System.out.print("Select a valid option!");
//
//            }
//        };
//
//    }
//
//
//    public void getCheckOutBookFromUser(MainMenu menu) {
//        out.println("Please enter the title of the book you wish to checkout:");
//        Scanner scanner = new Scanner(System.in);
//        String titleFromUser = scanner.nextLine();
//        menu.removeBookFromList(titleFromUser);
//    }
//
//    public void getReturnBookFromUser(MainMenu menu) {
//        out.println("Please enter the title of the book you wish to return:");
//        Scanner scanner = new Scanner(System.in);
//        String titleFromUser = scanner.nextLine();
//        menu.returnBook(titleFromUser);
//    }

    public void selectFromMainMenu(int option) {
        switch(option) {
            case LIBRARYLIST:
                out.println("BOOKS");
                library.printBookList();
                out.println("MOVIES");
                library.printMovieList();
        }
    }


    public static void main(String[] args) {
        BibliotecaApp biblib = new BibliotecaApp(System.out);
        biblib.printWelcomeMsg();
//        PrintStream outContent = new PrintStream();
//        Library library = new Library(out);
        biblib.library.menuItems.add("Sign in");
        LibraryItem theProphet = new Book("THE PROPHET", "Kahlil Gibran", "1923");

//        biblib.library.bookList.add(theProphet);
        biblib.library.libraryList.add(theProphet);




//
//        put("THE PROPHET", "Kahlil Gibran", "1923");
//        put("TO KILL A MOCKINGBIRD", "Harper Lee", "1960");
//        put("THE CATCHER IN THE RYE", "J.D. Salinger", "1951");
//        put("THE SOCIAL ANIMAL", "David Brooks, 2011");
//        put("LIFE OF PI", "Yann Martel, 2001");
//

        biblib.library.printMenu();
        System.out.println("Please make a selection by entering the number:");
        Scanner scanner = new Scanner(System.in);
//
        while(true) {
            String line = scanner.next();
            int option = Integer.parseInt(line);
            biblib.selectFromMainMenu(option);
//
////            biblio.selectFromMenu(bookMenu, option);
//            ActionUserOption.getOption(option, bookMenu).go();
        }
    }

}
