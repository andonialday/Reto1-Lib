package reto1libraries.exception;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Custom controller for Read type SQL Exceptions
 * @author Enaitz Izagirre
 */
public class DBReadException extends Exception{

    private static final long serialVersionUID = 1L;
     

    /**
     * Generation of the customized Exception
     * @param message to show to the user
     */
    public DBReadException(String message) {
        Logger logger = Logger.getAnonymousLogger();
        logger.log(Level.SEVERE, message, this);
	}

	
	
}
