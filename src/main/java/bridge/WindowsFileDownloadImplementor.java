package bridge;

public class WindowsFileDownloadImplementor implements FileDownloadImplementor {
    @Override
    public File downloadFile(String fileName, String path) {
        return new File(fileName);
    }

    @Override
    public boolean storeFile(Object object) {
        System.out.println("File downloaded successfully in WINDOWS !!");
        return true;
    }
}
