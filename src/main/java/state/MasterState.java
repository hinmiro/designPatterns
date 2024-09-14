package state;

public class MasterState extends State {
    private int neededExp = 0;

    public MasterState(Character character) {
        super(character);
    }

    @Override
    public void train() {
        throw new UnsupportedOperationException("Game has ended!");
    }

    @Override
    public void meditate() {
        throw new UnsupportedOperationException("Game has ended!");

    }

    @Override
    public void fight() {
        throw new UnsupportedOperationException("Game has ended!");

    }

    @Override
    public String getName() {
        return "master";
    }

    @Override
    public int getNeededExp() {
        return 0;
    }
}
