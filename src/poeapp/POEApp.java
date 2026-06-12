/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poeapp;


/**
 * POE Part 3 - QuickChat Application
 * @author Reabe
 */
import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
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

// Part 3 MESSAGE Arrays

String[] sentMessagesArray = new String[100];
String[] storedMessagesArray = new String[100];
String[] disregardedMessagesArray = new String[100];

String[] recipientsArray = new String[100];
String[] hashesArray = new String[100];

long[] idsArray = new long[100];

// Stores action type (Sent, Stored, Disregarded)
String[] actionArray = new String[100];

// Counters for arrays
int sentCount = 0;
int storedCount = 0;
int disregardedCount = 0;

// Main application loop
    boolean running = true;
    
    while (running){
        
// MAIN MENU
    System.out.println("1. Register \n2. Login \n3. Exit");
    
    String choice = sc.nextLine();
    
    switch(choice){
        
// USER REGISTRATION
        
        case "1":
            
// Registraction Code here
            
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
        
// USER LOGIN
        case "2":
            
// Login Code here
            
            System.out.println("LOGIN");
            System.out.println("Enter the username:");
            String user1 = sc.nextLine();
            System.out.println("Enter the password:");
            String pass1 = sc.nextLine();
            
            boolean loginResult = login.loginUser(user1, pass1);
            System.out.println(login.returnLoginStatus(loginResult));
            if(loginResult){
                
// QUICKCHAT MENU

                System.out.println("Welcome to QuickChat");
                
                System.out.println("How many messages would you like to send?");
                int totalMessages = Integer.parseInt(sc.nextLine());
                
                int sentMessages = 0;
                
                while(true){
System.out.println("\nQuickChat Menu");
System.out.println("1. Send Messages");
System.out.println("2. Show Recently Sent Messages");
System.out.println("3. Read Stored Messages");
System.out.println("4. Display Sent Messages");
System.out.println("5. Display Longest Message");
System.out.println("6. Search Message ID");
System.out.println("7. Search Recipient");
System.out.println("8. Delete Message");
System.out.println("9. Message Report");
System.out.println("10. Quit");
                    
                    String option = sc.nextLine();
                    
                    switch(option){
                        
                    // OPTION 1 - SEND MESSAGE
                        
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
"00:" + (sentMessages + 1) + ":" +
message.substring(0,
Math.min(2,message.length())).toUpperCase();

System.out.println("\nChoose Action");
System.out.println("1. Send");
System.out.println("2. Store");
System.out.println("3. Disregard");

String action = sc.nextLine();

switch(action){

    case "1":

        sentMessagesArray[sentCount] = message;
        recipientsArray[sentCount] = recipient;
        hashesArray[sentCount] = messageHash;
        idsArray[sentCount] = messageID;
        actionArray[sentCount] = "Sent";
        sentCount++;

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
                    new FileWriter("messages.json", true);

            writer.write(gson.toJson(msg));
            writer.write(System.lineSeparator());
            writer.close();

            System.out.println("Message saved to JSON.");

        } catch (IOException e) {

            System.out.println("Error saving message.");
        }

        break;

    case "2":

        storedMessagesArray[storedCount] = message;
        actionArray[storedCount] = "Stored";
        storedCount++;

        System.out.println("Message Stored Successfully");
        System.out.println("Message ID: " + messageID);
        System.out.println("Message Hash: " + messageHash);

        break;

    case "3":

        disregardedMessagesArray[disregardedCount] = message;
        disregardedCount++;

        System.out.println("Message Disregarded");

        break;
    default:

        System.out.println("Invalid option.");


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
                            
                        // OPTION 2 - COMING SOON    
                        case "2":
                            System.out.println("Coming Soon");
                            break;
                            
                        // OPTION 3 - READ JSON FILE
                        case "3":

                        System.out.println("\nSTORED MESSAGES");

                        try {

                        BufferedReader reader =
                        new BufferedReader(
                        new FileReader("messages.json"));

                        String line;

                        while((line = reader.readLine()) != null){

                        System.out.println(line);
        }

                        reader.close();

    }                   catch(IOException e){

                        System.out.println(
                        "No stored messages found.");
    }

                        break;
                // OPTION 4 - DISPLAY SENT
                case "4":

    System.out.println("\nALL SENT MESSAGES");

    if(sentCount == 0){

        System.out.println("No sent messages found.");

    }else{
    for(int i = 0; i < sentCount; i++){

    if(sentMessagesArray[i] != null){

        System.out.println("\nMessage " + (i + 1));
        System.out.println(sentMessagesArray[i]);
        }
      }
    }

    break;
    
// OPTION 5 - LONGEST MESSAGE
    case "5":

    String longestMessage = "";

    for(int i = 0; i < sentCount; i++){

        if(sentMessagesArray[i] != null &&
           sentMessagesArray[i].length() >
           longestMessage.length()){

            longestMessage = sentMessagesArray[i];
        }
    }

    System.out.println("Longest Message:");
    System.out.println(longestMessage);

    break;

// OPTION 6 - SEARCH BY ID
    case "6":

    System.out.println("Enter Message ID:");

    long searchID =
            Long.parseLong(sc.nextLine());

    boolean foundID = false;

    for(int i = 0; i < sentCount; i++){

        if(idsArray[i] == searchID){

            System.out.println("\nMESSAGE FOUND");
            System.out.println("Recipient: "
                    + recipientsArray[i]);

            System.out.println("Message: "
                    + sentMessagesArray[i]);

            foundID = true;
        }
    }

    if(!foundID){

        System.out.println(
                "Message ID not found.");
    }

    break;

// OPTION 7 - SEARCH RECIPIENT
    case "7":

    System.out.println("Enter recipient number:");

    String searchRecipient =
            sc.nextLine();

    boolean recipientFound = false;

    System.out.println("\nMessages Found:");

    for(int i = 0; i < sentCount; i++){

        if(recipientsArray[i] != null &&
           recipientsArray[i].equals(searchRecipient)){

            System.out.println(
                    sentMessagesArray[i]);

            recipientFound = true;
        }
    }

    if(!recipientFound){

        System.out.println(
                "No messages found for this recipient.");
    }

    break;

// OPTION 8 - DELETE BY HASH 
    case "8":

    System.out.println("Enter Message Hash:");

    String searchHash = sc.nextLine();

    boolean deleted = false;

    for(int i = 0; i < sentCount; i++){

        if(hashesArray[i] != null &&
           hashesArray[i].equals(searchHash)){

            sentMessagesArray[i] = null;
            recipientsArray[i] = null;
            hashesArray[i] = null;

            deleted = true;
        }
    }

    if(deleted){

        System.out.println(
                "Message successfully deleted.");

    }else{

        System.out.println(
                "Message hash not found.");
    }

    break;

// OPTION 9 - REPORT 
    case "9":

    System.out.println("\nMESSAGE REPORT");

    if(sentCount == 0){

        System.out.println("No messages available.");

    }else{

        for(int i = 0; i < sentCount; i++){

            if(sentMessagesArray[i] != null){

                System.out.println("\n------------------");

                System.out.println("Recipient: "
                        + recipientsArray[i]);

                System.out.println("Message: "
                        + sentMessagesArray[i]);

                System.out.println("Message ID: "
                        + idsArray[i]);

                System.out.println("Hash: "
                        + hashesArray[i]);
            }
        }
    }

    break;
                        // OPTION 10 - EXIT QUICKCHAT
                            
                        case "10":
                            System.out.println("Exiting QuickChat...");
                            break;
                        default:
                            System.out.println("Invalid option.");
                    }
                    if(option.equals("10")){
                        break;
                    }
                }
            }
        break;
        
        // EXIT APPLICATION
        case "3":
            System.out.println("Goodbye");
            running = false;
            break;
        default:
            System.out.println("Invalid option, try again.");
    }
   
}
// Close scanner before ending program
    sc.close();
    }
    
}
    


