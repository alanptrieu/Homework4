import java.util.*;

public class ChatServer {
    private Map<String, User> users = new HashMap<>();
    private Map<User, Set<User>> blockedUsers = new HashMap<>();

    public void registerUser(User user){
        users.put(user.getName(), user);
        blockedUsers.put(user, new HashSet<>());
    }

    public void sendMessage(User sender, Message message){
        for(User recipient : users.values()){
            if(recipient.getName().equals(message.getRecipient()) && !blockedUsers.get(recipient).contains(sender)){
                recipient.receiveMessage(message);
            }
        }
    }

    public void blockUser(User user, User blockedUser){
        blockedUsers.get(user).add(blockedUser);
        System.out.println(blockedUser.getName() + " blocked");
    }

    public void unblockUser(User user, User unblockedUser){
        blockedUsers.get(user).remove(unblockedUser);
        System.out.println(unblockedUser.getName() + " unblocked");
    }
}
