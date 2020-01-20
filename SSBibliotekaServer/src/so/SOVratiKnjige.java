/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import domain.Jezik;
import domain.Knjiga;
import domain.OpstiDomenskiObjekat;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vidan
 */
public class SOVratiKnjige extends OpstaSistemskaOperacija{

    public SOVratiKnjige(OpstiDomenskiObjekat odo) {
        super(odo);
    }

    @Override
    public void izvrsenjeOperacije() throws Exception {
        List<Knjiga> knjige = new ArrayList<>();
        ResultSet rs = dbbr.select(odo);
////////////////////////////555555555555555555
        while (rs.next()) {
            Knjiga klijent = new Knjiga(rs.getLong("SifraK"),rs.getString("Naziv"),rs.getString("Izdavalac"), rs.getDate("DatumIzdavanja"), rs.getString("Sadrzaj"), rs.getInt("BrojStranica"), Jezik.SRPSKI, null, null);
                    knjige.add(klijent);
        }
        rs.close();
ODRADITI!!!!!!!!!!!!!!!!!!!!!!!!!

    }
    
}
