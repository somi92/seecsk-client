/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.main;

import com.github.somi92.seecsk.gui.FMainForm;
import com.github.somi92.seecsk.server.ServerInstance;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author milos
 */
public class Main {
    
    public static void main(String[] args) {
        
        try {
            //        DBBroker broker = new DBBroker();
//        broker.setDatabase("seecsk");
            ServerInstance.vratiInstancu().setSocket(new Socket("127.0.0.1", 9000));
        } catch (IOException ex) {
            ex.printStackTrace();
            return;
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FMainForm().setVisible(true);
            }
        });
    }
}
