/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.server;


import com.github.somi92.seecskcommon.transfer.OdgovorObjekat;
import com.github.somi92.seecskcommon.transfer.ZahtevObjekat;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @author milos
 */
public class ServerInstance {
    
    private static ServerInstance INSTANCA;
    
    private Socket socket;
    private ObjectInputStream in;
    private ObjectOutputStream out;
    
    private ServerInstance() {
        
    }
    
    public static ServerInstance vratiInstancu() {
        if(INSTANCA == null) {
            INSTANCA = new ServerInstance();
        }
        return INSTANCA;
    }

    public void setSocket(Socket socket) {
        try {
            this.socket = socket;
            in = new ObjectInputStream(this.socket.getInputStream());
            out = new ObjectOutputStream(this.socket.getOutputStream());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public void posaljiZahtev(ZahtevObjekat zo) {
        try {
            System.out.println(zo);
            out.writeObject(zo);
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Sistem je izgubio konekciju sa serverom, operacije ne može biti izvršena. Restartuje sistem.", 
                    "Greška", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public OdgovorObjekat vratiOdgovor() {
        try {
            OdgovorObjekat oo = (OdgovorObjekat) in.readObject();
            System.out.println(oo);
            return oo;
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Sistem je izgubio konekciju sa serverom, operacije ne može biti izvršena. Restartuje sistem.", 
                    "Greška", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
//            JOptionPane.showMessageDialog(null, "Sistem je izgubio konekciju sa serverom, operacije ne može biti izvršena. Restartuje sistem.", 
//                    "Greška", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
}
