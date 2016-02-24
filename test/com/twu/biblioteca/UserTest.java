package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class UserTest {

    String message = "Hello and welcome to Biblioteca! There is no friend as loyal as a book so find yours!";
    User newUser = new User();
//    MainMenu menu = Mockito.mock(MainMenu.class);
    MainMenu menu = new MainMenu();

    @Test
    public void testPrintMessage() {
        assertEquals(message, newUser.printMessage());
    }

//    @Test
//    public String testCheckOutBook(int bookNumber) {
//        assertEquals()
//    }


}
