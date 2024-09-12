package decorator;

import java.io.IOException;

public class BasicPrinter implements Printer{

    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public void decryptPrint() throws IOException {

    }
}
