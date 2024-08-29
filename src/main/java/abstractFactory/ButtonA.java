package abstractFactory;

public class ButtonA extends Button {
    private String text;

    public ButtonA(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        System.out.println("╔════════════════╗");
        System.out.println("║   "+text+"     ");
        System.out.println("╚════════════════╝");
    }

    @Override
    public void setText(String newText) {
        this.text = newText;
    }
}
