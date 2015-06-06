/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.model.tables.trening;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author milos
 */
public class PrisustvaTableRenderer extends DefaultTableCellRenderer {

    private JCheckBox jchbPrisutan;
    private JPanel panel;
    
    public PrisustvaTableRenderer() {
        
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        panel = new JPanel(new BorderLayout());
        jchbPrisutan = new JCheckBox();
        panel.setBackground(Color.white);
        jchbPrisutan.setSelected((boolean) value);
        jchbPrisutan.setBackground(Color.white);
        JLabel lbl1 = new JLabel("                  ");
        panel.add(lbl1, BorderLayout.WEST);
        panel.add(jchbPrisutan, BorderLayout.CENTER);
        return panel;
    }

}
