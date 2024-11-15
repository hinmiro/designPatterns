package bridge;

public interface FileDownloadImplementor {
    public File downloadFile(String fileName, String path);
    public boolean storeFile(File file);
    public void renameFile(String newName, File file);
}
