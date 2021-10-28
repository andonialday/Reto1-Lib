/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1libraries.logic;

import reto1libraries.exception.*;
import reto1libraries.object.User;

/**
 *
 * @author Jaime San Sebastian
 */
public interface Signable {
 
    /**
     *
     * @param usr
     * @return
     * @throws reto1libraries.exception.ClientServerConnectionException
     * @throws reto1libraries.exception.DBConnectionException
     * @throws reto1libraries.exception.DBReadException
     * @throws reto1libraries.exception.DBUpdateException
     */
    public User signIn(User usr) throws ClientServerConnectionException, DBConnectionException, DBReadException, DBUpdateException;
    
    /**
     *
     * @param usr
     * @return
     * @throws reto1libraries.exception.ClientServerConnectionException
     * @throws reto1libraries.exception.DBConnectionException
     * @throws reto1libraries.exception.DBReadException
     * @throws reto1libraries.exception.DBCreateException
     */
    public User signUp(User usr) throws ClientServerConnectionException, DBConnectionException, DBReadException, DBCreateException;
    
}
