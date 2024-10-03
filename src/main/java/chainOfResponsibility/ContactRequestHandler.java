package chainOfResponsibility;

public class ContactRequestHandler extends Handler {

    @Override
    public void handle(Message message) {
        if (message.type == Type.CONTACT_REQUEST) {
            System.out.println(message.senderEmail + " has request contact by company.");
            System.out.println("Message:\n" + message.messageContent);
            System.out.println("Sending this to \"Cleaning department\"...\n");
        } else {
            System.out.println("Contact request cannot handle this... sending it forward\n");
            this.getNextHandler().handle(message);
        }
    }
}
