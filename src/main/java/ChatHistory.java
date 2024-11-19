import java.util.*;

public class ChatHistory implements IterableByUser {
    private Stack<MessageMemento> history = new Stack<>();

    public void push(Message message){
        history.push(new MessageMemento(message.getSender(), message.getRecipient(), message.getContent(), message.getTime()));
    }

    public MessageMemento pop(){
        if (history.isEmpty()){
            return history.pop();
        }
        return history.pop();
    }

    public Stack<MessageMemento> getHistory(){
        return history;
    }

    @Override
    public Iterator<MessageMemento> iterator(User userToSearchWith){
        return new searchMessageByUser(history, userToSearchWith);
    }
}
