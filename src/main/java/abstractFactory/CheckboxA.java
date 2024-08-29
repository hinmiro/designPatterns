package abstractFactory;

public class CheckboxA extends Checkbox{
    private String text;

    public CheckboxA(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        System.out.println("\uD83D\uDDF9 " + text);
    }

    @Override
    public void setText(String newText) {
        this.text = newText;
    }
}
