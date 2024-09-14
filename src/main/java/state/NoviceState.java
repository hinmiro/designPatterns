package state;

public class NoviceState extends State{
    private int neededExp = 100;

    public NoviceState(Character character) {
        super(character);
    }

    @Override
    public void train() {
        int exp = character.getRandom().nextInt(10, 50);
        System.out.println(character.getName() + " is training HARD! and gained " + exp + " experience points");
        character.setExperience(character.getExperience() + exp);
        if (character.getExperience() >= neededExp) {
            character.setExperience(character.getExperience() - neededExp);
            character.setState(new IntermediateState(character));
            System.out.println(character.getName() + " trained well and moved up to Intermediate level");
        }
    }

    @Override
    public void meditate() {
        System.out.println(character.getName() + " cant meditate yet. Meditate unlocks at intermediate level.");
    }

    @Override
    public void fight() {
        System.out.println(character.getName() + " cant fight yet. Fighting unlocks at expert level.");
    }

    @Override
    public String getName() {
        return "novice";
    }

    @Override
    public int getNeededExp() {
        return neededExp;
    }


}
