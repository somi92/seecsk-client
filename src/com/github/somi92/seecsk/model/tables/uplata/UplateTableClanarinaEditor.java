/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.model.tables.uplata;

import com.github.somi92.seecsk.domain.Clanarina;
import java.awt.Component;
import javax.swing.AbstractCellEditor;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

/**
 *
 * @author milos
 */
public class UplateTableClanarinaEditor extends AbstractCellEditor implements TableCellEditor {

    private JComboBox<Object> jcmbClanarina;
    
    public UplateTableClanarinaEditor(Object[] c) {
        jcmbClanarina = new JComboBox<>(c);
    }
    
    public void postaviClanarine(Clanarina[] c) {
        jcmbClanarina = new JComboBox<>(c);
    }
    
    @Override
    public Object getCellEditorValue() {
        return jcmbClanarina.getSelectedItem();
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        Clanarina c = (Clanarina) value;
        jcmbClanarina.setSelectedItem(c);
        return jcmbClanarina;
    }
    
}
