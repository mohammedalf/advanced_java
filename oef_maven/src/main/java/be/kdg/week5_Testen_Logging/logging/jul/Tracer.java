package be.kdg.week5_Testen_Logging.logging.jul;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Tracer {
    private static final Logger logger = Logger.getLogger("kdg.week5_Testen_Logging.logging.jul.Tracer");

    public static void main(String[] args) {
        try (InputStream inputStream =
                     Tracer.class.getResourceAsStream("/logging.properties")) {

            LogManager.getLogManager()
                    .readConfiguration(inputStream);

        } catch (IOException e) {
            System.err.println("Configuratie kon niet geladen worden");
        }
        logger.severe("SEVERE boodschap");
        logger.warning("WARNING boodschap");
        logger.info("INFO boodschap");
        logger.config("CONFIG boodschap");
        logger.fine("FINE boodschap");
        logger.finer("FINER boodschap");
        logger.finest("FINEST boodschap");
    }
}
