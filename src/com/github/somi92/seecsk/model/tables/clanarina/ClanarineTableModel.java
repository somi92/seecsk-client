/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.model.tables.clanarina;

import com.github.somi92.seecskcommon.domain.Clanarina;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author milos
 */
public class ClanarineTableModel extends AbstractTableModel {

    private List<Clanarina> clanarine;
    
    public ClanarineTableModel() {
        clanarine = new ArrayList<>();
    }

    public ClanarineTableModel(List<Clanarina> clanarine) {
        this();
        this.clanarine = clanarine;
    }
    
    public List<Clanarina> vratiClanarine() {
        return clanarine;
    }
    
    public void postaviClanarine(List<Clanarina> clanarine) {
        this.clanarine = clanarine;
    }
    
    @Override
    public int getRowCount() {
        return clanarine.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0:
                return "Datum od";
            case 1:
                return "Datum do";
            case 2:
                return "Napomena";
            default:
                return "Greška";
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Clanarina c = clanarine.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return new SimpleDateFormat("dd/MM/yyyy").format(c.getDatumOd());
            case 1:
                return new SimpleDateFormat("dd/MM/yyyy").format(c.getDatumDo());
            case 2:
                return c.getNapomena();
            default:
                return "Greška";
        }
    }
}
