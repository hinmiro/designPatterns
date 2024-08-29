package abstractFactory;

public class AFactory extends UiFactory {

    @Override
    public void createButton(String text) {
        new ButtonA(text).display();
    }

    @Override
    public void createCheckbox(String text) {
        new CheckboxA(text).display();
    }

    @Override
    public void createTextField(String text) {
        new TextFieldA(text).display();
    }
}
