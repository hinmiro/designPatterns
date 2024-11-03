package visitor;

public class SearchVisitor implements FileSystemVisitor {
    String search;
    static int i = 1;

    public SearchVisitor(String search) {
        this.search = search;
    }

    @Override
    public void visit(Directory directory) {
        System.out.println("Searching from " + i + ". directory");
        for (FileSystemElement item : directory.folder) {
            if (item instanceof Directory) {
                i++;
                item.accept(this);
            } else if (item.getName().matches(search)) {
                System.out.println(item.getName());
            }
        }
    }

    @Override
    public void visit(File file) {
        throw new RuntimeException("Cannot search from file");
    }
}
