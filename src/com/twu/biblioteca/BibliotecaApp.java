package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintStream;


public class BibliotecaApp {


    private final PrintStream out;

    public BibliotecaApp(PrintStream out) {
        this.out = out;
    }

//    private static final int BOOKLIST = 1;
//    private static final int CHECKOUT = 2;
//    private static final int RETURN = 3;
//    private static final int QUIT = 4;
//
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
//
//    public static void main(String[] args) {
//        BibliotecaApp biblio = new BibliotecaApp(System.out);
//        biblio.printWelcomeMsg();
//        MainMenu bookMenu = new MainMenu();
//        biblio.addMenuItem("Checkout book");
//        biblio.addMenuItem("Return book");
//        biblio.addMenuItem("Quit");
//        biblio.printMenu();
//
//        System.out.println("Please make a selection by entering the number:");
//
//        Scanner scanner = new Scanner(System.in);
//
//        while(true) {
//            String line = scanner.next();
//            int option = Integer.parseInt(line);
////            biblio.selectFromMenu(bookMenu, option);
//            ActionUserOption.getOption(option, bookMenu).go();
//        }
//    }

}
