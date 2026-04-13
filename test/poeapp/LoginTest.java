/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package poeapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTest {

    @Test
    public void testRegisterUser() {
        Login instance = new Login();

        String result = instance.registerUser("Rea_1", "98Rea@12","Reabetswe", "Gary");

        assertEquals("User has been registered successfully.", result);
    }

    @Test
    public void testLoginUser() {
        Login instance = new Login();

        // FIRST register the user
        instance.registerUser("Rea_1", "98Rea@12","Reabetswe", "Gary");

        // THEN test login
        boolean result = instance.loginUser("Rea_1", "98Rea@12");

        assertTrue(result);
    }

    @Test
    public void testReturnLoginStatus() {
        Login instance = new Login("Rea_1", "98Rea@12", "Reabetswe", "Gary");

        String result = instance.returnLoginStatus(true);

        assertEquals("Welcome Reabetswe, Gary it is great to see you again.", result);
    }
    @Test
    public void testLoginFailed() {
    Login instance = new Login();

    instance.registerUser("Rea_1", "98Rea@12","Reabetswe", "Gary");

    boolean result = instance.loginUser("wrong", "wrong");

    assertFalse(result);
}
    @Test
    public void testUsernameIncorrect() {
    Login instance = new Login();

    String result = instance.registerUser("invalidUsername", "98Rea@12","Reabetswe", "Gary");

    assertEquals("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.", result);
}
    @Test
    public void testPasswordIncorrect() {
    Login instance = new Login();

    String result = instance.registerUser("Rea_1", "password","Reabetswe", "Gary");

    assertEquals("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.", result);
}
}
