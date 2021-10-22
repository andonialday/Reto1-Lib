package reto1libraries.exception;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Custom controller for Client-Server communication exceptions
 *
 * @author Andoni Alday
 */
public class ServerClientConnectionException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Generation of the customized Exception
     *
     * @param message to be shown to the user
     */
    public ServerClientConnectionException(String message) {
        Logger logger = Logger.getAnonymousLogger();
        logger.log(Level.SEVERE, message, this);
    }

}
