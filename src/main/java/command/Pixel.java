package command;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Pixel {
    private boolean isOn;
    private Canvas canvas;
    private GraphicsContext gc;

    public Pixel() {
        isOn = false;
        canvas = new Canvas(8, 8);
        gc = canvas.getGraphicsContext2D();
    }

    public void setOn() {
        isOn = true;
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }

    public void setOff() {
        isOn = false;
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        highlight();
    }

    public boolean isOn() {
        return isOn;
    }

    public void toggle(boolean state) {
        if (state) {
            setOn();
        } else {
            setOff();
        }
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void highlight() {
        gc.setStroke(Color.LIGHTBLUE);
        gc.setLineWidth(2);
        gc.strokeRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }

    public void clearHighlight() {
        if (isOn) {
            gc.setFill(Color.BLACK);
            gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        } else {
            gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

        }
    }

    public void clearState() {
        isOn = false;
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }
}
