package bridge;

public class Main {
    public static void main(String[] args) {
        String os = "mac";
        FileDownloaderAbstraction downloader = null;

        switch (os) {
            case "windows":
                downloader = new FileDownloaderAbstractionImpl(new WindowsFileDownloadImplementor());
                break;

            case "linux":
                downloader = new FileDownloaderAbstractionImpl(new LinuxFileDownloadImplementor());
                break;

            case "mac":
                downloader = new FileDownloaderAbstractionImpl(new MacFileDownloadImplementor());
                break;

            default:
                System.out.println("OS not supported !!");
        }

        File fileContent = downloader.download("music", "some path");
        downloader.store(fileContent);
        System.out.println(fileContent.toString());
        downloader.renameFile("Cooool_MUSIC", fileContent);
        System.out.println("Renaming file");
        System.out.println(fileContent);

    }
}
