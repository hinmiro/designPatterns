package bridge;

public interface FileDownloaderAbstraction {
    public File download(String fileName, String path);
    public boolean store(File object);
    public void renameFile(String newName, File file);

}
