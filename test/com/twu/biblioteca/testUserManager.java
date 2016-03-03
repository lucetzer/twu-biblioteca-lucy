package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.assertEquals;
import org.junit.Before;


import java.util.ArrayList;

public class testUserManager {

    User user1 = Mockito.spy(new User("Ringo Starr", "ringo@email.com", "06534374857", "333-2345", "letmein"));
    ArrayList<User> userList = new ArrayList<User>();

    @Before
    public void setUp() {
        userList.add(user1);
    }

    @Test
    public void testUserCanSuccessfullyLogin() {
        UserManager userMgr = new UserManager(userList);
        assertEquals(true, userMgr.signIn("333-2345", "letmein"));
    }

    @Test
    public void testUnsuccessfulUserLogin() {
        UserManager userMgr = new UserManager(userList);
        assertEquals(false, userMgr.signIn("333-2345", "password"));
    }
}