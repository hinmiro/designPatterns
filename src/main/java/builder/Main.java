package builder;

import visitor.Directory;

public class Main {
    public static void main(String[] args) {
        ComputerBuilder builder = new OfficeComputerBuilder();
        ComputerDirector director = new ComputerDirector(builder);
        director.constructOfficeComputer();
        Computer computer = builder.getComputer();
        System.out.println(computer.toString());
    }
}
