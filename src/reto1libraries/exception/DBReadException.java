package reto1libraries.exception;

/**
 * Custom controller for Read type SQL Exceptions
 * @author Enaitz Izagirre
 */
public class DBReadException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    /**
     * Generation of the customized Exception
     * @param message
     */
    public DBReadException(String message) {
		super(message);
	}

	
	
}
