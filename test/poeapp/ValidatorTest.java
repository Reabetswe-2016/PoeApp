/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package poeapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class ValidatorTest {
    
    

    @Test
    public void testHasCapital() {

        Validator instance = new Validator();

        assertTrue(instance.hasCapital("Rea"));
    }

    @Test
    public void testHasNumber() {

        Validator instance = new Validator();

        assertTrue(instance.hasNumber("Rea1"));
    }

    @Test
    public void testHasSpecialChar() {

        Validator instance = new Validator();

        assertTrue(instance.hasSpecialChar("Rea@"));
    }

    @Test
    public void testIsLongEnough() {

        Validator instance = new Validator();

        assertTrue(instance.isLongEnough("Rea12"));
    }

    @Test
    public void testIsValid() {

        Validator instance = new Validator();

        assertTrue(instance.isValid("Rea@1"));
    }

    @Test
    public void testPasswordLongEnough() {

        Validator instance = new Validator();

        assertTrue(instance.passwordLongEnough("Password1@"));
    }

    @Test
    public void testPasswordHasCapital() {

        Validator instance = new Validator();

        assertTrue(instance.passwordHasCapital("Password1@"));
    }

    @Test
    public void testPasswordHasNumber() {

        Validator instance = new Validator();

        assertTrue(instance.passwordHasNumber("Password1@"));
    }

    @Test
    public void testPasswordHasSpecialChar() {

        Validator instance = new Validator();

        assertTrue(instance.passwordHasSpecialChar("Password1@"));
    }

    @Test
    public void testIsPasswordValid() {

        Validator instance = new Validator();

        assertTrue(instance.isPasswordValid("Password1@"));
    }

    @Test
    public void testCheckCellPhoneNumber() {

        Validator instance = new Validator();

        assertTrue(
                instance.checkCellPhoneNumber("+27831234567")
        );
    }

    @Test
    public void testCheckUserName() {

        Validator instance = new Validator();

        assertTrue(
                instance.checkUserName("Rea_1")
        );
    }
}
