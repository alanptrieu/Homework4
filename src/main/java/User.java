import java.util.Iterator;

public class User implements IterableByUser {
    private String name;
    private ChatHistory chatHistory;
    private ChatServer server;

    public User(String name, ChatServer server) {
        this.name = name;
        this.chatHistory = new ChatHistory();
        this.server = server;
        this.server.registerUser(this);
    }

    public String getName(){
        return name;
    }

    public void sendMessage(String recipient, String content){
        Message message = new Message(this.name, recipient, content);
        server.sendMessage(this, message);
        chatHistory.push(message);
    }

    public void receiveMessage(Message message){
        System.out.println(message);
    }

    public void undoMessage(){
        MessageMemento memento = chatHistory.pop();
        if (memento != null){
            System.out.println("Undo last message");
        } else {
            System.out.println("No messages to undo");
        }
    }

    public void blockUser(User user){
        server.blockUser(this, user);
    }

    public void unblockUser(User user){
        server.unblockUser(this, user);
    }

    public void viewChatHistory(){
        System.out.println(this.name + "'s chat history:");
        for (MessageMemento memento : chatHistory.getHistory()){
            System.out.println(memento.getTime() + "- to " + memento.getRecipient() + ": " + memento.getContent());
        }
    }

    @Override
    public Iterator<MessageMemento> iterator(User userToSearchWith){
        return chatHistory.iterator(userToSearchWith);
    }

    public void searchMessageByUser(User userToSearch){
        Iterator<MessageMemento> iterator = iterator(userToSearch);
        while (iterator.hasNext()){
            MessageMemento memento = iterator.next();
            System.out.println(memento.getTime() + "- to " + memento.getRecipient() + ": " + memento.getContent());
        }
    }
}
