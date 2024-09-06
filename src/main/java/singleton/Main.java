package singleton;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getInstance();
        logger.writeLog("This is new log from yesterday.");
        logger.setFileName("Sparrows log");
        logger.writeLog("Args! Why is the rum gone?!");
        logger.writeLog("I'm dishonest, and a dishonest man you can always trust to be dishonest.");
        logger.close();
    }
}
