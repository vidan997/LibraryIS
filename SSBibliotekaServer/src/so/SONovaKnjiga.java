/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import domain.Knjiga;
import domain.OpstiDomenskiObjekat;

/**
 *
 * @author vidan
 */
public class SONovaKnjiga extends OpstaSistemskaOperacija{

    public SONovaKnjiga(OpstiDomenskiObjekat odo) {
        super(odo);
    }

    @Override
    public void izvrsenjeOperacije() throws Exception {
        Knjiga knjiga = (Knjiga) odo;
        dbbr.insert(knjiga);
    }
    
}
