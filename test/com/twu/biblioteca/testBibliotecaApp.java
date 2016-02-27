package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class testBibliotecaApp {

    BibliotecaApp biblioteca = new BibliotecaApp();
    User user = new User();
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
    public void testInvalidOption() {
        biblioteca.selectFromMenu(menu, 8, user);
        assertEquals("Select a valid option!", outContent.toString());
    }

    @Test
    public void testQuitOption() {
        biblioteca.selectFromMenu(menu, 4, user);
        assertEquals("Goodbye!", outContent.toString());
    }

}
