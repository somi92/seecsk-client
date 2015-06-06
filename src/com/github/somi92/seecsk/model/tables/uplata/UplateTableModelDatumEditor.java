/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.model.tables.uplata;

import datechooser.beans.DateChooserBean;
import datechooser.beans.DateChooserCombo;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractCellEditor;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

/**
 *
 * @author milos
 */
public class UplateTableModelDatumEditor extends AbstractCellEditor implements TableCellEditor {

    private DateChooserCombo dateChooser;
    
    public UplateTableModelDatumEditor() {
        dateChooser = new DateChooserCombo();
        dateChooser.setDateFormat(new SimpleDateFormat("dd/MM/yyyy"));
    }
    
    @Override
    public Object getCellEditorValue() {
        return new Date(dateChooser.getSelectedDate().getTimeInMillis());
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date datum = sdf.parse(value.toString());
            Calendar c = Calendar.getInstance();
            c.setTime(datum);
            dateChooser.setSelectedDate(c);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return dateChooser;
    }
    
    
}
