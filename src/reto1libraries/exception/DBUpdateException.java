package reto1libraries.exception;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Custom controller for Update type SQL Exceptions
 * @author Enaitz Izagirre
 */
public class DBUpdateException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    /**
     * Generation of the customized Exception
     * @param message
     */
    public DBUpdateException(String message) {
	Logger logger = Logger.getAnonymousLogger();
        logger.log(Level.SEVERE, message, this);
	}

	
	
}
