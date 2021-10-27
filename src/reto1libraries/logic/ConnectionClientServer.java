/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1libraries.logic;

/**
 *
 * @author Andoni Alday
 */
public class ConnectionClientServer {

    /**
     * IP of the Server Application
     */
    public final String SERVER = "192.168.20.51";

    /**
     * Port of communication
     */
    public final int PORT = 5000;

    /**
     *
     * @return
     */
    public String getSERVER() {
        return SERVER;
    }

    /**
     *
     * @return
     */
    public int getPORT() {
        return PORT;
    }
}
