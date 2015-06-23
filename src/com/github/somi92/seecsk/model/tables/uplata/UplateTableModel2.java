/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.model.tables.uplata;

import com.github.somi92.seecskcommon.domain.Uplata;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author milos
 */
public class UplateTableModel2 extends AbstractTableModel {
    
    private List<Uplata> uplate;
    
    public UplateTableModel2() {
        uplate = new ArrayList<>();
    }
    
    public UplateTableModel2(List<Uplata> uplate) {
        this();
        this.uplate = uplate;
    }
    
    public void postaviUplateTabele(List<Uplata> uplate) {
        this.uplate = uplate;
    }
    
    public List<Uplata> vratiUplateTabele() {
        return uplate;
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
                return "Iznos";
            case 1:
                return "Datum uplate";
            case 2:
                return "Član";
            default:
                return "Greška";
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Uplata u = uplate.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return u.getIznos()+"";
            case 1:
                return new SimpleDateFormat("dd/MM/yyyy").format(u.getDatumUplate());
            case 2:
                return u.getClan().getImePrezime()+"";
            default:
                return "Greška";
        }
    }
}
