package chainOfResponsibility;

public class Main {

    public static void main(String[] args) {
        Handler compensation = new CompensationHandler();
        Handler contact = new ContactRequestHandler();
        Handler develop = new DevelopmentHandler();
        Handler general = new GeneralFeedbackHandler();

        Message msg1 = new Message("I am requesting compensation for bad robot chicken that caused death of my cat" +
                ", and I appreciate your prompt response.", "kimmo@asd.mail", Type.COMPENSATION_CLAIMS);

        Message msg2 = new Message("I would like you to contact this email asap, " +
                "it´s about robot chicken your company sells", "chickenLover98@qwe.byz", Type.CONTACT_REQUEST);

        Message msg3 = new Message("I have great suggestion about your robot chicken, you should definitely make" +
                " it with second head!", "notChickenLover@chick.egg", Type.DEVELOPMENT_SUGGESTION);

        Message msg4 = new Message("I think you dont respond any of your feedbacks?!", "kimmo@asd.mail", Type.GENERAL_FEEDBACK);

        compensation.setNextHandler(contact);
        contact.setNextHandler(develop);
        develop.setNextHandler(general);

        compensation.handle(msg4);
        compensation.handle(msg3);
        compensation.handle(msg2);
        compensation.handle(msg1);

    }
}
