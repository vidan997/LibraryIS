/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import domain.OpstiDomenskiObjekat;
import java.util.List;
import so.OpstaSistemskaOperacija;

/**
 *
 * @author vidan
 */
public class SORazduzivanjeKnjige extends OpstaSistemskaOperacija{

    public SORazduzivanjeKnjige(List<OpstiDomenskiObjekat> odo) {
        super(odo);
    }

    @Override
    public void izvrsenjeOperacije() throws Exception {
        for (OpstiDomenskiObjekat odo : listodo) {
            dbbr.update(odo);
        }
    }
    

    
    
}
