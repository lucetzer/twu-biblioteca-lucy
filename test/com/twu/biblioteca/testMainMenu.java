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
        WelcomeUserTest user = new WelcomeUserTest();
        menu.selectFromMenu(1);
        assertEquals(user.bookList, outContent.toString());
    }

    @Test
    public void testInvalidOption() {
        menu.selectFromMenu(8);
        assertEquals("Select a valid option!", outContent.toString());
    }





}
