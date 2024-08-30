package composite;

import java.io.FileWriter;
import java.io.IOException;

public class Employee extends Component {
    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void printName() {
        System.out.println("        <"+name+"> </"+name+">");;
    }

    @Override
    public Double getSalary() {
        return salary;
    }

    @Override
    public void add(Component c) {
        throw new IllegalArgumentException("there is none");
    }

    @Override
    public void delete(Component c) {
        throw new IllegalArgumentException("there is none");
    }

    @Override
    public void printWholeStructureToXML(FileWriter writer) throws IOException {
        writer.write("      <" + name + ">"+salary+"$"+"</" + name + ">\n");
    }

}
