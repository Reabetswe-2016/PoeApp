/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poeapp;


/**
 *
 * @author Reabe
 */
import java.util.Scanner;
public class POEApp {
    public static void main(String[] args) {
    
    /**
    String username = "Rea_1";
    String password = "98Rea@12";
    String firstName = "Reabetswe";
    String lastName = "Gary"; 
    */
    Login login = new Login();
    
    System.out.println("1. Register \n2. Login \n3. Exit");
    Scanner sc = new Scanner(System.in);
    String choice = sc.nextLine();
    
    switch(choice){
        
        case "1":
            System.out.println("REGISTRATION");
            System.out.println("Enter the firstname:");
            String first = sc.nextLine();
            System.out.println("Enter the lastname:");
            String last = sc.nextLine();
            System.out.println("Enter the username:");
            String user = sc.nextLine();
            System.out.println("Enter the password:");
            String pass = sc.nextLine();
            String registrationMessage = login.registerUser(user, pass, first, last);
            System.out.println(registrationMessage);
        
        case "2":
            System.out.println("LOGIN");
            System.out.println("Enter your username:");
            String user1 = sc.nextLine();
            System.out.println("Enter the password:");
            String pass1 = sc.nextLine();
            boolean loginResult = login.loginUser(user1, pass1);
            System.out.println(login.returnLoginStatus(loginResult));
        break;
    }
   
}

 
    }
    


