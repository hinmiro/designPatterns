package abstractFactory;

public class Main {

    public static void main(String[] args) {
        UiFactory factoryA = new AFactory();
        UiFactory factoryB = new BFactory();
        factoryA.createButton("BigButton");
        factoryA.createCheckbox("boxxx");
        factoryA.createTextField("Small Field");
        factoryB.createButton("floppyButton");
        factoryB.createTextField("Horny textField");
        factoryB.createCheckbox("Dragon checkbox");

    }
}
