package composite;


public class Main {
    public static void main(String[] args) {
        Component o = new Organization("factory");
        Component department = new Department("Sales");
        Component departmentB = new Department("HandWaving");
        department.add(new Employee("Hillary", 33322.0));
        department.add(new Employee("MArk", 22.0));
        o.add(department);
        o.add(departmentB);
        departmentB.add(new Employee("Karl", 14300.5));
        departmentB.add(new Employee("Ronald", 6666.5));
        o.printName();
        o.printToXml();


    }
}
