package command;

public class MoveCursorDownCommand {

    public Integer move(int row) {
        System.out.println("DOWN!");
        return row < 49 ? ++row : 49;
    }
}
