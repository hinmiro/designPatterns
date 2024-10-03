package chainOfResponsibility;

public class CompensationHandler extends Handler {

    @Override
    public void handle(Message message) {
        if (message.type == Type.COMPENSATION_CLAIMS) {
            System.out.println(message.senderEmail + " is seeking for compensation claims, message is:\n" + message.messageContent);
            System.out.println("Processing your claim... aaaand it's gone! \uD83D\uDE2C Thanks for complaining, better luck next time!\n");
        } else {
            System.out.println("Compensation claim handler cannot handle this... sending it to next handler.\n");
            this.getNextHandler().handle(message);
        }
    }
}
