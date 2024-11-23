package mediator;

import javafx.scene.control.ListView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Window {
    private static int i = 1;
    private String name;
    private ListView<String> userMessages;

    public Window(ListView<String> userMessages, String name) {
        this.userMessages = userMessages;
        this.name = name;
    }

    public String getName() {return name;}


    public void renderMessage(String msg, String senderName) {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
        String formatted = formatter.format(new Date());
        userMessages.getItems().add(msg + "  (from " + senderName + " " + formatted+")");
    }
}
