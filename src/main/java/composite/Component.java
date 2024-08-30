package composite;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public abstract class Component {
    private String name;
    private ArrayList<Component> list = new ArrayList<>();

    public abstract void printName();

    public abstract Double getSalary();

    public abstract void add(Component c);

    public abstract void delete(Component c);

    public void printStructure() {
        throw new UnsupportedOperationException("printStructure not implemented");
    }

    public void printWholeSalary() {
        throw new UnsupportedOperationException("printSalary not implemented");
    }

    public void printWholeStructureToXML(FileWriter writer) throws IOException {
        throw new UnsupportedOperationException("printWholeStructureToXML not implemented");
    }

    public String getName(){return null;}
    public void printToXml(){}
}
