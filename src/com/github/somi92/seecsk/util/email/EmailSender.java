/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.util.email;

import com.github.somi92.seecsk.util.Config;
import com.github.somi92.seecsk.util.Constants;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

/**
 *
 * @author milos
 */
public class EmailSender {
    
    public static void sendEmail(EmailContainer ec) throws RuntimeException {
        
        try {
            
            String user = Config.vratiInstancu().vratiVrednost(Constants.OrgInfoConfigKeys.ORGANISATION_EMAIL);
            String password = Config.vratiInstancu().vratiVrednost(Constants.OrgInfoConfigKeys.ORGANISATION_EMAIL_PASSWORD);
            
            EmailAttachment ea = new EmailAttachment();
            ea.setPath(ec.getAttachmentPath());
            ea.setDisposition(EmailAttachment.ATTACHMENT);
            ea.setDescription("Primer ispravno popunjene uplatnice za članarinu");
            ea.setName("uplatnica.pdf");
            
            MultiPartEmail mpe = new MultiPartEmail();
            mpe.setDebug(true);
            mpe.setAuthenticator(new DefaultAuthenticator(user, password));
            mpe.setHostName(Config.vratiInstancu().vratiVrednost(Constants.EmailServerConfigKeys.EMAIL_SERVER_HOST));
            mpe.setSSLOnConnect(true);
            mpe.setStartTLSEnabled(true);
            mpe.setSslSmtpPort(Config.vratiInstancu().vratiVrednost(Constants.EmailServerConfigKeys.EMAIL_SERVER_PORT));
            mpe.setSubject(ec.getSubject());
            mpe.setFrom(ec.getFromEmail(), Config.vratiInstancu().vratiVrednost(Constants.OrgInfoConfigKeys.ORGANISATION_NAME));
            mpe.setMsg(ec.getMessage());

            mpe.addTo(ec.getToEmail());
            mpe.attach(ea);
            
            mpe.send();
            
        } catch (EmailException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Sistem nije uspeo da pošalje email. Pokušajte ponovo.");
        }
    }
}
