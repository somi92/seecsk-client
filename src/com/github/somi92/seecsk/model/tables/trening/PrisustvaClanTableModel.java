/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.model.tables.trening;

import com.github.somi92.seecsk.domain.Prisustvo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author milos
 */
public class PrisustvaClanTableModel extends AbstractTableModel {
    
    private List<Prisustvo> prisustva;
    
    public PrisustvaClanTableModel() {
        prisustva = new ArrayList<>();
    }
    
    public PrisustvaClanTableModel(List<Prisustvo> prisustva) {
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
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
                return sdf.format(p.getTrening().getDatumVreme());
            case 1:
                return p.getPrisustvo();
            case 2:
                return p.getKasnjenjeMin();
            default:
                return "Greska";    
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0:
                return "Trening";
            case 1:
                return "Prisustvo";
            case 2:
                return "Kašnjenje";
            default:
                return "Greška";
        }
    }
    
}
