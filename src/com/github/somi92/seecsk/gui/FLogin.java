/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.gui;

import com.github.somi92.seecsk.domain.Zaposleni;
import com.github.somi92.seecsk.server.ServerInstance;
import com.github.somi92.seecsk.transfer.OdgovorObjekat;
import com.github.somi92.seecsk.transfer.ZahtevObjekat;
import com.github.somi92.seecsk.util.Config;
import com.github.somi92.seecsk.util.Constants;
import com.github.somi92.seecsk.util.Ref;
import com.github.somi92.seecsk.util.SistemskeOperacije;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author milos
 */
public class FLogin extends javax.swing.JFrame {

    /**
     * Creates new form FLogin
     */
    public FLogin() {
        initComponents();
        initForm();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxtIP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtPort = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtKorisnik = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtSifra = new javax.swing.JPasswordField();
        jbtnPrijaviSe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dobrodošli - Login");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("IP adresa:");

        jLabel2.setText("Port:");

        jLabel3.setText("Korisničko ime:");

        jLabel4.setText("Šifra:");

        jbtnPrijaviSe.setText("Prijavi se");
        jbtnPrijaviSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrijaviSeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxtIP, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtPort, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtKorisnik, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtSifra, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtnPrijaviSe, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxtKorisnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxtSifra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbtnPrijaviSe, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnPrijaviSeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrijaviSeActionPerformed
        try {
            String ip = jtxtIP.getText().trim();
            int port  = Integer.parseInt(jtxtPort.getText().trim());
            String korisnik = jtxtKorisnik.getText().trim();
            String sifra = new String(jtxtSifra.getPassword());
            if(korisnik==null || korisnik.isEmpty() || sifra==null || sifra.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Korisničko ime ili šifra su neispravno uneti.");
                return;
            }
            Config.vratiInstancu().postaviVrednost(Constants.ServerConfigKeys.SERVER_IP, ip);
            Config.vratiInstancu().postaviVrednost(Constants.ServerConfigKeys.SERVER_PORT, port+"");
            
            Socket socket = new Socket(ip, port);
            ServerInstance.vratiInstancu().setSocket(socket);
            Zaposleni z = new Zaposleni();
            z.setKorisnickoIme(korisnik);
            z.setSifra(sifra);
            
            Ref<Zaposleni> refZaposleni = new Ref<>(new Zaposleni());
            refZaposleni.set(z);
            ZahtevObjekat zo = new ZahtevObjekat();
            zo.setSistemskaOperacija(SistemskeOperacije.SO_PRONADJI_ADMINISTRATORA);
            zo.setParametar(refZaposleni);
            ServerInstance.vratiInstancu().posaljiZahtev(zo);
            OdgovorObjekat oo = ServerInstance.vratiInstancu().vratiOdgovor();
            refZaposleni = oo.getPodaci();
            if(oo.getStatusOperacije()==0) {
                JOptionPane.showMessageDialog(this, "OK! "+refZaposleni.get());
            } else {
                JOptionPane.showMessageDialog(this, "Greška! Kombinacija korisničko ime/šifra nije ispravna. Nemate pristup sistemu.");
            }
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Neispravan broj porta.");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Greška! Sistem ne može uspostaviti konekciju sa serverom.");
        }
    }//GEN-LAST:event_jbtnPrijaviSeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnPrijaviSe;
    private javax.swing.JTextField jtxtIP;
    private javax.swing.JTextField jtxtKorisnik;
    private javax.swing.JTextField jtxtPort;
    private javax.swing.JPasswordField jtxtSifra;
    // End of variables declaration//GEN-END:variables

    private void initForm() {
        String ip = Config.vratiInstancu().vratiVrednost(Constants.ServerConfigKeys.SERVER_IP);
        String port = Config.vratiInstancu().vratiVrednost(Constants.ServerConfigKeys.SERVER_PORT);
        jtxtIP.setText(ip);
        jtxtPort.setText(port);
    }
}
