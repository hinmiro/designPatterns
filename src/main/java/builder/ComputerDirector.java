package builder;

public class ComputerDirector {
    private ComputerBuilder builder;

    public ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }

    public void constructOfficeComputer() {
        builder.buildOperatingSystem();
        builder.buildRAM();
        builder.buildProcessor();
        builder.buildGraphicsCard();
        builder.buildHardDrive();
    }

    public void constructGamingComputer() {
        builder.buildOperatingSystem();
        builder.buildRAM();
        builder.buildRAM();
        builder.buildProcessor();
        builder.buildGraphicsCard();
        builder.buildHardDrive();
    }
}
