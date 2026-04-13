
/**
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import poeapp.Login;
import poeapp.Validator;



public class LoginTest {
    
    public LoginTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
@Test
public void testUsernameCorrect(){
    Validator v = new Validator();
    assertTrue(v.checkUserName("Kyl_1"));
}
@Test
public void testUsernameIncorrect(){
    Validator v = new Validator();
    assertFalse(v.checkUserName("Kyle!!!!!!"));
}
@Test
public void testPasswordCorrect(){
    Validator v = new Validator();
    assertTrue(v.isPasswordValid("Ch&&sec@99!"));
}
@Test
public void testPasswordIncorrect(){
    Validator v = new Validator();
    assertFalse(v.isPasswordValid("password"));
}
@Test
public void testPhoneCorrect(){
    Validator v = new Validator();
    assertTrue(v.checkCellPhoneNumber("+27838968976"));
}
@Test
public void testPhoneIncorrect(){
    Validator v = new Validator();
    assertFalse(v.checkCellPhoneNumber("08966553"));
}
@Test
public void testLoginSuccess(){
    Login login = new Login("kyl_1","Ch&&sec@ke99!");
    assertTrue(login.loginUser("kyl_1","Ch&&sec@ke99!"));
}
@Test
public void testLoginFail(){
    Login login = new Login("kyl_1","Ch&&sec@ke99!");
    assertFalse(login.loginUser("wrong","wrong"));
}
@Test
public void testRegisterUserSuccess() {
    Login login = new Login();

    String result = login.registerUser("kyl_1", "Ch&&sec@ke99!");

    assertEquals("User has been registered successfully.", result);
}
@Test
public void testRegisterUserPasswordFail() {
    Login login = new Login();

    String result = login.registerUser("kyl_1", "password");

    assertEquals(
        "password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.",
        result
    );
}
@Test
public void testRegisterUserUsernameFail() {
    Login login = new Login();

    String result = login.registerUser("kyle!!!!!!", "Ch&&sec@ke99!");

    assertEquals(
        "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.",
        result
    );
}
 */