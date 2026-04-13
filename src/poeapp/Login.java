/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poeapp;

/**
 *
 * @author Reabe
 */

    public class Login {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String cellPhone;

    public Login(){
    }
  
    // Constructor
    public Login(String username, String password, String firstName, String lastName, String cellPhone) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cellPhone = cellPhone;
    }
    public String registerUser(String username, String password, String firstName, String lastName, String cellPhone){
        Validator v = new Validator();
        if (!v.checkUserName(username)){
            return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
        }
        if (!v.isPasswordValid(password)){
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }
        if (!v.checkCellPhoneNumber(cellPhone)){
            return "Cell phone number incorrectly formatted or does not contain international code.";
        }
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cellPhone = cellPhone;
        
        return "User has been registered successfully.";
    }

    // Method to check login
        public boolean loginUser(String inputUsername, String inputPassword) {
        return inputUsername.equals(username) && inputPassword.equals(password);
    }
            public String returnLoginStatus(boolean success) {
        if (success) {
            return "Welcome " + firstName + ", " + lastName + " it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again";
        }
    }

}

