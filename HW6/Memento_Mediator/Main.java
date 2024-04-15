package HW6.Memento_Mediator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ChatServer server = new ChatServer();

        // Initializing and "registering" the Users into the ChatServer
        User user1 = new User("User1", server);
        User user2 = new User("User2", server);
        User user3 = new User("User3", server);

        server.registerUser(user1);
        server.registerUser(user2);
        server.registerUser(user3);

        // testing of sending messages to one or more users
        ArrayList<String> recipientList1 = new ArrayList<String>();
        recipientList1.add("User2");

        ArrayList<String> recipientList2 = new ArrayList<String>();
        recipientList2.add("User1");

        ArrayList<String> recipientList3 = new ArrayList<String>();
        recipientList3.add("User1");
        recipientList3.add("User2");

        // Writing, saving, and sending messages
        System.out.println("User1 sending a message:");
        user1.writeMessage("Hello, User2!", recipientList1);
        user1.saveMessage();
        user1.sendMessage();

        System.out.println("\nUser2 sending a message:");
        user2.writeMessage("Hello, User1!", recipientList2);
        user2.saveMessage();
        user2.sendMessage();

        System.out.println("\nUser3 sending a message:");
        user3.writeMessage("Hello, everyone!", recipientList3);
        user3.saveMessage();
        user3.sendMessage();

        System.out.println("\nUser1 sending a message after being blocked:");
        user2.blockUser("User1");

        user1.writeMessage("This message should be blocked by user2.", recipientList1);
        user1.saveMessage();
        user1.sendMessage();

        System.out.println("\nUser1 Chat History:");
        user1.viewChatHistoryWithUser("User2");

        System.out.println("\nUser2 Chat History: *USER1 UNSENT THEIR LAST MESSAGE*");
        user1.undoLastMessage();
        user2.viewChatHistoryWithUser("User1");

        System.out.println("\nUser3 Chat History:");
        user3.viewChatHistoryWithUser("User2");

        System.out.println("\nIterator of user1:");
        ChatHistory user1ChatHistory = user2.getChatHistory();
        if (user1ChatHistory != null) {
            Iterator<Message> iterator = new UserMessageIterator(user1);
            while (iterator.hasNext()) {
                Message message = iterator.next();
                System.out.println("Message: " + message.getMessageContent());
            }
        } else {
            System.out.println("User1's chat history is null.");
        }

    }
}