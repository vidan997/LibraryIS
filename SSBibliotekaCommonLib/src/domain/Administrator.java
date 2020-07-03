/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author vidan
 */
public class Administrator implements OpstiDomenskiObjekat,Serializable {

    private Long sifraA;
    private Date datumZaposlenja;
    private int jmbg;
    private String ime;
    private String prezime;
    private Date datumRodjenja;
    private String userName;
    private String password;

    public Administrator() {
    }

    public Administrator(Long sifraA, int jmbg, String ime, String prezime, Date datumRodjenja, Date datumZaposlenja, String userName, String password) {
        this.sifraA = sifraA;
        this.jmbg = jmbg;
        this.ime = ime;
        this.prezime = prezime;
        this.datumRodjenja = datumRodjenja;
        this.datumZaposlenja = datumZaposlenja;
        this.userName = userName;
        this.password = password;
    }

    public Long getSifraA() {
        return sifraA;
    }

    public void setSifraA(Long SifraA) {
        this.sifraA = SifraA;
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

    public Date getDatumZaposlenja() {
        return datumZaposlenja;
    }

    public void setDatumZaposlenja(Date DatumZaposlenja) {
        this.datumZaposlenja = DatumZaposlenja;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setJmbg(int jmbg) {
        this.jmbg = jmbg;
    }

    public int getJmbg() {
        return jmbg;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String dajNazivTabele() {
        return "Administrator";
    }

    @Override
    public String dajNaziveAtributa() {
        return "SifraA, JMBG, Ime, Prezime, DatumRodjenja, DatumZaposlenja, Username, Password";
    }

    @Override
    public String dajVrednostiAtributa() {
        return sifraA + ", " + jmbg + ", '" + ime + "*, '" + prezime + "', '"+new java.sql.Date(datumRodjenja.getTime())+
                "', '"+new java.sql.Date(datumZaposlenja.getTime())+"', "+userName+"', '"+password+"'";
    }

    @Override
    public boolean isAutoincrement() {
        return false;
    }

    @Override
    public void setId(Object id) {
    }

    @Override
    public String dajUslov() {
        return "WHERE SifraA = ";
    }

    @Override
    public String toString() {
        return "Administrator: "+ime+" "+prezime;
        
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
