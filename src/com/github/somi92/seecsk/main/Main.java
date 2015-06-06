/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.main;

import com.github.somi92.seecsk.gui.FMainForm;

/**
 *
 * @author milos
 */
public class Main {
    
    public static void main(String[] args) {
        
//        DBBroker broker = new DBBroker();
//        broker.setDatabase("seecsk");
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FMainForm().setVisible(true);
            }
        });
    }
}
