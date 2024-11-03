package visitor;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class Directory implements FileSystemElement {
    ArrayList<FileSystemElement> folder;

    public Directory() {
        folder = new ArrayList<>();
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public double getSize() {
        AtomicReference<Double> size = new AtomicReference<>((double) 0);
        folder.forEach(item -> {
            size.updateAndGet(v -> v + item.getSize());
        });
        return size.get();
    }

    @Override
    public void addElement(FileSystemElement element) {
        folder.add(element);
    }

    @Override
    public String getName() {
        return "";
    }
}
