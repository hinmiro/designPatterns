package state;


import java.util.Random;

public class IntermediateState extends State{
    private int neededExp = 200;

    public IntermediateState(Character character) {
        super(character);
    }

    @Override
    public void train() {
        int exp = character.getRandom().nextInt(40, 75);
        System.out.println(character.getName() + " is training HARD! and gained " + exp + " experience points");
        character.setExperience(character.getExperience() + exp);
        if (character.getExperience() >= neededExp) {
            character.setExperience(character.getExperience() - getNeededExp());
            character.setState(new ExpertState(character));
            System.out.println(character.getName() + " trained well and moved up to Expert level");
        }
    }

    @Override
    public void meditate() {
        int hp = character.getRandom().nextInt(10, 30);
        character.setHealth(character.getHealth() + hp);
        if (character.getHealth() > 100) {
            character.setHealth(100);
        }
        System.out.println(character.getName() + " gained " + hp + " health points by meditating.");
    }

    @Override
    public void fight() {
        System.out.println(character.getName() + " cant fight yet. Fighting unlocks at expert level.");
    }

    @Override
    public String getName() {
        return "intermediate";
    }

    @Override
    public int getNeededExp() {
        return neededExp;
    }


}
