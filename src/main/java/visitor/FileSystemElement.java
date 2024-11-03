package visitor;

public interface FileSystemElement {
    void accept(FileSystemVisitor visitor);
    double getSize();
    void addElement(FileSystemElement element);
    String getName();
}
