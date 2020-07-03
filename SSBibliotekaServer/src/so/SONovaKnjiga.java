/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import domain.Autor;
import domain.Knjiga;
import domain.OpstiDomenskiObjekat;
import domain.Zanr;
import java.util.Map;
import validator.Validator;
/**
 *
 * @author vidan
 */
public class SONovaKnjiga extends OpstaSistemskaOperacija{

    public SONovaKnjiga(Map knjiga, Validator validator) {
        super(knjiga, validator);
    }

    @Override
    public void izvrsenjeOperacije() throws Exception {
        Knjiga knjiga = (Knjiga) odo;
        dbbr.insert(knjiga);
        for (Autor autor : knjiga.getAutor()) {
            dbbr.insertAsoc(knjiga,autor);
        }
        for (Zanr zanr : knjiga.getZanr()) {
            dbbr.insertAsoc(knjiga,zanr);
        }
    }
    
}
