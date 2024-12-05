package command;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Gui extends Application {
    private Pixel[][] pixels = new Pixel[50][50];
    private int currentRow = 0;
    private int currentCol = 0;
    private MoveCursorUpCommand cursorUp;
    private MoveCursorDownCommand cursorDown;
    private MoveCursorLeftCommand cursorLeft;
    private MoveCursorRightCommand cursorRight;
    private TogglePixelCommand pixelCommand;

    @Override
    public void start(Stage stage) throws Exception {
        cursorUp = new MoveCursorUpCommand();
        cursorDown = new MoveCursorDownCommand();
        cursorLeft = new MoveCursorLeftCommand();
        cursorRight = new MoveCursorRightCommand();
        pixelCommand = new TogglePixelCommand();

        AnchorPane anchorPane = new AnchorPane();

        Button generateCodeButton = new Button("Generate code");
        generateCodeButton.setOnAction(event -> handleGenerate(event));

        Button clear = new Button("Clear");
        clear.setOnAction(event -> handleClear(event));

        AnchorPane.setLeftAnchor(clear, 10.0);
        AnchorPane.setRightAnchor(generateCodeButton, 10.0);
        anchorPane.getChildren().addAll(clear, generateCodeButton);


        Insets insets = new Insets(10.0, 10.0, 10.0, 10.0);

        GridPane pane = new GridPane(500, 500);
        pane.setPadding(insets);
        pane.setHgap(1);
        pane.setVgap(1);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setStyle("-fx-border-color: black; -fx-border-width: 1;");

        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                Pixel pixel = new Pixel();
                Canvas canvas = pixel.getCanvas();
                pane.add(canvas, j, i);
                pixels[i][j] = pixel;
            }
        }


        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(borderPane, anchorPane);
        Scene scene = new Scene(vBox);
        vBox.setPadding(insets);

        pixelCommand.highlight(pixels[currentRow][currentCol]);


        scene.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case KeyCode.UP -> {
                    pixelCommand.clearHighlight(pixels[currentRow][currentCol]);
                    currentRow = cursorUp.move(currentRow);
                    pixelCommand.highlight(pixels[currentRow][currentCol]);
                }
                case KeyCode.DOWN -> {
                    pixelCommand.clearHighlight(pixels[currentRow][currentCol]);
                    currentRow = cursorDown.move(currentRow);
                    pixelCommand.highlight(pixels[currentRow][currentCol]);
                }
                case KeyCode.LEFT -> {
                    pixelCommand.clearHighlight(pixels[currentRow][currentCol]);
                    currentCol = cursorLeft.move(currentCol);
                    pixelCommand.highlight(pixels[currentRow][currentCol]);
                }
                case KeyCode.RIGHT -> {
                    pixelCommand.clearHighlight(pixels[currentRow][currentCol]);
                    currentCol = cursorRight.move(currentCol);
                    pixelCommand.highlight(pixels[currentRow][currentCol]);
                }
                case KeyCode.SPACE -> pixelCommand.toggle(pixels[currentRow][currentCol]);
                default -> System.out.println("No action for that key!");
            }
        });

        vBox.setOnMouseClicked(event -> scene.getRoot().requestFocus());


        stage.setTitle("Command");
        stage.setScene(scene);
        stage.show();
        scene.getRoot().requestFocus();
    }

    public void handleGenerate(ActionEvent event) {
        System.out.println("\nPicture in code");
        System.out.println();
        for (int i = 0; i < pixels.length - 1; i++) {
            for (int j = 0; j < pixels.length - 1; j++) {
                if (pixels[i][j].isOn()) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public void handleClear(ActionEvent event) {
        for (Pixel[] row : pixels) {
            for (Pixel pixel : row) {
                pixel.clearState();
            }
        }
    }
}
