package HW6.Memento_Mediator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserMessageIterator implements IterableByUser {
    private ChatServer server;

    public UserMessageIterator(ChatServer server) {
        this.server = server;
    }

    @Override
    public Iterator<Message> iterator(User userToSearchWith) {
        List<Message> filteredMessages = new ArrayList<>();

        List<User> filteredList = new ArrayList<>();
        List<User> registeredUsers = server.getRegisteredUsers();

        for (User user : registeredUsers) {
            if (!userToSearchWith.equals(user)) {
                userToSearchWith.viewChatHistoryWithUser(user.getName());
            }
        }

        return filteredMessages.iterator();
    }
}
