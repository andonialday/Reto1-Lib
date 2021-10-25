/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1libraries.logic;

import java.io.Serializable;

/**
 *
 * @author Andoni Alday
 */
public enum Status implements Serializable{

    /**
     * Enumeration option 0
     */
    PENDING,

    /**
     * Enumeration option 1
     */
    CORRECT,
    
    /**
     * Enumeration option 2
     */
    FAIL,
    
    /**
     * Enumeration option 3
     */
    ERROR;
}