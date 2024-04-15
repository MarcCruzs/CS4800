package HW6.Memento_Mediator;

import java.util.Iterator;

public class UserMessageIterator implements Iterator {
    private final User user;
    private final Iterator<Message> iterator;

    public UserMessageIterator(User user) {
        this.user = user;
        this.iterator = user.getChatHistory().iterator(user);
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public Message next() {
        return iterator.next();
    }


}
