package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;


public class UserTest {

    String message = "Hello and welcome to Biblioteca! There is no friend as loyal as a book so find yours!";
    User user = new User();
//    MainMenu menu = Mockito.mock(MainMenu.class);
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
    public void testPrintMessage() {
        assertEquals(message, user.printMessage());
    }

    @Test
    public void testCheckOutBook() {
        String newList = "You have successfully checked out THE SOCIAL ANIMAL.";
        user.checkOutBook(menu, "The social animal");
        assertEquals(false, menu.bookList.containsKey("THE SOCIAL ANIMAL"));
        assertEquals(newList, outContent.toString());
    }

}
