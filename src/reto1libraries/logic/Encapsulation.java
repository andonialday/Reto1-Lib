/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1libraries.logic;

import java.io.Serializable;
import reto1libraries.object.User;

/**
 * Class to encapsulate the metho requestedby the Client Application's name, the
 * User to be managed and a control String to notice the different applications
 * of the process status
 *
 * @author Andoni Alday
 */
public class Encapsulation implements Serializable {

    private User user;
    private Method method;
    private Status status;

    /**
     * Getter of the User
     * @return the User to be used by the listening application
     */
    public User getUser() {
        return user;
    }

    /**
     * Setter for the User
     * @param user going to be send by an application
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Getter of the Method identification
     * @return the identification of the method
     */
    public Method getMethod() {
        return method;
    }

    /**
     * Setter ofthe Method identification
     * @param method the identification of the Method
     */
    public void setMethod(Method method) {
        this.method = method;
    }

    /**
     * Getter of the proces Status information
     * @return the process Status information
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Setter ofthe process Status information
     * @param status the information of the process Status
     */
    public void setStatus(Status status) {
        this.status = status;
    }

}
