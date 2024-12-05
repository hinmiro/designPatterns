package command;

public class MoveCursorRightCommand {

    public Integer move(int col) {
        System.out.println("RIGHT!");
        return col < 49 ? ++col : 49;
    }
}
