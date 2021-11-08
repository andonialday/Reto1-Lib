/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1libraries.logic;

import reto1libraries.exception.*;
import reto1libraries.object.User;

/**
 * Signable Interface 
 * @author Jaime San Sebastian,Enaitz Izagirre
 */
public interface Signable {
 
    /**
     * Sign In Method Interface
     * @param usr Takes a user from the client side
     * @return Returns a user with all the data
     * @throws reto1libraries.exception.ClientServerConnectionException If the Client cant Connect With
     * @throws reto1libraries.exception.DBConnectionException Error processing feedback from the Database
     * @throws reto1libraries.exception.CredentialErrorException If the user is not correct
     */
    public User signIn(User usr) throws ClientServerConnectionException, DBConnectionException, CredentialErrorException;
    
    /**
     * Sign Up Method Interface
     * @param usr Takes a user from the client side
     * @return Returns a user with all the data
     * @throws reto1libraries.exception.ClientServerConnectionException If the Client cant Connect With
     * @throws reto1libraries.exception.DBConnectionException Error processing feedback from the Database
     * @throws reto1libraries.exception.LoginOnUseException If the User Parameters are rown
     */
    public User signUp(User usr) throws ClientServerConnectionException, DBConnectionException, LoginOnUseException;
    
}
