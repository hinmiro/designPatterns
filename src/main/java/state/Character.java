package state;

import java.util.Random;

public class Character {
    private String name;
    private int experience, health;
    private State level;
    private Random random;

    public Character(String name) {
        this.name = name;
        experience = 0;
        health = 100;
        level = new NoviceState(this);
        random = new Random();
    }

    public State getLevel() {
        return level;
    }

    public void setHealth(int hp) {
        health = hp;
    }

    public int getHealth() {
        return health;
    }

    public void setState(State state) {
        level = state;
    }

    public void setExperience(int exp) {
        experience = exp;
    }

    public int getExperience() {
        return experience;
    }

    public String getName() {
        return name;
    }

    public Random getRandom() {
        return random;
    }

    public void display() {
        System.out.println("** Status **");
        System.out.println("name: " + name);
        System.out.println("level: " + level.getName());
        System.out.println("experience: " + experience + "/" + level.getNeededExp());
        System.out.println("health: " + health + "/100");
        System.out.println("** ** ** ** **");
    }

    public void train() {
        level.train();
    }

    public void meditate() {
        level.meditate();
    }

    public void fight() {
        level.fight();
    }
}
