package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.assertEquals;
import org.junit.Before;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class testUserManager {

//    Library lib = Mockito.mock(Library.class);
    Library lib = new Library();
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    UserManager userMgr = new UserManager(lib, new PrintStream(outContent));
    User user1 = Mockito.spy(new User("Ringo Starr", "ringo@email.com", "06534374857", "333-2345", "letmein"));
//    ArrayList<User> userList = new ArrayList<User>();


    @Before
    public void setUp() {
//        userList.add(user1);
    }

//    @Test
//    public void testUserCanSuccessfullySignIn() {
//        lib.addToUserList(user1);
//        assertEquals(true, userMgr.signIn("333-2345", "letmein"));
//    }

    @Test
    public void testUnsuccessfulUserLogin() {
        assertEquals(false, userMgr.signIn("333-2345", "password"));
    }

    @Test
    public void canPrintUserMenu() {
        userMgr.printMenu();
        String actual = outContent.toString().trim();
        assertEquals("test", actual);
    }

}