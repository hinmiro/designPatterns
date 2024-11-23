package flyweight;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class View extends Application {
    private StackPane pane;
    private Canvas canvas;
    private GameMap map;

    @Override
    public void start(Stage stage) throws Exception {
        pane = new StackPane();
        canvas = new Canvas(400,400);
        pane.getChildren().add(canvas);


        map = new CityMap(canvas);

        Scene scene = new Scene(pane,600,600);
        stage.setScene(scene);
        stage.setTitle("Game Map");
        stage.show();
    }
}
