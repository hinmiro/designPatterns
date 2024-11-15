package bridge;

public class LinuxFileDownloadImplementor implements FileDownloadImplementor {
    @Override
    public File downloadFile(String fileName, String path) {
        return new File(fileName);
    }

    @Override
    public boolean storeFile(File file) {
        System.out.println("File downloaded successfully in LINUX !!");
        return true;
    }


    @Override
    public void renameFile(String newName, File file) {
        file.setName(newName);
    }
}
