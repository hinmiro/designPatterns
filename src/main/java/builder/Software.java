package builder;

public class Software implements Component {
    private String name;

    public Software(String name) {
        this.name = name;
    }



    @Override
    public String getComponentName() {
        return this.name;
    }
}
