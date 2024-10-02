package templateMethod;

import java.util.ArrayList;
import java.util.Scanner;

public class FeedTheTroll extends Game {
    ArrayList<Player> players;
    private Troll troll;
    Scanner scanner = new Scanner(System.in);
    Player inTurn;
    int numberOfPlayers;
    private boolean directionForward;
    private boolean changedFlag;
    private boolean turnChanged;

    @Override
    public void initializeGame(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
        directionForward = true;
        changedFlag = false;
        players = new ArrayList<>();

        for (int i = 0; i < numberOfPlayers; i++) {
            players.add(new Player(i + 1));
        }
        this.troll = new Troll();
        System.out.println("""
                Feed the Troll Game
                
                In this exciting game, your goal is to feed the troll. But be careful! Once the troll has eaten too much
                —determined by the game—it will explode, and the player who fed it last will lose.
                
                Each player has the option to skip their turn every other round and can also burp the troll, making
                more room in its stomach. Play strategically and avoid being the one who makes the troll burst!""");
    }

    @Override
    public boolean endOfGame() {
        if (troll.isBellyFull()) {
            System.out.println("Troll: \"Urp... Too... much... food... BOOM!\" troll exploded so violently that it took player " + inTurn.getPlayerNumber() + " with him!");
            return true;
        }
        return false;
    }

    @Override
    public void playSingleTurn(int player) {
        if (!directionForward) {
            player = (player - 1 + numberOfPlayers) % numberOfPlayers;
        }

        if (changedFlag) {
            player = (directionForward) ? (player + 1) % numberOfPlayers : (player - 1 + numberOfPlayers) % numberOfPlayers;
            changedFlag = false;
        }

        inTurn = players.get((player));
        System.out.println("\nPlayer " + inTurn.getPlayerNumber() + " is in turn");
        System.out.println("Choose your action for this round:\n" +
                "1. Feed troll\n" +
                "2. Skip turn (if you didnt skip last time)\n" +
                "3. Burp the troll (" + inTurn.getBurpTroll() + " burps left)");

        int decision = scanner.nextInt();
        switch (decision) {
            case 1 -> troll.feedTheTroll();
            case 2 -> handleSkip(inTurn);
            case 3 -> handleBurp(inTurn);
            default -> System.out.println("Choose more wisely");
        }


    }

    @Override
    public void displayWinner() {
        System.out.println("** Player number " + inTurn.getPlayerNumber() + "has lost the game, congratulation for else! **");
    }

    private void handleSkip(Player p) {
        if (p.isSkippedTurn()) {
            System.out.println("You skipped your turn last time, you cannot use it this turn, instead you fed troll ^^");
            troll.feedTheTroll();
            p.setHasSkipped();
            return;
        }
        p.useTurnSkip();
    }


    private void handleBurp(Player p) {
        if (p.getBurpTroll() == 0) {
            System.out.println("Sorry you cannot burp troll anymore, instead you have fed it...");
            troll.feedTheTroll();
            return;
        }
        p.setBurps();
        troll.burpMe();
    }
}
