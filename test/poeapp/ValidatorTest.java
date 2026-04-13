/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package poeapp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Reabe
 */
public class ValidatorTest {
    
    public ValidatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of hasCapital method, of class Validator.
     */
    @Test
    public void testHasCapital() {
        System.out.println("hasCapital");
        String username = "";
        Validator instance = new Validator();
        boolean expResult = false;
        boolean result = instance.hasCapital(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of hasNumber method, of class Validator.
     */
    @Test
    public void testHasNumber() {
        System.out.println("hasNumber");
        String username = "";
        Validator instance = new Validator();
        boolean expResult = false;
        boolean result = instance.hasNumber(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of hasSpecialChar method, of class Validator.
     */
    @Test
    public void testHasSpecialChar() {
        System.out.println("hasSpecialChar");
        String username = "";
        Validator instance = new Validator();
        boolean expResult = false;
        boolean result = instance.hasSpecialChar(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isLongEnough method, of class Validator.
     */
    @Test
    public void testIsLongEnough() {
        System.out.println("isLongEnough");
        String username = "";
        Validator instance = new Validator();
        boolean expResult = false;
        boolean result = instance.isLongEnough(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isValid method, of class Validator.
     */
    @Test
    public void testIsValid() {
        System.out.println("isValid");
        String username = "";
        Validator instance = new Validator();
        boolean expResult = false;
        boolean result = instance.isValid(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
   }

    /**
     * Test of passwordLongEnough method, of class Validator.
     */
    @Test
    public void testPasswordLongEnough() {
        System.out.println("passwordLongEnough");
        String password = "";
        Validator instance = new Validator();
        boolean expResult = false;
        boolean result = instance.passwordLongEnough(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of passwordHasCapital method, of class Validator.
     */
    @Test
    public void testPasswordHasCapital() {
        System.out.println("passwordHasCapital");
        String password = "";
        Validator instance = new Validator();
        boolean expResult = false;
        boolean result = instance.passwordHasCapital(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of passwordHasNumber method, of class Validator.
     */
    @Test
    public void testPasswordHasNumber() {
        System.out.println("passwordHasNumber");
        String password = "";
        Validator instance = new Validator();
        boolean expResult = false;
        boolean result = instance.passwordHasNumber(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of passwordHasSpecialChar method, of class Validator.
     */
    @Test
    public void testPasswordHasSpecialChar() {
        System.out.println("passwordHasSpecialChar");
        String password = "";
        Validator instance = new Validator();
        boolean expResult = false;
        boolean result = instance.passwordHasSpecialChar(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isPasswordValid method, of class Validator.
     */
    @Test
    public void testIsPasswordValid() {
        System.out.println("isPasswordValid");
        String password = "";
        Validator instance = new Validator();
        boolean expResult = false;
        boolean result = instance.isPasswordValid(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of checkCellPhoneNumber method, of class Validator.
     */
    @Test
    public void testCheckCellPhoneNumber() {
        System.out.println("checkCellPhoneNumber");
        String number = "";
        Validator instance = new Validator();
        boolean expResult = false;
        boolean result = instance.checkCellPhoneNumber(number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of checkUserName method, of class Validator.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String username = "";
        Validator instance = new Validator();
        boolean expResult = false;
        boolean result = instance.checkUserName(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
