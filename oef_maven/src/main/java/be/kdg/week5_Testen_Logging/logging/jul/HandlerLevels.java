package be.kdg.week5_Testen_Logging.logging.jul;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class HandlerLevels {
    private static final Logger logger = Logger.getLogger(HandlerLevels.class.getName());

    public static void main(String[] args) {
        // Configuratiebestand laden
        try (InputStream inputStream =
                     HandlerLevels.class.getResourceAsStream("/fileLogging.properties")) {

            LogManager.getLogManager().readConfiguration(inputStream);

        } catch (IOException e) {
            System.err.println("Loggingconfiguratie kon niet geladen worden.");
        }

        // Drie verschillende logging-levels
        logger.log(Level.FINER, "A message to you, Rudy.");
        logger.log(Level.FINE, "Message in a bottle.");
        logger.log(Level.INFO, "Kleine boodschap.");
    }
}
