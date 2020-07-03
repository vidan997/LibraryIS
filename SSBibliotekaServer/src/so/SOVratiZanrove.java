/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import domain.OpstiDomenskiObjekat;
import domain.Zanr;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vidan
 */
public class SOVratiZanrove extends OpstaSistemskaOperacija{

    @Override
    public void izvrsenjeOperacije() throws Exception {
        List<OpstiDomenskiObjekat> zanrovi = new ArrayList<>();
        ResultSet rs = dbbr.select(new Zanr());
        while (rs.next()) {
            Zanr zanr = new Zanr(rs.getLong("SifraZ"), rs.getString("Tip"));
            zanrovi.add(zanr);
        }
        rs.close();
        listodo = zanrovi;
    }
    
}
