package reto1libraries.exception;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Custom controller for Create type SQL Exceptions
 * @author Enaitz Izagirre
 */
public class DBCreateException extends Exception{

	
    private static final long serialVersionUID = 1L;

    /**
     * Generation of the customized Exception
     * @param message show message to the user
     */
    public DBCreateException(String message) {

	Logger logger = Logger.getAnonymousLogger();
        logger.log(Level.SEVERE, message, this);
	}

	
	
}
