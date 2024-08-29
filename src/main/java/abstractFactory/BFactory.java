package abstractFactory;

public class BFactory extends UiFactory {

    @Override
    public Button createButton(String text) {
        return new ButtonB(text);
    }

    @Override
    public Checkbox createCheckbox(String text) {
        return new CheckboxB(text);
    }

    @Override
    public TextField createTextField(String text) {
        return new TextFieldB(text);
    }
}
