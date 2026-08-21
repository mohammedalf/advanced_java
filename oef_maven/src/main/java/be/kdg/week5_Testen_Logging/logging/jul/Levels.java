package be.kdg.week5_Testen_Logging.logging.jul;

import edu.example.EduMessenger;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Levels {
    private static final Logger logger =
            Logger.getLogger(Levels.class.getName());

    public static void main(String[] args) {

        // Laad onze loggingconfiguratie
        try (InputStream inputStream =
                     Levels.class.getResourceAsStream("/pkg_filter.properties")) {

            LogManager.getLogManager()
                    .readConfiguration(inputStream);

        } catch (IOException e) {
            System.err.println("Loggingconfiguratie kon niet geladen worden.");
        }

        // INFO uit de package be.kdg...
        logger.info("INFO uit be.kdg");

        // WARNING uit de package be.kdg...
        logger.warning("WARNING uit be.kdg");

        // Object uit een ANDERE package
        EduMessenger eduMessenger = new EduMessenger();
        eduMessenger.log();
    }
}
