/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;
import java.util.List;

/**
 *
 * @author vidan
 */
public class Knjiga implements OpstiDomenskiObjekat{

    private Long sifraK;
    private String naziv;
    private String izdavalac;
    private Date datumIzdavanja;
    private String sadrzaj;
    private int brojStranica;
    private Jezik jezik;
    private List<Zanr> zanr;
    private List<Autor> autor;
    public Knjiga() {
    }

    public Knjiga(Long SifraK, String Naziv, String Izdavalac, Date DatumIzdavanja, String Sadrzaj, int BrojStranica, Jezik Jezik, List<Zanr> Zanr, List<Autor> Autor) {
        this.sifraK = SifraK;
        this.naziv = Naziv;
        this.izdavalac = Izdavalac;
        this.datumIzdavanja = DatumIzdavanja;
        this.sadrzaj = Sadrzaj;
        this.brojStranica = BrojStranica;
        this.jezik = Jezik;
        this.zanr = Zanr;
        this.autor = Autor;
    }


    

    public Long getSifraK() {
        return sifraK;
    }

    public void setSifraK(Long SifraK) {
        this.sifraK = SifraK;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String Naziv) {
        this.naziv = Naziv;
    }

    public String getIzdavalac() {
        return izdavalac;
    }

    public void setIzdavalac(String Izdavalac) {
        this.izdavalac = Izdavalac;
    }

    public Date getDatumIzdavanja() {
        return datumIzdavanja;
    }

    public void setDatumIzdavanja(Date DatumIzdavanja) {
        this.datumIzdavanja = DatumIzdavanja;
    }

    public String getSadrzaj() {
        return sadrzaj;
    }

    public void setSadrzaj(String Sadrzaj) {
        this.sadrzaj = Sadrzaj;
    }

    public int getBrojStranica() {
        return brojStranica;
    }

    public void setBrojStranica(int BrojStranica) {
        this.brojStranica = BrojStranica;
    }

    public Jezik getJezik() {
        return jezik;
    }

    public void setJezik(Jezik Jezik) {
        this.jezik = Jezik;
    }

    public List<Zanr> getZanr() {
        return zanr;
    }

    public void setZanr(List<Zanr> Zanr) {
        this.zanr = Zanr;
    }

    public List<Autor> getAutor() {
        return autor;
    }

    public void setAutor(List<Autor> Autor) {
        this.autor = Autor;
    }

    @Override
    public String dajNazivTabele() {
        return "Knjiga";
    }

    @Override
    public String dajNaziveAtributa() {
        return "SifraK, Naziv, Izdavalac, DatumIzdavanja, Sadrzaj, BrojStranica, Jezik";
    }

    @Override
    public String dajVrednostiAtributa() {
        return sifraK+", '"+naziv+"' ,'"+izdavalac+"', '"+new java.sql.Date(datumIzdavanja.getTime())+"', '"+sadrzaj+"', "+brojStranica+", '"+jezik.toString()+"'";
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
