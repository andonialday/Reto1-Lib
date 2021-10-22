package reto1libraries.exception;

/**
 * Custom controller for Client-Server communication exceptions
 * @author Andoni Alday
 */
public class ClientServerConnectionException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    /**
     * Generation of the customized Exception
     * @param message to be shown to the user
     */
    public ClientServerConnectionException(String message) {
		super(message);
	}
	
}
