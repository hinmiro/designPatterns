package visitor;

public class File implements FileSystemElement {
    String name;
    double sizeMb;

    public File(String name, double sizeMb) {
        this.name = name;
        this.sizeMb = sizeMb;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public double getSize() {
        return sizeMb;
    }

    @Override
    public void addElement(FileSystemElement element) {
        throw new RuntimeException("Cannot add element to file");
    }

    @Override
    public String getName() {
        return name;
    }
}
