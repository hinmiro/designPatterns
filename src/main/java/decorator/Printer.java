package decorator;

import java.io.IOException;

public interface Printer {

    void print(String message) throws IOException;
    void decryptPrint() throws IOException;
}
