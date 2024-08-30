package composite;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Organization extends Component {
    private ArrayList<Component> organization = new ArrayList<>();
    private String name;

    public Organization(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println("<"+name+">");
        for (Component c : organization) {
            c.printName();
        }
        System.out.println("</"+name+">");
    }

    @Override
    public Double getSalary() {
        Double salary = 0.0;
        for (Component c : organization) {
            salary += c.getSalary();
        }
        return salary;
    }


    @Override
    public void add(Component c) {
        organization.add(c);
    }

    @Override
    public void delete(Component c) {
        organization.remove(c);
    }

    public void printWholeSalary() {
        System.out.println("Whole salary of " + name + " is " + getSalary());
    }

    public void printStructure() {
        System.out.println("<" + name + ">");
        for (Component c : organization) {
            c.printName();
        }
        System.out.println("</" + name + ">");
    }

    public String getName() {return name;}

    @Override
    public void printWholeStructureToXML(FileWriter writer) throws IOException {

        writer.write("<" + name + ">\n");
        for (Component c : organization) {
            c.printWholeStructureToXML(writer);
        }
        writer.write("</" + name + ">\n");
    }

    public void printToXml() {
        try (FileWriter writer = new FileWriter(String.format("%s.xml", name))) {
            printWholeStructureToXML(writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
