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
        String message = "You have successfully checked out THE SOCIAL ANIMAL by David Brooks, 2011. Thank you! Enjoy the book.";
        user.checkOutBook(menu, "The social animal");
        assertEquals(false, menu.bookList.containsKey("THE SOCIAL ANIMAL"));
        assertEquals(message, outContent.toString());
    }

    @Test
    public void testUnsuccessfulCheckout() {
        String message = "That book is unavailable. Please select a book from the list.";
        user.checkOutBook(menu, "The Unknown Book");
        assertEquals(message, outContent.toString());
    }

    @Test
    public void testReturnBook() {
        user.checkOutBook(menu, "The social animal");
        user.returnBook(menu, "The social animal");
        assertEquals(true, menu.bookList.containsKey("THE SOCIAL ANIMAL"));
    }



}
