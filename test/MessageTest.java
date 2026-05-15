/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import poeapp.Validator;

/**
 *
 * @author Reabe
 */
public class MessageTest {
    
    @Test
    public void testMessageLengthSucess() {
        String expected =
                "Message ready to send.";
        String actual =
                Validator.checkMessageLength("Hello");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testRecipientSuccess() {
        assertTrue(
        Validator.checkRecipientCell("+27123456789"));
    }
    
    @Test
    public void testMessageHash() {
        String expected =
                "00:0:HITONIGHT";
        String actual =
                Validator.createMessageHash("0000000000", 0,"Hi tonight");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMessageLengthFailure() {
        String message =
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String actual =
                Validator.checkMessageLength(message);
        assertTrue(actual.contains("Message exceeds 250 character"));
         
    }

    @Test
    public void testRecipientFailure() {
        assertFalse(Validator.checkRecipientCell("0812345678"));
    }
    
}
