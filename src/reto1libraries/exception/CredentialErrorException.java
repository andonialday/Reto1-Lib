package reto1libraries.exception;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Custom trigger for credential error on SignIn requests
 *
 * @author Andoni Alday
 */
public class CredentialErrorException extends Exception {

    private static final long serialVersionUID = 1L;

    /**
     * Generation of the customized Exception
     *
     * @param message
     */
    public CredentialErrorException(String message) {
        Logger logger = Logger.getAnonymousLogger();
        logger.log(Level.SEVERE, message, this);
    }

}
