package command;

public class MoveCursorUpCommand {

    public Integer move(int row){
        System.out.println("UP!");
        return row > 0 ? --row : 0;
    }
}
