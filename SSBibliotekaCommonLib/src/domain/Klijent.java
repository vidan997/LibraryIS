/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.awt.Image;
import java.util.Date;

/**
 *
 * @author vidan
 */
public class Klijent implements OpstiDomenskiObjekat {

    private Long sifraKL;
    private int jmbg;
    private String ime;
    private String prezime;
    private Date datumRodjenja;
    private Date clanarina;
    private boolean isteklaClanarina;
    private int kontakt;
    private Image slika;
    private String userName;
    private String password;

    public Klijent() {
    }

    public Klijent(Long sifraKL, int jmbg, String ime, String prezime, Date datumRodjenja, Date clanarina, boolean isteklaClanarina, int kontakt, Image slika, String userName, String password) {
        this.sifraKL = sifraKL;
        this.jmbg = jmbg;
        this.ime = ime;
        this.prezime = prezime;
        this.datumRodjenja = datumRodjenja;
        this.clanarina = clanarina;
        this.isteklaClanarina = isteklaClanarina;
        this.kontakt = kontakt;
        this.slika = slika;
        this.userName = userName;
        this.password = password;
    }

    public Long getSifraKL() {
        return sifraKL;
    }

    public void setSifraKL(Long SifraKL) {
        this.sifraKL = SifraKL;
    }

    public int getJMBG() {
        return jmbg;
    }

    public void setJMBG(int JMBG) {
        this.jmbg = JMBG;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String Ime) {
        this.ime = Ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String Prezime) {
        this.prezime = Prezime;
    }

    public Date getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(Date DatumRodjenja) {
        this.datumRodjenja = DatumRodjenja;
    }

    public Date getClanarina() {
        return clanarina;
    }

    public void setClanarina(Date Clanarina) {
        this.clanarina = Clanarina;
    }

    public boolean isIsteklaClanarina() {
        return isteklaClanarina;
    }

    public void setIsteklaClanarina(boolean IsteklaClanarina) {
        this.isteklaClanarina = IsteklaClanarina;
    }

    public int getKontakt() {
        return kontakt;
    }

    public void setKontakt(int Kontakt) {
        this.kontakt = Kontakt;
    }

    public Image getSlika() {
        return slika;
    }

    public void setSlika(Image Slika) {
        this.slika = Slika;
    }

    public int getJmbg() {
        return jmbg;
    }

    public String getUserName() {
        return userName;
    }

    public void setJmbg(int jmbg) {
        this.jmbg = jmbg;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return ime + " " + prezime;
    }

    @Override
    public String dajNazivTabele() {
        return "Klijent";
    }

    @Override
    public String dajNaziveAtributa() {
        return "SifraKL, JMBG, Ime, Prezime, DatumRodjenja, Clanarina, IsteklaClanarina, Kontakt, Username, Password";
    }

    @Override
    public String dajVrednostiAtributa() {
        return sifraKL+", "+jmbg+", '"+ime+"', '"+prezime+"', '"+new java.sql.Date(datumRodjenja.getTime())+
                "', '"+new java.sql.Date(clanarina.getTime())+"', "+isteklaClanarina+", "+kontakt+"', "+userName+"', '"+password+"'";
    }

    @Override
    public boolean isAutoincrement() {
        return true;
    }

    @Override
    public void setId(Object id) {
        this.sifraKL=(Long)id;
    }

    @Override
    public void dajUslov() {
        //
    }

    
}
