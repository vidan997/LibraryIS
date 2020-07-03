/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domain.Klijent;
import domain.Knjiga;
import domain.OpstiDomenskiObjekat;
import exception.LogInException;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import so.*;
import validator.impl.*;

/**
 *
 * @author vidan
 */
public class Controller {

    private static Controller instance;

    private Controller() {
    }

    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }

    public OpstiDomenskiObjekat logIn(String username, String password) throws LogInException, Exception {
        Klijent klijent = new Klijent();
        klijent.setUserName(username);
        klijent.setPassword(password);
        OpstaSistemskaOperacija oso = new SOPrijavaNaSistem(klijent);
        oso.opsteIzvrsenje();
        return oso.getOdo();
    }
    
    public Knjiga novaKnjiga(Map knjiga) throws Exception{
        OpstaSistemskaOperacija oso = new SONovaKnjiga(knjiga, new ValidatorKnjiga());
        oso.opsteIzvrsenje();
        return (Knjiga) oso.getOdo();
    }

    public Klijent novKlijent(Map klijent) throws Exception {
        OpstaSistemskaOperacija oso = new SONovKlijent(klijent, new ValidatorKlijent());
        oso.opsteIzvrsenje();
        return (Klijent) oso.getOdo();
    }

    public List<OpstiDomenskiObjekat> vratiKnjige() throws Exception {
        OpstaSistemskaOperacija oso = new SOVratiKnjige();
        oso.opsteIzvrsenje();
        return oso.getListOdo();
    }
    
    public List<OpstiDomenskiObjekat> sacuvajZaduzivanja(List<OpstiDomenskiObjekat> zaduzivanja) throws Exception{
        OpstaSistemskaOperacija oso = new SOZaduzivanjeKnjige(zaduzivanja);
        oso.opsteIzvrsenje();
        return oso.getListOdo();
    }

    public Klijent nadjiKlijenta(Klijent klijent) throws Exception {
        OpstaSistemskaOperacija oso = new SONadjiKlijenta(klijent);
        oso.opsteIzvrsenje();
        return (Klijent) oso.getOdo();
    }

    public Object vratiZanrove() throws Exception{
        OpstaSistemskaOperacija oso = new SOVratiZanrove();
        oso.opsteIzvrsenje();
        return oso.getListOdo();
    }

    public Object vratiAutore() throws Exception{
        OpstaSistemskaOperacija oso = new SOVratiAutore();
        oso.opsteIzvrsenje();
        return oso.getListOdo();
    }

    public Object vratiZaduzivanja(Klijent klijent) throws Exception {
        OpstaSistemskaOperacija oso = new SOVratiZaduzenja(klijent);
        oso.opsteIzvrsenje();
        return oso.getListOdo();
    }

    public void razduziZ(List<OpstiDomenskiObjekat> zaduzivanja) throws Exception {
        OpstaSistemskaOperacija oso = new SORazduzivanjeKnjige(zaduzivanja);
        oso.opsteIzvrsenje();
    }

    public void unosClanarine(OpstiDomenskiObjekat klijent) throws Exception {
        OpstaSistemskaOperacija oso = new SOIzmenaKlijenta(klijent);
        oso.opsteIzvrsenje();
    }
}
