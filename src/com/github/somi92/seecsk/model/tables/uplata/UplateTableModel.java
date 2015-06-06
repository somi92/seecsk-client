/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.model.tables.uplata;

import com.github.somi92.seecsk.domain.Clan;
import com.github.somi92.seecsk.domain.Clanarina;
import com.github.somi92.seecsk.domain.Uplata;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author milos
 */
public class UplateTableModel extends AbstractTableModel {

    private List<Uplata> uplate;
    private Clan clan;
    
    public UplateTableModel() {
        uplate = new ArrayList<>();
    }
    
    public UplateTableModel(List<Uplata> uplate, Clan clan) {
        this.uplate = uplate;
        this.clan = clan;
    }
    
    public void postaviUplateTabele(List<Uplata> uplate) {
        this.uplate = uplate;
    }
    
    public List<Uplata> vratiUplateTabele() {
        return uplate;
    }
    
    public void postaviClana(Clan clan) {
        this.clan = clan;
    }
    
    public Clan vratiClana() {
        return clan;
    }
    
    @Override
    public int getRowCount() {
        return uplate.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0:
                return "Članarina (period)";
            case 1:
                return "Iznos";
            case 2:
                return "Datum uplate";
            default:
                return "Greška";
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Uplata u = uplate.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return u.getClanarina();
            case 1:
                return u.getIznos();
            case 2:
                return new SimpleDateFormat("dd/MM/yyyy").format(u.getDatumUplate());
            default:
                return "Greška";
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        try {
            Uplata u = uplate.get(rowIndex);
            switch(columnIndex) {
                case 0:
                    u.setClanarina((Clanarina) aValue);
                    break;
                case 1:
                    u.setIznos(Double.parseDouble(aValue.toString()));
                    break;
                case 2:
                    u.setDatumUplate((Date)aValue);
                    break;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }
    
    public void dodajRed() {
        Uplata nova  = new Uplata();
        nova.setDatumUplate(new Date());
        nova.setClanarina(null);
        uplate.add(nova);
        fireTableDataChanged();
    }
    
    public Uplata obrisiRed(int row) {
        Uplata u = uplate.get(row);
        uplate.remove(row);
        fireTableDataChanged();
        return u;
    }
}
