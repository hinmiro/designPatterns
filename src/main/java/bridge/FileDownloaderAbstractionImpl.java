package bridge;

public class FileDownloaderAbstractionImpl implements FileDownloaderAbstraction {
    private FileDownloadImplementor provider = null;

    public FileDownloaderAbstractionImpl(FileDownloadImplementor provider) {
        super();
        this.provider = provider;
    }

    @Override
    public File download(String fileName, String path) {
        return provider.downloadFile(fileName, path);
    }

    @Override
    public boolean store(File object) {
        return provider.storeFile(object);
    }

    @Override
    public void renameFile(String newName, File file) {
        provider.renameFile(newName, file);
    }
}
