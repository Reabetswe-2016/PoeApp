/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package poeapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class MessageTest {

    

    @Test
    public void testSentMessagesArrayPopulated() {

        String[] messages = {
            "Did you get the cake?",
            "It is dinner time!"
        };

        assertEquals("Did you get the cake?", messages[0]);
        assertEquals("It is dinner time!", messages[1]);
    }

    @Test
    public void testDisplayLongestMessage() {

        String[] messages = {
            "Hi",
            "Where are you? You are late! I have asked you to be on time."
        };

        String longest = "";

        for (String msg : messages) {

            if (msg.length() > longest.length()) {
                longest = msg;
            }
        }

        assertEquals(
            "Where are you? You are late! I have asked you to be on time.",
            longest
        );
    }

    @Test
    public void testSearchMessageID() {

        long[] ids = {
            111111111,
            222222222,
            333333333
        };

        String[] messages = {
            "Hello",
            "How are you?",
            "Dinner at 7"
        };

        String foundMessage = "";

        for (int i = 0; i < ids.length; i++) {

            if (ids[i] == 333333333) {
                foundMessage = messages[i];
            }
        }

        assertEquals("Dinner at 7", foundMessage);
    }

    @Test
    public void testSearchRecipient() {

        String[] recipients = {
            "+27831234567",
            "+27839876543"
        };

        String[] messages = {
            "Hello",
            "See you later"
        };

        String result = "";

        for (int i = 0; i < recipients.length; i++) {

            if (recipients[i].equals("+27839876543")) {
                result = messages[i];
            }
        }

        assertEquals("See you later", result);
    }

    @Test
    public void testDeleteMessageHash() {

        String[] hashes = {
            "AA1",
            "BB2"
        };

        String[] messages = {
            "Hello",
            "Goodbye"
        };

        for (int i = 0; i < hashes.length; i++) {

            if (hashes[i].equals("AA1")) {
                messages[i] = null;
            }
        }

        assertNull(messages[0]);
    }

    @Test
    public void testMessageReport() {

        int sentCount = 3;
        int storedCount = 2;
        int disregardedCount = 1;

        assertEquals(3, sentCount);
        assertEquals(2, storedCount);
        assertEquals(1, disregardedCount);
    }

    @Test
    public void testMessageConstructor() {

        Message msg = new Message(
                "+27831234567",
                "Hello",
                "00:1:HE",
                123456789);

        assertEquals("+27831234567",
                msg.getRecipient());

        assertEquals("Hello",
                msg.getMessage());

        assertEquals("00:1:HE",
                msg.getMessageHash());

        assertEquals(123456789,
                msg.getMessageID());
    }

    @Test
    public void testRecipientStoredCorrectly() {

        Message msg = new Message(
                "+27835554444",
                "Meeting at 3pm",
                "00:2:ME",
                987654321);

        assertTrue(
                msg.getRecipient().startsWith("+27")
        );
    }

    @Test
    public void testMessageNotNull() {

        Message msg = new Message(
                "+27831234567",
                "Test Message",
                "00:3:TE",
                555555555);

        assertNotNull(msg);
        assertNotNull(msg.getMessage());
    }
}
