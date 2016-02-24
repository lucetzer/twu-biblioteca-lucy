package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class UserTest {

    String message = "Hello and welcome to Biblioteca! There is no friend as loyal as a book so find yours!";
    User user = new User();
//    MainMenu menu = Mockito.mock(MainMenu.class);
    MainMenu menu = new MainMenu();

    @Test
    public void testPrintMessage() {
        assertEquals(message, user.printMessage());
    }

    @Test
    public void testCheckOutBook() {
        String newList = "Here is our book list:\n\n" + "TITLE                      AUTHOR           YEAR\n" +
            "1. The Prophet             Kahlil Gibran    1923\n" +
            "2. To Kill a Mockingbird   Harper Lee       1960\n" +
            "3. The Catcher in the Rye  J.D. Salinger    1951\n" +
            "4. Life of Pi              Yann Martel      2001\n";
        assertEquals(newList, user.checkOutBook(menu));
    }


}
