/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import domain.OpstiDomenskiObjekat;
import domain.Zaduzivanje;
import java.util.List;

/**
 *
 * @author vidan
 */
public class SOZaduzivanjeKnjige extends OpstaSistemskaOperacija{

    public SOZaduzivanjeKnjige(List<OpstiDomenskiObjekat> listodo) {
        super(listodo);
    }

    @Override
    public void izvrsenjeOperacije() throws Exception {
        for (OpstiDomenskiObjekat zaduzivanje : listodo) {
            dbbr.insert(zaduzivanje);
        }
    }
    
}
