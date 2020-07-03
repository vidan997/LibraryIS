/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author vidan
 */
public class Zaduzivanje implements OpstiDomenskiObjekat, Serializable {

    private Klijent klijent;
    private PrimerakKnjige knjiga;
    private boolean odobreno;
    private Date datumZaduzivanja;
    private Date doDatuma;
    private Date datumRazduzivanja;
    private boolean prekoracen;
    private Administrator administrator;

    public Zaduzivanje() {
    }

    public Zaduzivanje(Klijent Klijent, PrimerakKnjige Knjiga, boolean Odobreno, Date DatumZaduzivanja, Date DoDatuma, Date DatumRazduzivanja, boolean Prekoracen, Administrator administrator) {
        this.klijent = Klijent;
        this.knjiga = Knjiga;
        this.odobreno = Odobreno;
        this.datumZaduzivanja = DatumZaduzivanja;
        this.doDatuma = DoDatuma;
        this.datumRazduzivanja = DatumRazduzivanja;
        this.prekoracen = Prekoracen;
        this.administrator = administrator;
    }

    public Klijent getKlijent() {
        return klijent;
    }

    public void setKlijent(Klijent Klijent) {
        this.klijent = Klijent;
    }

    public PrimerakKnjige getKnjiga() {
        return knjiga;
    }

    public void setKnjiga(PrimerakKnjige Knjiga) {
        this.knjiga = Knjiga;
    }

    public boolean isOdobreno() {
        return odobreno;
    }

    public void setOdobreno(boolean Odobreno) {
        this.odobreno = Odobreno;
    }

    public Date getDatumZaduzivanja() {
        return datumZaduzivanja;
    }

    public void setDatumZaduzivanja(Date DatumZaduzivanja) {
        this.datumZaduzivanja = DatumZaduzivanja;
    }

    public Date getDoDatuma() {
        return doDatuma;
    }

    public void setDoDatuma(Date DoDatuma) {
        this.doDatuma = DoDatuma;
    }

    public Date getDatumRazduzivanja() {
        return datumRazduzivanja;
    }

    public void setDatumRazduzivanja(Date DatumRazduzivanja) {
        this.datumRazduzivanja = DatumRazduzivanja;
    }

    public boolean isPrekoracen() {
        return prekoracen;
    }

    public void setPrekoracen(boolean Prekoracen) {
        this.prekoracen = Prekoracen;
    }

    public Administrator getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }

    @Override
    public String dajNazivTabele() {
        return "Zaduzivanje";
    }

    @Override
    public String dajNaziveAtributa() {
        return "SifraKL, SifraK, InvertacioniBr, Odobreno, DatumZaduzivanja, DoDatuma, DatumRazduzivanja, Prekoracen, SifraA";
    }

    @Override
    public String dajVrednostiAtributa() {
        return klijent.getSifraKL() + ", " + knjiga.getKnjiga().getSifraK() + ", " + knjiga.getInvertacioniBr() + ", " + (odobreno ? 1 : 0)+ ", '" + new java.sql.Date(datumZaduzivanja.getTime()) + "', '" + new java.sql.Date(doDatuma.getTime()) + "', '" + new java.sql.Date(datumRazduzivanja.getTime()) + "', " + prekoracen + ", " + administrator.getSifraA();
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
        return "WHERE SifraKL = ";
    }

    @Override
    public String dajKljuc() {
        return "SifraKL = "+klijent.getSifraKL()+" AND SifraK = "+knjiga.getKnjiga().getSifraK()+" AND InvertacioniBr = "+knjiga.getInvertacioniBr();
    }

    @Override
    public String join() {
        return "k.SifraK AS SifraKnjige, k.InvertacioniBr AS InvertacioniBroj ,k.Zaduzena AS Zaduzena, kn.Naziv AS Naziv, z.Odobreno AS Odobreno, z.DatumZaduzivanja AS DatumZaduzivanja, z.DoDatuma AS DoDatuma, z.DatumRazduzivanja AS DatumRazduzivanja, z.Prekoracen AS Prekoracen FROM Zaduzivanje z JOIN primerakknjige k ON z.InvertacioniBr = k.InvertacioniBr JOIN knjiga kn ON kn.SifraK = k.SifraK WHERE z.SifraKL =";
    }

    @Override
    public Long dajVrednostiKljuca() {
        return null;
    }

    @Override
    public String update() {
        return "SifraKL = "+klijent.getSifraKL()+", SifraK = "+knjiga.getKnjiga().getSifraK()+", InvertacioniBr = "+knjiga.getInvertacioniBr()+", Odobreno = "+(odobreno ? 1 : 0)+", DatumZaduzivanja = "+ new java.sql.Date(datumZaduzivanja.getTime()) +", DoDatuma = "+ new java.sql.Date(doDatuma.getTime()) +", DatumRazduzivanja = "+ new java.sql.Date(datumRazduzivanja.getTime()) +", Prekoracen = "+(prekoracen ? 1 : 0)+", SifraA = "+administrator.getSifraA();
    }

}
