package chainOfResponsibility;

public class Message {
    String messageContent, senderEmail;
    Type type;


    public Message(String messageContent, String senderEmail, Type type) {
        this.messageContent = messageContent;
        this.senderEmail = senderEmail;
        this.type = type;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
