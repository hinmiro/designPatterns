package bridge;

public class WindowsFileDownloadImplementor implements FileDownloadImplementor {
    @Override
    public File downloadFile(String fileName, String path) {
        return new File(fileName);
    }

    @Override
    public boolean storeFile(File file) {
        System.out.println("File downloaded successfully in WINDOWS !!");
        return true;
    }

    @Override
    public void renameFile(String newName, File file) {
        file.setName(newName);
    }
}
