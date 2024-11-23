package mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
    private List<Window> windows;

    public Mediator() {
        windows = new ArrayList<>();
    }

    public void addWindow(Window w) {
        windows.add(w);
    }

    public void sendMessage(String msg, String sender, String recipient) {
        if (recipient.equals("All")) {
            for (Window w : windows) {
                w.renderMessage(msg, sender);
            }
        } else {
            for (Window w : windows) {
                if (w.getName().equals(recipient)) {
                    w.renderMessage(msg, sender);
                }
            }
        }
    }
}
