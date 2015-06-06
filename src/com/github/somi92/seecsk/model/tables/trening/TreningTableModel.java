/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.model.tables.trening;

import com.github.somi92.seecsk.domain.Trening;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author milos
 */
public class TreningTableModel extends AbstractTableModel {

    private List<Trening> treninzi;
    
    public TreningTableModel() {
        treninzi = new ArrayList<>();
    }
    
    public TreningTableModel(List<Trening> treninzi) {
        this();
        this.treninzi = treninzi;
    }
    
    public void postaviTreningeTabele(List<Trening> treninzi) {
        this.treninzi = treninzi;
    }
    
    public List<Trening> vratiTreningeTabele() {
        return treninzi;
    }

    @Override
    public int getRowCount() {
        return treninzi.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Trening t = treninzi.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return t.getIdTrening();
            case 1:
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
                return sdf.format(t.getDatumVreme());
            case 2:
                return t.getTrajanjeMin();
            case 3:
                return t.getOpisTreninga();
            default:
                return "Greska";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0:
                return "ID trening";
            case 1:
                return "Datum i vreme";
            case 2:
                return "Trajanje (min)";
            case 3:
                return "Opis treninga";
            default:
                return "Greska";
        }
    }
}
