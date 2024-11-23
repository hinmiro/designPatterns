package mediator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Gui extends Application {
    private static Mediator med = new Mediator();
    private String name;
    private static int i = 1;

    @Override
    public void start(Stage stage) throws Exception {
        openNewWindow();
        openNewWindow();
        openNewWindow();
    }

    private void openNewWindow() {
        Stage newWindow = new Stage();
        newWindow.setTitle("Window"+i++);

        ListView<String> userMessages = new ListView<>();
        userMessages.setPrefSize(300, 200);

        TextArea textArea = new TextArea();
        textArea.setPrefSize(300, 100);

        ComboBox<String> recipientBox = new ComboBox<>();
        recipientBox.getItems().addAll("Window1", "Window2", "Window3", "All");
        recipientBox.setValue("All");

        Button sendButton = new Button("Send");
        sendButton.setOnAction((event -> handleSend(event, textArea, newWindow.getTitle(), recipientBox.getValue())));
        HBox buttonContainer = new HBox(sendButton);
        buttonContainer.setAlignment(Pos.BASELINE_RIGHT);

        VBox newWindowLayout = new VBox(10);
        newWindowLayout.getChildren().addAll(recipientBox, userMessages, textArea, buttonContainer);
        newWindowLayout.setPadding(new Insets(10, 10, 10, 10));

        Scene newWindowScene = new Scene(newWindowLayout);

        newWindow.setScene(newWindowScene);
        newWindow.show();

        Window window = new Window(userMessages, newWindow.getTitle());
        med.addWindow(window);
    }

    private void handleSend(ActionEvent event, TextArea area, String windowName, String recipient) {
        med.sendMessage(area.getText(), windowName, recipient);
        area.clear();
    }
}
