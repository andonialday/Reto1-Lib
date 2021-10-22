package reto1libraries.exception;

/**
 * Custom controller for Create type SQL Exceptions
 * @author Enaitz Izagirre
 */
public class DBCreateException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    /**
     * Generation of the customized Exception
     * @param message
     */
    public DBCreateException(String message) {
		super(message);
	}

	
	
}
