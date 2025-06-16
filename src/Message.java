/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kezia
 */
public class Message {
 private String sender;
    private String recipient;
    private String message;
    private String flag; // Sent, Stored, Disregard
    private String hash;
    private String messageId;

    public Message(String sender, String recipient, String message, String flag) {
        this.sender = sender;
        this.recipient = recipient;
        this.message = message;
        this.flag = flag;
        this.messageId = generateMessageId();
        this.hash = generateHash();
    }

    private String generateHash() {
        return Integer.toHexString(message.hashCode());
    }

    private String generateMessageId() {
        return "MSG" + (int)(Math.random() * 100000);
    }

    // ✅ Add these getter methods:
    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getMessage() {
        return message;
    }

    public String getFlag() {
        return flag;
    }

    public String getHash() {
        return hash;
    }

    public String getMessageId() {
        return messageId;
    }
}

   