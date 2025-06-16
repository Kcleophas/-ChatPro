
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kezia
 */
public class MessageManager {
    public List<Message> sentMessages = new ArrayList<>();
    public List<Message> storedMessages = new ArrayList<>();
    public List<Message> disregardedMessages = new ArrayList<>();
    public List<String> messageHashes = new ArrayList<>();
    public List<String> messageIds = new ArrayList<>();

    public void populateMessages() {
        // Robin sends message 1
        sentMessages.add(new Message("Robin", "+27834557896", "Did you get the cake?", "Sent"));

        // Kezia stores message 2
        storedMessages.add(new Message("Kezia", "+27838884567", "Where are you? You are late! I have asked you to be on time.", "Stored"));

        // Robin disregards message 3
        disregardedMessages.add(new Message("Robin", "+27834484567", "Yohoooo, I am at your gate.", "Disregard"));

        // Message 4 - Robin
        sentMessages.add(new Message("Robin", "0838884567", "It is dinner time!", "Sent"));

        // Message 5 - Kezia stored
        storedMessages.add(new Message("Kezia", "+27838884567", "Ok, I am leaving without you.", "Stored"));

        for (Message m : sentMessages) {
            messageHashes.add(m.getHash());
            messageIds.add(m.getMessageId());
        }
    }

    public void displaySendersAndRecipients() {
    for (Message m : sentMessages) {
        System.out.println("Sender: " + m.getSender() + ", Recipient: " + m.getRecipient());
    }
}
public String getLongestSentMessage() {
    Message longest = null;
    for (Message m : sentMessages) {
        if (longest == null || m.getMessage().length() > longest.getMessage().length()) {
            longest = m;
        }
    }
    return (String) longest.getMessage();
}
public void searchByMessageId(String id) {
    for (Message m : sentMessages) {
        if (m.getMessageId().equals(id)) {
            System.out.println("Recipient: " + m.getRecipient() + ", Message: " + m.getMessage());
            return;
        }
    }
    System.out.println("Message ID not found.");
}
public void searchByRecipient(String recipient) {
    for (Message m : sentMessages) {
        if (m.getRecipient().equals(recipient)) {
            System.out.println("Message: " + m.getMessage());
        }
    }
    for (Message m : storedMessages) {
        if (m.getRecipient().equals(recipient)) {
            System.out.println("Stored Message: " + m.getMessage());
        }
    }
}
public void deleteMessageByHash(String hash) {
    for (int i = 0; i < sentMessages.size(); i++) {
        if (sentMessages.get(i).getHash().equals(hash)) {
            System.out.println("Message \"" + sentMessages.get(i).getMessage() + "\" successfully deleted.");
            sentMessages.remove(i);
            return;
        }
    }
    System.out.println("Message hash not found.");
}
public void displayReport() {
    for (Message m : sentMessages) {
        System.out.println("Message Hash: " + m.getHash());
        System.out.println("Recipient: " + m.getRecipient());
        System.out.println("Message: " + m.getMessage());
        System.out.println("------");
    }
}

}
