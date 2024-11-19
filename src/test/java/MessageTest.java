import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageTest {

    @Test
    void getSender() {
        String sender = "User1";
        String recipient = "User2";
        String content = "Message";
        Message message = new Message(sender, recipient, content);

        assertEquals(sender, message.getSender());
    }

    @Test
    void getRecipient() {
        String sender = "User1";
        String recipient = "User2";
        String content = "Message";
        Message message = new Message(sender, recipient, content);

        assertEquals(recipient, message.getRecipient());
    }

    @Test
    void getContent() {
        String sender = "User1";
        String recipient = "User2";
        String content = "Message";
        Message message = new Message(sender, recipient, content);

        assertEquals(content, message.getContent());
    }

    @Test
    void getTime() {
        String sender = "User1";
        String recipient = "User2";
        String content = "Message";
        Message message = new Message(sender, recipient, content);

        assertNotNull(message.getTime());
    }

}