package decorator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter extends PrinterDecorator {

    FileWriter writer;

    public FilePrinter(Printer printer) throws IOException {
        super(printer);
        File file = new File("decorated_print.txt");
        writer = new FileWriter(file, true);

    }

    @Override
    public void print(String message) throws IOException {
        writer.write(message + "\n");
        writer.flush();
    }
}
