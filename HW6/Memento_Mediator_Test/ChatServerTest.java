package HW6.Memento_Mediator_Test;

import HW6.Memento_Mediator.ChatHistory;
import HW6.Memento_Mediator.ChatServer;
import HW6.Memento_Mediator.Message;
import HW6.Memento_Mediator.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ChatServerTest {
    private ChatServer chatServer;
    private User sender;
    private User recipient;

    @BeforeEach
    void setUp() {
        chatServer = new ChatServer();
        sender = new User("User1", chatServer);
        recipient = new User("User2", chatServer);
        chatServer.registerUser(sender);
        chatServer.registerUser(recipient);
    }

    @Test
    void registerUser() {
        User user = new User("User3", chatServer);
        chatServer.registerUser(user);
        assertTrue(chatServer.getRegisteredUsers().contains(user));
    }

    @Test
    void unregisterUser() {
        chatServer.unregisterUser(sender);
        assertFalse(chatServer.getRegisteredUsers().contains(sender));
    }

    @Test
    void relayMessage() {
        Message message = new Message();
        message.setMessageContent("Hello, User2!");
        message.setSender("User1");
        ArrayList<String> recipients = new ArrayList<>();
        recipients.add("User2");
        message.setRecipients(recipients);

        chatServer.relayMessage(message);

        assertEquals(0, recipient.getMessageHistory().size());
    }

    @Test
    void updateChatHistoryMap() {
        Message message = new Message();
        message.setMessageContent("Hello, User2!");
        message.setSender("User1");
        ArrayList<String> recipients = new ArrayList<>();
        recipients.add("User2");
        message.setRecipients(recipients);

        chatServer.updateChatHistoryMap("User1", "User2", message);

        ChatHistory chatHistory = chatServer.getChatHistoryForUser("User1", "User2");
        assertNotNull(chatHistory);
        assertTrue(chatHistory.getMemento().getMessageContent().equals("Hello, User2!"));
    }

}
