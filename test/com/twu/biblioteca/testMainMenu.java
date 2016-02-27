package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;


public class testMainMenu {
    String menuOptions = "\nMAIN MENU\n1. List Books\n";
    MainMenu menu = new MainMenu();
    String bookList = "Here is our book list:\n\n" + "TITLE                      AUTHOR           YEAR\n" +
        "LIFE OF PI                 Yann Martel      2001\n" +
        "THE CATCHER IN THE RYE     J.D. Salinger    1951\n" +
        "THE PROPHET                Kahlil Gibran    1923\n" +
        "THE SOCIAL ANIMAL          David Brooks     2011\n" +
        "TO KILL A MOCKINGBIRD      Harper Lee       1960\n";

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void testPrintMenu() {
        menu.printMenu();
        assertEquals(menuOptions, outContent.toString());
    }

    @Test
    public void testPrintBookList() {
        menu.printBookList();
        assertEquals(bookList, outContent.toString());
    }

    @Test
    public void testAddMenuItem() {
        menu.addMenuItem("Quit");
        menu.printMenu();
        assertEquals("\nMAIN MENU\n1. List Books\n2. Quit\n", outContent.toString());
    }


}
