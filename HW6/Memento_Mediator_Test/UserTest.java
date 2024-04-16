package HW6.Memento_Mediator_Test;

import HW6.Memento_Mediator.ChatServer;
import HW6.Memento_Mediator.Message;
import HW6.Memento_Mediator.User;
import HW6.Memento_Mediator.UserMessageIterator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class UserTest {
    private User user;
    private ChatServer server;

    @BeforeEach
    void setUp() {
        server = new ChatServer();
        user = new User("User1", server);
        server.registerUser(user);
    }

    @Test
    void writeMessage() {
        ArrayList<String> recipients = new ArrayList<>();
        recipients.add("User2");
        user.writeMessage("Hello, User2!", recipients);
        assertNotNull(user);
    }

    @Test
    void saveMessage() {
        ArrayList<String> recipients = new ArrayList<>();
        recipients.add("User2");
        user.writeMessage("Hello, User2!", recipients);
        user.saveMessage();
        assertEquals(1, user.getMessageHistory().size());
    }

    @Test
    void undoLastMessage() {
        ArrayList<String> recipients = new ArrayList<>();
        recipients.add("User2");
        user.writeMessage("Hello, User2!", recipients);
        user.saveMessage();

        user.undoLastMessage("User2");

        assertEquals(0, user.getMessageHistory().size()-1);
    }

    @Test
    void getBlocked() {
        user.blockUser("User2");
        assertEquals(1, user.getBlocked().size());
    }

    @Test
    void getName() {
        String name = user.getName();
        assertEquals("User1", name);
    }

    @Test
    void getMessageIterator() {
        Iterator<Message> iterator = user.getMessageIterator();
        assertNotNull(iterator);
    }
}
