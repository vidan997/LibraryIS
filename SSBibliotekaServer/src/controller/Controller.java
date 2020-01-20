/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domain.Klijent;
import domain.Knjiga;
import domain.OpstiDomenskiObjekat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import so.OpstaSistemskaOperacija;
import so.SONovKlijent;
import so.SONovaKnjiga;
import so.SOPrijavaNaSistem;
import so.SOVratiKnjige;

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

    public Klijent logIn(String username, String password) throws Exception {
        Klijent KL = new Klijent();
        KL.setUserName(username);
        KL.setPassword(password);
        OpstaSistemskaOperacija oso = new SOPrijavaNaSistem(KL);
        oso.opsteIzvrsenje();
        return (Klijent) oso.getOdo();
    }
    
    public Knjiga novaKnjiga(Knjiga knjiga) throws Exception{
        OpstaSistemskaOperacija oso = new SONovaKnjiga(knjiga);
        oso.opsteIzvrsenje();
        return (Knjiga) oso.getOdo();
    }

    public Klijent novKlijent(Klijent klijent) throws Exception {
        OpstaSistemskaOperacija oso = new SONovKlijent(klijent);
        oso.opsteIzvrsenje();
        return (Klijent) oso.getOdo();
    }

    public List<OpstiDomenskiObjekat> vratiKnjige() throws Exception {
        OpstaSistemskaOperacija oso = new SOVratiKnjige(null);
        oso.opsteIzvrsenje();
        return oso.getListOdo();
    }
}
