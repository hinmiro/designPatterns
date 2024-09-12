package decorator;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class EncryptedPrinter extends PrinterDecorator {

    private SecretKey secretKey;
    private String encryptedMessage;

    public EncryptedPrinter(Printer printer) throws NoSuchAlgorithmException {
        super(printer);
        KeyGenerator keyGen = KeyGenerator.getInstance("Blowfish");
        keyGen.init(128);
        this.secretKey = keyGen.generateKey();
    }

    @Override
    public void print(String message) throws IOException {
        System.out.println("** Encrypting **");
        try {
            Cipher encrypt = Cipher.getInstance("Blowfish");
            encrypt.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] cryptedBytes = encrypt.doFinal(message.getBytes());
            String encryptedMessage = Base64.getEncoder().encodeToString(cryptedBytes);
            this.encryptedMessage = encryptedMessage;
            super.print(encryptedMessage);
        } catch (Exception e) {
            throw new IOException("Encryption error", e);
        }
    }

    @Override
    public void decryptPrint() throws IOException {
        System.out.println("** Decrypting **");
        try {
            Cipher decrypt = Cipher.getInstance("Blowfish");
            decrypt.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] decodedBytes = Base64.getDecoder().decode(encryptedMessage);
            byte[] decryptedBytes = decrypt.doFinal(decodedBytes);
            String decryptedMessage = new String(decryptedBytes);
            super.print(decryptedMessage);
        } catch (Exception e) { throw new IOException("Decrypt error", e); }
    }
}
