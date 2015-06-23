/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.gui.panels;

import com.github.somi92.seecsk.gui.FMainForm;
import com.github.somi92.seecsk.model.tables.clanarina.ClanarineTableModel;
import com.github.somi92.seecsk.model.tables.uplata.UplateTableModel2;
import com.github.somi92.seecsk.server.ServerInstance;
import com.github.somi92.seecskcommon.domain.Clanarina;
import com.github.somi92.seecskcommon.domain.Uplata;
import com.github.somi92.seecskcommon.transfer.OdgovorObjekat;
import com.github.somi92.seecskcommon.transfer.ZahtevObjekat;
import com.github.somi92.seecskcommon.util.Ref;
import com.github.somi92.seecskcommon.util.SistemskeOperacije;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author milos
 */
public class MembershipFeePanel extends javax.swing.JPanel {
    
    private FMainForm parent;
    /**
     * Creates new form MembershipFeePanel
     */
    public MembershipFeePanel(FMainForm parent) {
        this.parent = parent;
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

        jLabel1 = new javax.swing.JLabel();
        jpnlClanarine = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jdccOd = new datechooser.beans.DateChooserCombo();
        jLabel4 = new javax.swing.JLabel();
        jdccDo = new datechooser.beans.DateChooserCombo();
        jbtnPronadji = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtxtNapomena = new javax.swing.JTextField();
        jchbPeriod = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblClanarine = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblUplate = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jbtnPostaviUplate = new javax.swing.JButton();

        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Evidencija članarina");

        jpnlClanarine.setBorder(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Pretraga članarina"));

        jLabel3.setText("od:");

        jdccOd.setFormat(2);
        jdccOd.setEnabled(false);
        jdccOd.setLocale(new java.util.Locale("sr", "BA", ""));

        jLabel4.setText("do:");

        jdccDo.setEnabled(false);
        jdccDo.setLocale(new java.util.Locale("sr", "BA", ""));

        jbtnPronadji.setText("Pronađi");
        jbtnPronadji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPronadjiActionPerformed(evt);
            }
        });

        jLabel5.setText("Napomena:");

        jchbPeriod.setText("Period:");
        jchbPeriod.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jchbPeriod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchbPeriodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jdccOd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jdccDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jchbPeriod))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jtxtNapomena, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnPronadji, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jchbPeriod))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jdccOd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtxtNapomena, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jdccDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnPronadji, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel6.setText("Članarine:");

        jtblClanarine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtblClanarine);

        jtblUplate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jtblUplate);

        jLabel7.setText("Uplate:");

        jbtnPostaviUplate.setText("->");
        jbtnPostaviUplate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPostaviUplateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnlClanarineLayout = new javax.swing.GroupLayout(jpnlClanarine);
        jpnlClanarine.setLayout(jpnlClanarineLayout);
        jpnlClanarineLayout.setHorizontalGroup(
            jpnlClanarineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlClanarineLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlClanarineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlClanarineLayout.createSequentialGroup()
                        .addGroup(jpnlClanarineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jpnlClanarineLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(677, 677, 677)
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jpnlClanarineLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnPostaviUplate, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );
        jpnlClanarineLayout.setVerticalGroup(
            jpnlClanarineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlClanarineLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnlClanarineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnlClanarineLayout.createSequentialGroup()
                        .addGroup(jpnlClanarineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGroup(jpnlClanarineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnlClanarineLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpnlClanarineLayout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(jbtnPostaviUplate))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(146, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnlClanarine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnlClanarine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnPostaviUplateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPostaviUplateActionPerformed
        postaviUplate();
    }//GEN-LAST:event_jbtnPostaviUplateActionPerformed

    private void jbtnPronadjiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPronadjiActionPerformed
        List<Clanarina> sample = new ArrayList<>();
        sample.add(new Clanarina());
        Ref<List<Clanarina>> clanarineRef = new Ref(sample);
        
        clanarineRef = postaviClanarine(clanarineRef);
        
        if(clanarineRef != null) {
            List<Clanarina> clanarine = new ArrayList<>();
            Date odDatum = jdccOd.getSelectedDate().getTime();
            Date doDatum = jdccDo.getSelectedDate().getTime();
            String napomena = jtxtNapomena.getText().trim();
            for(Clanarina c : clanarineRef.get()) {
                
                if(jchbPeriod.isSelected()) {
                    if(c.getDatumOd().after(odDatum) && c.getDatumDo().before(doDatum) || 
                            (napomena != null && !napomena.isEmpty() && c.getNapomena() != null && c.getNapomena().contains(napomena))) {
                        clanarine.add(c);
                    }
                } else {
                    if(napomena != null && !napomena.isEmpty() && c.getNapomena() != null && c.getNapomena().contains(napomena)) {
                        clanarine.add(c);
                    }
                }
                
//                if(jchbPeriod.isSelected() && c.getDatumOd().after(odDatum) && c.getDatumDo().before(doDatum)) {
//                    if(napomena != null && !napomena.isEmpty() && c.getNapomena().contains(napomena)) {
//                        clanarine.add(c);
//                    }
//                }
                
            }
            ctm.postaviClanarine(clanarine);
            ctm.fireTableDataChanged();
            JOptionPane.showMessageDialog(this, "Sistem je pronašao članarine.");
        } else {
            JOptionPane.showMessageDialog(this, "Sistem ne može da pronađe članarine.", "Greška", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtnPronadjiActionPerformed

    private void jchbPeriodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchbPeriodActionPerformed
        if(jchbPeriod.isSelected()) {
            jdccDo.setEnabled(true);
            jdccOd.setEnabled(true);
        } else {
            jdccDo.setEnabled(false);
            jdccOd.setEnabled(false);
        }
    }//GEN-LAST:event_jchbPeriodActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnPostaviUplate;
    private javax.swing.JButton jbtnPronadji;
    private javax.swing.JCheckBox jchbPeriod;
    private datechooser.beans.DateChooserCombo jdccDo;
    private datechooser.beans.DateChooserCombo jdccOd;
    private javax.swing.JPanel jpnlClanarine;
    private javax.swing.JTable jtblClanarine;
    private javax.swing.JTable jtblUplate;
    private javax.swing.JTextField jtxtNapomena;
    // End of variables declaration//GEN-END:variables
    private UplateTableModel2 utm2;
    private ClanarineTableModel ctm;
    
    public void initForm() {
        utm2 = new UplateTableModel2();
        jtblUplate.setModel(utm2);
        ctm = new ClanarineTableModel();
        jtblClanarine.setModel(ctm);
        
        List<Clanarina> sample = new ArrayList<>();
        sample.add(new Clanarina());
        Ref<List<Clanarina>> clanarineRef = new Ref(sample);
        
        clanarineRef = postaviClanarine(clanarineRef);
        
        if(clanarineRef != null) {
            ctm.postaviClanarine(clanarineRef.get());
//            JOptionPane.showMessageDialog(this, "Sistem je pronašao članarine.");
        } else {
//            JOptionPane.showMessageDialog(this, "Sistem ne može da pronađe članarine.", "Greška", JOptionPane.ERROR_MESSAGE);
        }
        
        jtblClanarine.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
           
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(!e.getValueIsAdjusting()) {
//                    postaviUplate();
                    List<Uplata> u = new ArrayList<>();
                    utm2.postaviUplateTabele(u);
                    utm2.fireTableDataChanged();
                }
            }
        });
    }
    
    private Ref<List<Clanarina>> postaviClanarine(Ref<List<Clanarina>> clanarineRef) {
        ZahtevObjekat zo = new ZahtevObjekat();
        zo.setSistemskaOperacija(SistemskeOperacije.SO_PRONADJI_CLANARINE);
        zo.setUcitajListe(false);
        zo.setParametar(clanarineRef);
        ServerInstance.vratiInstancu().posaljiZahtev(zo);
        OdgovorObjekat oo = ServerInstance.vratiInstancu().vratiOdgovor();
        clanarineRef = oo.getPodaci();
        if(oo.getStatusOperacije()==0) {
            return clanarineRef;
        } else {
            return null;
        }
    }
    
    private void postaviUplate() {
        int selectedRow = jtblClanarine.getSelectedRow();
        if(selectedRow > -1) {
            
            Clanarina c = ctm.vratiClanarine().get(selectedRow);
            Ref<Clanarina> clanarinaRef = new Ref<>(c);
            
            ZahtevObjekat zo = new ZahtevObjekat();
            zo.setSistemskaOperacija(SistemskeOperacije.SO_UCITAJ_CLANARINU);
            zo.setParametar(clanarinaRef);
            ServerInstance.vratiInstancu().posaljiZahtev(zo);
            OdgovorObjekat oo = ServerInstance.vratiInstancu().vratiOdgovor();
            clanarinaRef = oo.getPodaci();
            if(oo.getStatusOperacije() == 0) {
                List<Uplata> uplate = clanarinaRef.get().getUplate();
                utm2.postaviUplateTabele(uplate);
                utm2.fireTableDataChanged();
                JOptionPane.showMessageDialog(this, "Sistem je pronšao podatke o izabranoj članarini.");
            } else {
                JOptionPane.showMessageDialog(this, "Sistem ne može da pronađe podatke o izabranoj članarini.", "Greška", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}