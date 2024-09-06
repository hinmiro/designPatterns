package singleton;

import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    private static Logger INSTANCE = null;
    private FileWriter writer;

    private Logger() throws IOException {
        writer = new FileWriter("log.txt");
    }

    public static Logger getInstance() throws IOException {
        INSTANCE = INSTANCE == null ? new Logger() : INSTANCE;
        return INSTANCE;
    }

    public void writeLog(String text) throws IOException {
        writer.write(text + "\n");
    }

    public void setFileName(String name) throws IOException {
        writer.close();
        writer = new FileWriter(name + ".txt");
    }

    public void close() throws IOException {
        writer.close();
    }
}
