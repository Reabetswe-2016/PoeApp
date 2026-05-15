/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poeapp;


/**
 *
 * @author Reabe
 */
import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
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
    Scanner sc = new Scanner(System.in);
    
    boolean running = true;
    
    while (running){
    System.out.println("1. Register \n2. Login \n3. Exit");
    
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
            System.out.println("Enter cellPhone number (e.g. +27831234567):");
            String cell = sc.nextLine();
            String registrationMessage = login.registerUser(user, pass, first, last, cell);
            System.out.println(registrationMessage);
        break;
        case "2":
            System.out.println("LOGIN");
            System.out.println("Enter the username:");
            String user1 = sc.nextLine();
            System.out.println("Enter the password:");
            String pass1 = sc.nextLine();
            
            boolean loginResult = login.loginUser(user1, pass1);
            System.out.println(login.returnLoginStatus(loginResult));
            if(loginResult){
                
                System.out.println("Welcome to QuickChat");
                
                System.out.println("How many messages would you like to send?");
                int totalMessages = Integer.parseInt(sc.nextLine());
                
                int sentMessages = 0;
                
                while(true){
                    System.out.println("\nQuickChat Menu");
                    System.out.println("1. Send Messages");
                    System.out.println("2. Show Recently sent Messages");
                    System.out.println("3. Quit");
                    
                    String option = sc.nextLine();
                    
                    switch(option){
                        
                        case "1":
                            
                            if(sentMessages < totalMessages){
                                
                                System.out.println("Enter recipient number:");
                                String recipient = sc.nextLine();
                                
                                if(recipient.matches("\\+27\\d{9}")){
                                    
                                    System.out.println("Enter your message:");
                                    String message = sc.nextLine();
                                    
                                    if(message.length() <= 250){
                                        
                                        sentMessages++;
                                        
                                        long messageID =
                                        (long)(Math.random() * 1000000000L);
                                        
                                        String messageHash =
                                        "00:" + sentMessages + ":" +
                                        message.substring(0,
                                        Math.min(2,message.length())).toUpperCase();
                                        
                                        System.out.println("Message Sent Successfully");
                                        System.out.println("Message ID: " + messageID);
                                        System.out.println("Message Hash: " + messageHash);
                                        
                            try {
                                            
                                            Message msg = new Message(
                                                  recipient,  
                                                  message,
                                                  messageHash,
                                                  messageID
                                            );
                                        
                                        Gson gson = new Gson();
                                        
                                        FileWriter writer =
                                                new FileWriter("messages.json",true);
                                        
                                        writer.write(gson.toJson(msg));
                                        
                                        writer.write(System.lineSeparator());
                                        
                                        writer.close();
                                        
                                        System.out.println("Message saved to JSON.");
                                    } catch (IOException e) {
                                            
                                        System.out.println("Error saving message.");

                                    } 
                                    }else{
                                        System.out.println("Message exceeds 250 characters.");
                                    }
                                }else{
                                    System.out.println("Cell number is incorrectly formatted.");
                                }
                            }else{
                                System.out.println("Message limit reached.");
                            }
                            break;
                            
                        case "2":
                            System.out.println("Coming Soon");
                            break;
                            
                        case "3":
                            System.out.println("Exiting QuickChat...");
                            break;
                        default:
                            System.out.println("Invalid option.");
                    }
                    if(option.equals("3")){
                        break;
                    }
                }
            }
        break;
        case "3":
            System.out.println("Goodbye");
            running = false;
            break;
        default:
            System.out.println("Invalid option, try again.");
    }
   
}

    sc.close();
    }
    
}
    


