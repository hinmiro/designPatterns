package decorator;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class Main {

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        Printer printer = new BasicPrinter();
        printer.print("Printer goes prrrrrprrrprprrr!");


        Printer printer2 = new EncryptedPrinter(new FilePrinter(new BasicPrinter()));
        printer2.print("“You must unlearn what you have learned.”");
        printer2.decryptPrint();

        System.out.println();

        Printer printer3 = new EncryptedPrinter(new BasicPrinter());
        printer3.print("Hello printer!");
        printer3.decryptPrint();


    }
}
