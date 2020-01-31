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
public class SOVratiKnjige extends OpstaSistemskaOperacija {

    public SOVratiKnjige() {
        super();
    }

    @Override
    public void izvrsenjeOperacije() throws Exception {
        List<OpstiDomenskiObjekat> knjige = new ArrayList<>();
        ResultSet rs = dbbr.select(odo);
        while (rs.next()) {
            Knjiga klijent = new Knjiga(rs.getLong("SifraK"), rs.getString("Naziv"), rs.getString("Izdavalac"), rs.getDate("DatumIzdavanja"), rs.getString("Sadrzaj"), rs.getInt("BrojStranica"), Jezik.SRPSKI, null, null);
            knjige.add(klijent);
        }
        rs.close();
        listodo = knjige;
    }

}
