/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poeapp;

/**
 *
 * @author Reabe
 */
public class Validator {
    
    public boolean hasCapital(String username){
        return username.matches(".*[A-Z].*");
    }
    public boolean hasNumber(String username){
        return username.matches(".*[0-9].*");
    }
    public boolean hasSpecialChar(String username){
        return username.matches(".*[^a-zA-Z0-9].*");
    }
    public boolean isLongEnough(String username){
        return username.length() >= 5;
    }
    public boolean isValid(String username){
        return hasCapital(username) &&
                hasNumber(username) &&
                hasSpecialChar(username) &&
                isLongEnough(username);
    }
    public boolean passwordLongEnough(String password){
        return password.length() >= 8;
    }
    public boolean passwordHasCapital(String password){
        return password.matches(".*[A-Z].*");
    }
    public boolean passwordHasNumber(String password){
        return password.matches(".*[0-9].*");
    }
    public boolean passwordHasSpecialChar(String password){
        return password.matches(".*[^a-zA-Z0-9].*");
    }
    public boolean isPasswordValid(String password){
        return passwordLongEnough(password) &&
                passwordHasCapital(password) &&
                passwordHasNumber(password) &&
                passwordHasSpecialChar(password);
    
    }
    public boolean checkCellPhoneNumber(String number){
        return number.matches ("\\+27\\d{9}");
    }
    public boolean checkUserName(String username){
        return username.contains("_") && username.length() <=5;
    }
    public static String checkMessageLength(String message){

    if(message.length() <= 250){

        return "Message ready to send.";

    }else{

        int exceed = message.length() - 250;

        return "Message exceeds 250 characters by "
                + exceed
                + ", please reduce size.";
    }
}
    public static boolean checkRecipientCell(String recipient){

    return recipient.matches("\\+27\\d{9}");
}
    public static String createMessageHash(
        String messageID,
        int messageNumber,
        String message){

    String[] words = message.split(" ");

    String firstWord = words[0].toUpperCase();

    String lastWord =
            words[words.length - 1].toUpperCase();

    return messageID.substring(0,2)
            + ":"
            + messageNumber
            + ":"
            + firstWord
            + lastWord;
}
    
}
