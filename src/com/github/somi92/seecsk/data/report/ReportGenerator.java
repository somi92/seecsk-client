/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.data.report;

import com.github.somi92.seecsk.util.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

/**
 *
 * @author milos
 */
public class ReportGenerator {
    
    public String uplatilac;
    
    public static void generateInvoice(NalogZaUplatu n) throws JRException, ClassNotFoundException {
        
        String reportFile = "src/com/github/somi92/seecsk/data/report/templates/NalogZaUplatu.jasper";
        List<NalogZaUplatu> nalog = new ArrayList<>();
        nalog.add(n);
        
        JRBeanCollectionDataSource bean = new JRBeanCollectionDataSource(nalog);
        Map params = new HashMap();
        
        try {
            JasperPrint jprint = JasperFillManager.fillReport(reportFile, params, bean);
            JasperExportManager.exportReportToPdfFile(jprint, 
                    Constants.LocationConfigKeys.TEMP_INVOICE_LOCATION+"uplatnica_"+n.getId()+".pdf");
        } catch (Exception ex) {
            ex.printStackTrace();
            
        }
        
    }
}
