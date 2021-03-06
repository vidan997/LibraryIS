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
public class Zanr implements OpstiDomenskiObjekat,Serializable{
    
    private Long sifraZ;
    private String tip;

    public Zanr() {
    }

    public Zanr(Long SifraZ, String Tip) {
        this.sifraZ = SifraZ;
        this.tip = Tip;
    }

    public Long getSifraZ() {
        return sifraZ;
    }

    public void setSifraZ(Long SifraZ) {
        this.sifraZ = SifraZ;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String Tip) {
        this.tip = Tip;
    }

    @Override
    public String dajNazivTabele() {
        return "Zanr";
    }

    @Override
    public String dajNaziveAtributa() {
        return "SifraZ, Tip";
    }

    @Override
    public String dajVrednostiAtributa() {
        return sifraZ+", '"+tip+"'";
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
    public String dajUslov() {
        return "WHERE SifraZ = ";
    }

    @Override
    public String toString() {
        return tip;
    }

    @Override
    public String dajKljuc() {
        return "SifraZ = "+sifraZ;
    }

    @Override
    public Long dajVrednostiKljuca() {
        return sifraZ;
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
