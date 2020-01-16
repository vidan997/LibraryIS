/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author vidan
 */
public class Autor implements OpstiDomenskiObjekat{
    private Long sifraA;
    private String imePrezime;
    private boolean domaci;

    public Autor() {
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
        return sifraA+", '"+imePrezime+"', "+domaci;
    }

    @Override
    public boolean isAutoincrement() {
        return false;
    }

    @Override
    public void setId(Object id) {
        //
    }
    
    
}