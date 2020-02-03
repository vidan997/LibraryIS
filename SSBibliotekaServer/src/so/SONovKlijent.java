/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import domain.Klijent;
import domain.OpstiDomenskiObjekat;
import validator.Validator;

/**
 *
 * @author vidan
 */
public class SONovKlijent extends OpstaSistemskaOperacija{

    public SONovKlijent(OpstiDomenskiObjekat odo, Validator validator) {
        super(odo);
        this.validator = validator;
    }

    @Override
    public void izvrsenjeOperacije() throws Exception {
        Klijent klijent = (Klijent) odo;
        dbbr.insert(klijent);
    }
    
}
