package be.kdg.week5_Testen_Logging.logging.jul;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Messenger {
    private static final Logger logger = Logger.getLogger("kdg.week5_Testen_Logging.logging.jul.Messenger");

    public static void main(String[] args) {
        logger.log(Level.INFO, "A message to you, Rudy.");

        //
        logger.log(Level.SEVERE, "SEVERE boodschap");
        logger.log(Level.WARNING, "WARNING boodschap");
        logger.log(Level.INFO, "INFO boodschap");
        logger.log(Level.CONFIG, "CONFIG boodschap");
        logger.log(Level.FINE, "FINE boodschap");
        logger.log(Level.FINER, "FINER boodschap");
        logger.log(Level.FINEST, "FINEST boodschap");
    }


}
