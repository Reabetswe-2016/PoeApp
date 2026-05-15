/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Reabe
 */
package poeapp;
public class Message {

    private String recipient;
    private String message;
    private String messageHash;
    private long messageID;

    public Message(String recipient,
                   String message,
                   String messageHash,
                   long messageID) {

        this.recipient = recipient;
        this.message = message;
        this.messageHash = messageHash;
        this.messageID = messageID;
    }
}
