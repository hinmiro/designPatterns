package builder;

public class GamingComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public GamingComputerBuilder() {
        this.computer = new Computer();
    }


    @Override
    public void buildProcessor() {
        computer.addComponent(new Hardware("AMD Ryzen 9 9950X 4.3ghz Cpu"));
    }

    @Override
    public void buildRAM() {
        computer.addComponent(new Hardware("Kingston DDR5 8GB"));
    }

    @Override
    public void buildHardDrive() {
        computer.addComponent(new Hardware("Samsung 1000GB"));
    }

    @Override
    public void buildGraphicsCard() {
        computer.addComponent(new Hardware("Asus GeForce RTX 4080"));
    }

    @Override
    public void buildOperatingSystem() {
        computer.addComponent(new Software("Windows 11 home"));
    }

    @Override
    public Computer getComputer() { return computer; }
}
