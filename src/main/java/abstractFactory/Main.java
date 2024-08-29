package abstractFactory;

public class Main {

    public static void main(String[] args) {
        UiFactory factoryA = new AFactory();
        UiFactory factoryB = new BFactory();
        Button buttonA = factoryA.createButton("BigButton");
        Checkbox checkboxA = factoryA.createCheckbox("boxxx");
        TextField textFieldA = factoryA.createTextField("Small Field");
        Button buttonB = factoryB.createButton("floppyButton");
        TextField textFieldB = factoryB.createTextField("Horny textField");
        Checkbox checkboxB = factoryB.createCheckbox("Dragon checkbox");
        textFieldB.display();
        textFieldB.setText("!HornyField");
        textFieldB.display();

    }
}
