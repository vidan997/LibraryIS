/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import domain.OpstiDomenskiObjekat;
import domain.Zaduzivanje;

/**
 *
 * @author vidan
 */
public class SOZaduzivanjeKnjige extends OpstaSistemskaOperacija{

    public SOZaduzivanjeKnjige(OpstiDomenskiObjekat odo) {
        super(odo);
    }

    @Override
    public void izvrsenjeOperacije() throws Exception {
        
        Zaduzivanje zaduzivanje = (Zaduzivanje) odo;
        dbbr.insert(odo);
        
        
    }
    
}
