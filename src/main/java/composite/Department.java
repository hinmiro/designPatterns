package composite;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Department extends Component {
    private String name;
    ArrayList<Component> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println("    <"+name+">");
        for (Component c : employees) {
            c.printName();
        }
        System.out.println("    </"+name+">");
    }

    @Override
    public Double getSalary() {
        Double salary = 0.0;
        for (Component c : employees) {
            salary += c.getSalary();
        }
        return salary;
    }

    @Override
    public void add(Component c) {
        employees.add(c);
    }

    @Override
    public void delete(Component c) {
        employees.remove(c);
    }

    public void printStructure() {
    }

    @Override
    public void printWholeStructureToXML(FileWriter writer) throws IOException {
        writer.write("    <" + name + ">\n");
        for (Component c : employees) {
            c.printWholeStructureToXML(writer);
        }
        writer.write("  </" + name + ">\n");
    }
}
