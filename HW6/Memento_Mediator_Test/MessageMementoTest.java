package HW6.Memento_Mediator_Test;

import HW6.Memento_Mediator.Message;
import HW6.Memento_Mediator.MessageMemento;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class MessageMementoTest {
    private Message message;

    @BeforeEach
    void setUp() {
        message = new Message();
        message.setMessageContent("Test");
        message.setTimestamp("2022-04-17");
        message.setSender("User1");
        ArrayList<String> recipients = new ArrayList<>();
        recipients.add("User2");
        message.setRecipients(recipients);
    }

    @Test
    void getMessageState() {
        MessageMemento memento = new MessageMemento(message);
        assertNotNull(memento.getMessageState());
    }

    @Test
    void setMessageState() {
        MessageMemento memento = new MessageMemento(message);
        memento.setMessageState(message);
        assertEquals("Test", memento.getMessageContent());
    }

    @Test
    void getMessageContent() {
        MessageMemento memento = new MessageMemento(message);
        assertEquals("Test", memento.getMessageContent());
    }

    @Test
    void getTimestamp() {
        MessageMemento memento = new MessageMemento(message);
        assertEquals("2022-04-17", memento.getTimestamp());
    }

    @Test
    void getSender() {
        MessageMemento memento = new MessageMemento(message);
        assertEquals("User1", memento.getSender());
    }

    @Test
    void getRecipients() {
        MessageMemento memento = new MessageMemento(message);
        assertEquals(message.getRecipients(), memento.getRecipients());
    }
}
