package chainOfResponsibility;

public class DevelopmentHandler extends Handler {

    @Override
    public void handle(Message message) {
        if (message.type == Type.DEVELOPMENT_SUGGESTION) {
            System.out.println(message.senderEmail + " email contains development suggestions, routing it to development teams...\n");
        } else {
            System.out.println("Development handler cannot handle this... sending it forward\n");
            this.getNextHandler().handle(message);
        }
    }
}
