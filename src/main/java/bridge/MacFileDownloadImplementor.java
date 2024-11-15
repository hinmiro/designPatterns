package bridge;

public class MacFileDownloadImplementor implements FileDownloadImplementor {
    @Override
    public File downloadFile(String name, String path) {
        return new File(name);
    }

    @Override
    public boolean storeFile(File file) {
        System.out.println("File downloaded successfully in MAC !!");
        return true;
    }

    @Override
    public void renameFile(String newName, File file) {
        file.setName(newName);
    }
}
