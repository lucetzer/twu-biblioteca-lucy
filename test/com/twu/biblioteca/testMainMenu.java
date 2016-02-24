package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;


public class testMainMenu {
    String menuOptions = "MAIN MENU\n1. List Books\n";
    MainMenu menu = new MainMenu();
    String bookList = "Here is our book list:\n\n" + "TITLE                      AUTHOR           YEAR\n" +
        "1. The Prophet             Kahlil Gibran    1923\n" +
        "2. To Kill a Mockingbird   Harper Lee       1960\n" +
        "3. The Catcher in the Rye  J.D. Salinger    1951\n" +
        "4. The Social Animal       David Brooks     2011\n" +
        "5. Life of Pi              Yann Martel      2001\n";

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
    public void testSelectFromMenu() {
        menu.selectFromMenu(1);
        assertEquals(bookList, outContent.toString());
    }

    @Test
    public void testPrintBookList() {
        menu.printBookList();
        assertEquals(bookList, outContent.toString());
    }

    @Test
    public void testInvalidOption() {
        menu.selectFromMenu(8);
        assertEquals("Select a valid option!", outContent.toString());
    }

    @Test
    public void testQuitOption() {
        menu.selectFromMenu(2);
        assertEquals("Goodbye!", outContent.toString());
    }

    @Test
    public void testAddMenuItem() {
        menu.addMenuItem("Quit");
        menu.printMenu();
        assertEquals("MAIN MENU\n1. List Books\n2. Quit\n", outContent.toString());
    }

}
