/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1libraries.logic;

import java.io.Serializable;

/**
 * Status enumeration for the encapsulation, indicating the status of execution
 * of the method
 *
 * @author Andoni Alday
 */
public enum Status implements Serializable {

    /**
     * Enumeration option 0, the method pending for an answer of the server
     */
    PENDING,
    /**
     * Enumeration option 1, the method hascorrectlyexecuted
     */
    CORRECT,
    /**
     * Enumeration option 2, the method executed with a failing result
     * (incorrect login credentials, already existing user...)
     */
    FAIL,
    /**
     * Enumeration option 3,the method failed to executed due to an error
     */
    ERROR;
}
