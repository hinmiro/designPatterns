package chainOfResponsibility;

public class GeneralFeedbackHandler extends Handler {

    @Override
    public void handle(Message message) {
        if (message.type == Type.GENERAL_FEEDBACK) {
            System.out.println("Sending feedback for analyzing method...");
            analyzeAndRespond(message);
            System.out.println();
        }
    }

    public void analyzeAndRespond(Message message) {
        System.out.println("Analyzing feedback...");
        System.out.println("Constructing response...");
        System.out.println("Response sent to " + message.senderEmail);
        System.out.println();
    }
}
