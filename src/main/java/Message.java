public class Message {
    private String sender;
    private String recipient;
    private String content;
    private String time;

    public Message(String sender, String recipient, String content) {
        this.sender = sender;
        this.recipient = recipient;
        this.content = content;
        this.time = java.time.LocalTime.now().toString();
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

    @Override
    public String toString() {
        return time + "- From " + sender + ": " + content;
    }
}
