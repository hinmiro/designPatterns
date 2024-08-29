package abstractFactory;

public class ButtonB extends Button{
    private String text;

    public ButtonB(String text) {
        this.text = text;
    }

    public void display() {
        System.out.println(" ______\n| |__| |\n|  ()  |\n|______|\n"+text);
    }
}
