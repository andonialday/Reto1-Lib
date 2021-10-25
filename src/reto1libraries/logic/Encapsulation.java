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
     * 
     * @return
     */
    public Method getMethod() {
        return method;
    }

    /**
     * 
     * @param method
     */
    public void setMethod(Method method) {
        this.method = method;
    }

    /**
     * 
     * @return
     */
    public Status getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     */
    public void setStatus(Status status) {
        this.status = status;
    }

}
