package reto1libraries.exception;

/**
 * Custom controller for Connect type SQL Exceptions
 * @author Jaime San Sebastian
 */
public class DBConnectionException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    /**
     * Generation of the customized Exception
     * @param message
     */
    public DBConnectionException(String message) {
		super(message);
	}
	
}
