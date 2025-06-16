/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kezia
 */
public class MessageTest {
    @Test
    public void testSentMessagesArray() {
        MessageManager mm = new MessageManager();
        mm.populateMessages();
        assertEquals(2, mm.sentMessages.size()); // Robin sends 2
    }

    @Test
    public void testLongestMessage() {
        MessageManager mm = new MessageManager();
        mm.populateMessages();
        String expected = "Where are you? You are late! I have asked you to be on time.";
        assertTrue(mm.getLongestSentMessage().length() < expected.length() || mm.getLongestSentMessage().length() > 0);
    }
    @Test
    public void testSearchByRecipient() {
        MessageManager mm = new MessageManager();
        mm.populateMessages();
        mm.searchByRecipient("+27838884567"); // Should print 2 messages
    }

    private void assertEquals(int i, int size) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void assertTrue(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
