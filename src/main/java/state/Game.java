package state;

import java.util.Scanner;

public class Game {
    private boolean isOn = true;
    private final Scanner scanner = new Scanner(System.in);


    public void start() {
        System.out.println("What is name of your character? ");
        Character character = new Character(scanner.nextLine());


        while(isOn) {
            System.out.println();
            character.display();
            System.out.println("\nChoose you action:\n\n1. Train\n2. Meditate\n3. Fight\nEXIT typing exit ends game\n\n");
            String selection = scanner.nextLine();

            switch (selection.toUpperCase()) {
                case "1" -> character.train();
                case "2" -> character.meditate();
                case "3" -> character.fight();
                case "EXIT" -> isOn = false;
                default -> System.out.println("Try choosing one from above");
            }
            if (character.getLevel().getName().equals("master")) {
                System.out.println("** Congratulation you reach to Master level and wont the game **\n\n");
                isOn = false;
                break;
            }
            if (character.getHealth() <= 0) {
                System.out.println("Health reached to 0, bad luck...");
                isOn = false;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("error, " + e.getMessage());
            }

        }
        System.out.println("Game ended bye :)");
    }
}
