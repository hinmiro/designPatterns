package abstractFactory;

public class BFactory extends UiFactory {

    @Override
    public void createButton(String text) {
        new ButtonB(text).display();
    }

    @Override
    public void createCheckbox(String text) {
        new CheckboxB(text).display();
    }

    @Override
    public void createTextField(String text) {
        new TextFieldB(text).display();
    }
}
