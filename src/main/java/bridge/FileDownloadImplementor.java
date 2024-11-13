package bridge;

public interface FileDownloadImplementor {
    public File downloadFile(String fileName, String path);
    public boolean storeFile(Object object);
}
