package command;

public class MoveCursorLeftCommand {

    public Integer move(int col) {
        System.out.println("LEFT!");
        return col > 0 ? --col : 0;
    }
}
