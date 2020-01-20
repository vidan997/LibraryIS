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
public class PrimerakKnjige implements OpstiDomenskiObjekat{

    private Knjiga knjiga;
    private int invertacioniBr;
    private boolean zaduzena;

    public PrimerakKnjige() {
    }

    public PrimerakKnjige(Knjiga Knjiga, int InvertacioniBr, boolean Zaduzena) {
        this.knjiga = Knjiga;
        this.invertacioniBr = InvertacioniBr;
        this.zaduzena = Zaduzena;
    }

    public Knjiga getKnjiga() {
        return knjiga;
    }

    public void setKnjiga(Knjiga Knjiga) {
        this.knjiga = Knjiga;
    }

    public int getInvertacioniBr() {
        return invertacioniBr;
    }

    public void setInvertacioniBr(int InvertacioniBr) {
        this.invertacioniBr = InvertacioniBr;
    }

    public boolean isZaduzena() {
        return zaduzena;
    }

    public void setZaduzena(boolean Zaduzena) {
        this.zaduzena = Zaduzena;
    }

    @Override
    public String dajNazivTabele() {
        return "PrimerakKnjige";
    }

    @Override
    public String dajNaziveAtributa() {
        return "SifraK, InvertacioniBr, Zaduzena";
    }

    @Override
    public String dajVrednostiAtributa() {
        return knjiga.getSifraK()+", "+invertacioniBr+", "+zaduzena;
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
