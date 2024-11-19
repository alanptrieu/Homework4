import java.util.*;

public class searchMessageByUser implements Iterator<MessageMemento> {
    private Stack<MessageMemento> history;
    private User userToSearchWith;
    private int current;

    public searchMessageByUser(Stack<MessageMemento> history, User userToSearchWith) {
        this.history = history;
        this.userToSearchWith = userToSearchWith;
        this.current = 0;
    }

    @Override
    public boolean hasNext() {
        while(current < history.size()) {
            MessageMemento memento = history.get(current);
            if (memento.getSender().equals(userToSearchWith.getName()) || memento.getRecipient().equals(userToSearchWith.getName())) {
                return true;
            }
            current++;
        }
        return false;
    }

    @Override
    public MessageMemento next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return history.get(current++);
    }
}
