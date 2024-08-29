package abstractFactory;

public class TextFieldA extends TextField {
    private String text;

    public TextFieldA(String text) {
        this.text = text;
    }
    public void display() {
        System.out.println("<textfield>"+text+"</textfield>");
    }

    @Override
    public void setText(String newText) {
        this.text = newText;
    }
}
