/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.model.tables.trening;

import com.github.somi92.seecsk.domain.Clan;
import com.github.somi92.seecsk.domain.Prisustvo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author milos
 */
public class PrisustvaTableModel extends AbstractTableModel {

    private List<Prisustvo> prisustva;
    
    public PrisustvaTableModel() {
        prisustva = new ArrayList<>();
    }
    
    public PrisustvaTableModel(List<Prisustvo> prisustva) {
        this();
        this.prisustva = prisustva;
    }
    
    public void postaviPrisustvaTabele(List<Prisustvo> prisustva) {
        this.prisustva = prisustva;
        fireTableDataChanged();
    }
    
    public List<Prisustvo> vratiPrisustvaTabele() {
        return prisustva;
    }
    
    @Override
    public int getRowCount() {
        return prisustva.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Prisustvo p = prisustva.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return p.getClan();
            case 1:
                return p.getPrisustvo();
            case 2:
                return p.getKasnjenjeMin();
            default:
                return "Greska";
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Prisustvo p = prisustva.get(rowIndex);
        switch(columnIndex) {
            case 0:
                p.setClan((Clan) aValue);
                break;
            case 1:
                boolean value = (boolean) aValue;
                p.setPrisustvo(value);
                if(!value) {
                    p.setKasnjenjeMin(0);
                }
                break;
            case 2:
                try {
                    p.setKasnjenjeMin(Integer.parseInt(aValue.toString())); 
                } catch (NumberFormatException ex) {
                    p.setKasnjenjeMin(0);
                }
                break;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0:
                return "Član";
            case 1:
                return "Prisutan";
            case 2:
                return "Kašnjenje";
            default:
                return "Greska";
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        Prisustvo p = prisustva.get(rowIndex);
        if(columnIndex == 1 || (p.getPrisustvo()==true && columnIndex == 2)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch(columnIndex) {
            case 0:
                return Clan.class;
            case 1:
                return JCheckBox.class;
            case 2:
                return int.class;
            default:
                return String.class;
        }
    }
}
