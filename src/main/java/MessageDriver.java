public class MessageDriver {
    public static void main(String[] args) {
        ChatServer server = new ChatServer();

        User user1 = new User("User1", server);
        User user2 = new User("USer2", server);
        User user3 = new User("User3", server);

        System.out.println("Users can send messages to one or more other users through the chat server.");
        user1.sendMessage("User2", "Hello");
        user1.viewChatHistory();
        System.out.println("Users can undo the last message they sent using the Memento design pattern.");
        user1.undoMessage();
        user1.viewChatHistory();
        System.out.println("Users can block messages from specific users using the Mediator design pattern.");
        user1.blockUser(user2);
        System.out.println("Users can receive messages from other users and view the chat history for a specific user.");
        user1.unblockUser(user2);
        user3.sendMessage("User1", "Hello");
        user3.sendMessage("User1", "World");
        user3.viewChatHistory();
        System.out.println("SearchMessageByUser");
        user3.searchMessageByUser(user1);
    }
}
