package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

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
        String newList = "Here is our book list:\n\n" + "TITLE                      AUTHOR           YEAR\n" +
            "LIFE OF PI                 Yann Martel      2001\n" +
            "THE CATCHER IN THE RYE     J.D. Salinger    1951\n" +
            "THE PROPHET                Kahlil Gibran    1923\n" +
            "TO KILL A MOCKINGBIRD      Harper Lee       1960\n";
        user.checkOutBook(menu, "The social animal");
        menu.printBookList();
        assertEquals(newList, outContent.toString());
    }

}
