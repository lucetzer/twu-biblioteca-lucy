//package com.twu.biblioteca;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.Mockito;
//
//import java.io.ByteArrayOutputStream;
//import java.io.PrintStream;
//
//import static org.junit.Assert.assertEquals;
//
//
//public class testBibliotecaApp {
//
//    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//    BibliotecaApp bibApp = new BibliotecaApp(new PrintStream(outContent));
////    Library library = Mockito.mock(Library.class);
//    Library library = new Library(new PrintStream(outContent));
//    User user1 = Mockito.mock(User.class);
//
//    @Test
//    public void shouldDisplayWelcomeMessage() throws Exception {
//        bibApp.printWelcomeMsg();
//        String actual = outContent.toString().trim();
//        String message = "Hello and welcome to Biblioteca! There is no friend as loyal as a book so find yours!\n";
//        assertEquals(message, actual);
//    }
//
//    @Test
//    public void anyUserCanSeeLibraryItems() {
//        String expected = "test";
//        bibApp.selectFromMainMenu(1);
//        String actual = outContent.toString().trim();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void usersCanSignInUponSelection() {
//        bibApp.selectFromMainMenu(1);
//    }
//
//    @Before
//    public void setUpStreams() {
//        System.setOut(new PrintStream(outContent));
//    }
//
//    @After
//    public void cleanUpStreams() {
//        System.setOut(null);
//    }
//
//    @Test
//    public void testInvalidOption() {
//        biblioteca.selectFromMenu(menu, 8, user);
//        assertEquals("Select a valid option!", outContent.toString());
//    }
//
//    @Test
//    public void testQuitOption() {
//        biblioteca.selectFromMenu(menu, 4, user);
//        assertEquals("Goodbye!", outContent.toString());
//    }
////
//}
