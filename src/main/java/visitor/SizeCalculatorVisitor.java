package visitor;

public class SizeCalculatorVisitor implements FileSystemVisitor {


    @Override
    public void visit(Directory directory) {
        double size = 0;
        for (FileSystemElement item : directory.folder) {
            size += item.getSize();
        }
        System.out.println("directory size is " + size);
    }

    @Override
    public void visit(File file) {
        System.out.println("Size of file is " + file.getSize());
    }
}
