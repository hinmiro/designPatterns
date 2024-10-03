package decorator;

import java.io.IOException;

public abstract class PrinterDecorator implements Printer {

    private Printer printer;

    public PrinterDecorator(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String message) throws IOException {
        printer.print(message);
    }

    @Override
    public void decryptPrint() throws IOException {}

}