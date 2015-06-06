/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.data.report;

/**
 *
 * @author milos
 */
public class NalogZaUplatu {
    
    private long id;
    private String uplatilac;
    private String svrhaUplate;
    private String primalac;
    private double iznos;
    private String racunPrimaoca;
    private String model;
    private String pozivNaBroj;

    public NalogZaUplatu() {
    }
    
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }

    public String getUplatilac() {
        return uplatilac;
    }

    public void setUplatilac(String uplatilac) {
        this.uplatilac = uplatilac;
    }

    public String getSvrhaUplate() {
        return svrhaUplate;
    }

    public void setSvrhaUplate(String svrhaUplate) {
        this.svrhaUplate = svrhaUplate;
    }

    public String getPrimalac() {
        return primalac;
    }

    public void setPrimalac(String primalac) {
        this.primalac = primalac;
    }

    public double getIznos() {
        return iznos;
    }

    public void setIznos(double iznos) {
        this.iznos = iznos;
    }

    public String getRacunPrimaoca() {
        return racunPrimaoca;
    }

    public void setRacunPrimaoca(String racunPrimaoca) {
        this.racunPrimaoca = racunPrimaoca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPozivNaBroj() {
        return pozivNaBroj;
    }

    public void setPozivNaBroj(String pozivNaBroj) {
        this.pozivNaBroj = pozivNaBroj;
    }
}
