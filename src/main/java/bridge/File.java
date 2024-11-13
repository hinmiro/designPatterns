package bridge;

public class File {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return ("Filename: " + this.name);
    }
}
