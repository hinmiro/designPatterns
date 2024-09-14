package state;

public class ExpertState extends State {
    private int neededExp = 500;

    public ExpertState(Character character) {
        super(character);
    }

    @Override
    public void train() {
        int exp = character.getRandom().nextInt(50, 100);
        System.out.println(character.getName() + " is training HARD! and gained " + exp + " experience points");
        character.setExperience(character.getExperience() + exp);
        if (character.getExperience() >= neededExp) {
            character.setState(new MasterState(character));
            character.setExperience(character.getExperience() - neededExp);
            System.out.println(character.getName() + " trained well and moved up to Master level");
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
        if (character.getHealth() <= 20) {
            System.out.println("Health is too low, you need to meditate.");
        }

        int lostHp = character.getRandom().nextInt(40, 50);
        int gainedExp = character.getRandom().nextInt(100, 120);
        character.setHealth(character.getHealth() - lostHp);
        character.setExperience(character.getExperience() + gainedExp);
        System.out.println(character.getName() + " chose violence and fought well. You gained " + gainedExp + " experience points, but you lost " + lostHp + "health points");
    }

    @Override
    public String getName() {
        return "expert";
    }

    @Override
    public int getNeededExp() {
        return neededExp;
    }
}
