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
public class Zanr implements OpstiDomenskiObjekat{
    
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
    public void dajUslov() {
        //
    }

    
}
