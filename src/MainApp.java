/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kezia
 */
public class MainApp {
 public static void main(String[] args) {
        MessageManager manager = new MessageManager();

        // Populate test messages
        manager.populateMessages();

        // Display all senders and recipients of sent messages
        System.out.println("== All Sent Messages: Sender & Recipient ==");
        manager.displaySendersAndRecipients();

        // Display longest sent message
        System.out.println("\n== Longest Sent Message ==");
        System.out.println(manager.getLongestSentMessage());

        // SSearch by Message ID (example)
        System.out.println("\n== Search by Message ID ==");
        String searchId = manager.sentMessages.get(0).getMessageId(); // Get ID of first message
        manager.searchByMessageId(searchId);

        //  Search for messages sent to a recipient
        System.out.println("\n== Search by Recipient: +27838884567 ==");
        manager.searchByRecipient("+27838884567");

        // Delete a message by hash
        System.out.println("\n== Delete by Hash ==");
        String hashToDelete = manager.sentMessages.get(0).getHash(); // Delete first message
        manager.deleteMessageByHash(hashToDelete);

        // Display full report
        System.out.println("\n== Sent Message Report ==");
        manager.displayReport();
    }
}  
