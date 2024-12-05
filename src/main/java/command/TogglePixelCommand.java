package command;


public class TogglePixelCommand {

    public void toggle(Pixel pixel) {
        pixel.toggle(!pixel.isOn());
    }

    public void highlight(Pixel pixel) {
        pixel.highlight();
    }

    public void clearHighlight(Pixel pixel) {
        pixel.clearHighlight();
    }

}
