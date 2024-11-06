package builder;

public class OfficeComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public OfficeComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.addComponent(new Hardware("Intel Core i7-14700KF"));
    }

    @Override
    public void buildRAM() {
        computer.addComponent(new Hardware("8 GB"));
    }

    @Override
    public void buildHardDrive() {
        computer.addComponent(new Hardware("500 GB"));
    }

    @Override
    public void buildGraphicsCard() {
        computer.addComponent(new Hardware("Integrated graphics card in motherboard"));
    }

    @Override
    public void buildOperatingSystem() {
        computer.addComponent(new Software("Windows 11 pro"));
    }

    @Override
    public Computer getComputer() { return computer; }
}
