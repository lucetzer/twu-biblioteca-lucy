package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;


public class testMainMenu {
    String menuOptions = "MAIN MENU\nList Books\n";
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
        menu.selectFromMenu("List books");
        assertEquals(user.bookList, outContent.toString());
    }

    @Test (expected = RuntimeException.class)
    public void testSelectFromMenuError() {
        try {
            menu.selectFromMenu("invalid option");
        }
        catch(RuntimeException re) {
            String message = "That option is not available. Please select a valid option";
            assertEquals(message, re.getMessage());
            throw re;
        }
        fail("Invalid option did not throw!");
    }

    private void fail(String s) {
    }

}
