public class MessageMemento {
    private String sender;
    private String recipient;
    private String content;
    private String time;

    public MessageMemento(String sender, String recipient, String content, String time) {
        this.sender = sender;
        this.recipient = recipient;
        this.content = content;
        this.time = time;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getContent() {
        return content;
    }

    public String getTime() {
        return time;
    }
}
