package templateMethod;

public class Player {

    private int burpTroll = 1;
    private int playerNumber;
    private boolean hasSkippedTurn = false;

    public Player(int num) {
        this.playerNumber = num;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }


    public void useTurnSkip() {
        hasSkippedTurn = true;
    }

    public void setHasSkipped() {
        hasSkippedTurn = false;
    }

    public int getBurpTroll() {
        return burpTroll;
    }

    public boolean isSkippedTurn() {
        return hasSkippedTurn;
    }
}
