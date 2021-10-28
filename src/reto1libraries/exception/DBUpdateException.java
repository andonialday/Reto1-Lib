package reto1libraries.exception;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Custom controller for Update type SQL Exceptions
 * @author Aitor Perez
 */
public class DBUpdateException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    /**
     * Generation of the customized Exception
     * @param message Excepcion personalizada para cuando no se pueda actualizar
     * la base de datos.
     */
    public DBUpdateException(String message) {
	Logger logger = Logger.getAnonymousLogger();
        logger.log(Level.SEVERE, message, this);
	}

	
	
}
