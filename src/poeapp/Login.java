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

    public Login(){
    }
  
    // Constructor
    public Login(String username, String password, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String registerUser(String username, String password, String firstName, String lastName){
        Validator v = new Validator();
        if (!v.checkUserName(username)){
            return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
        }
        if (!v.isPasswordValid(password)){
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        
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

