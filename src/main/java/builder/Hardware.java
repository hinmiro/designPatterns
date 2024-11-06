package builder;

public class Hardware implements Component{
    private String name;

    public Hardware(String name) {
        this.name = name;
    }


    @Override
    public String getComponentName() {
        return this.name;
    }
}
