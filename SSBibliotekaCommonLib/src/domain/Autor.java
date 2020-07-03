/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;

/**
 *
 * @author vidan
 */
public class Autor implements OpstiDomenskiObjekat, Serializable {

    private Long sifraA;
    private String imePrezime;
    private boolean domaci;

    public Autor() {
    }

    @Override
    public String dajUslov() {
        return "WHERE SifraA = ";
    }

    public Autor(Long SifraA, String ImePrezime, boolean Domaci) {
        this.sifraA = SifraA;
        this.imePrezime = ImePrezime;
        this.domaci = Domaci;
    }

    public Long getSifraA() {
        return sifraA;
    }

    public void setSifraA(Long SifraA) {
        this.sifraA = SifraA;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String ImePrezime) {
        this.imePrezime = ImePrezime;
    }

    public boolean isDomaci() {
        return domaci;
    }

    public void setDomaci(boolean Domaci) {
        this.domaci = Domaci;
    }

    @Override
    public String dajNazivTabele() {
        return "Autor";
    }

    @Override
    public String dajNaziveAtributa() {
        return "SifraA, ImePrezime, Domaci";
    }

    @Override
    public String dajVrednostiAtributa() {
        return sifraA + ", '" + imePrezime + "', " + domaci;
    }

    @Override
    public boolean isAutoincrement() {
        return false;
    }

    @Override
    public void setId(Object id) {
        //
    }

    @Override
    public String toString() {
        return imePrezime;
    }

    @Override
    public String dajKljuc() {
        return "SifraA = "+sifraA;
    }

    @Override
    public Long dajVrednostiKljuca() {
        return sifraA;
    }

    @Override
    public String join() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
