package templateMethod;


import java.util.Random;

public class Troll {
    Random random = new Random();

    private int belly;
    private int goal;

    public Troll() {
        goal = random.nextInt(200, 350);
    }

    public boolean isBellyFull() {
        return belly >= goal;
    }

    public void feedTheTroll() {
        belly += random.nextInt(15, 45);
    }

    public void burpMe() {
        goal = goal - 100;
        if (goal < 0) goal = 0;

        System.out.println("\nTroll: Burrrp! Ah, that's the sound of a meal well devoured!");
    }


}
