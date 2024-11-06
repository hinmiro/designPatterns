package builder;

import java.util.ArrayList;

public class Computer {
    private ArrayList<Component> components;

    public Computer() {
        components = new ArrayList<>();
    }


    public void addComponent(Component component) {
        components.add(component);
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Component c : components) {
            s.append(c.getComponentName());
            s.append("\n");
        }
        return s.toString();
    }

}
