/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.data;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author milos
 */
public class Sesija {
    
    public static final String CLAN_OPERACIJA = "clan_operacija";
    public static final String CLAN = "clan";
    public static final String TRENING = "trening";
    public static final String GRUPA = "grupa";
    public static final String NALOG_ZA_UPLATU = "nalog_za_uplatu";
    public static final String LISTA = "lista";
    public static final String EMAIL = "email";
    
    private static Sesija INSTANCE;
    private Map<String, Object> mapaSesije;
    
    private Sesija() {
        mapaSesije = new HashMap<>();
    }
    
    public static Sesija vratiInstancu() {
        if(INSTANCE == null) {
            INSTANCE = new Sesija();
        }
        return INSTANCE;
    }
    
    public Map<String, Object> vratiMapuSesije() {
        return mapaSesije;
    }
}
