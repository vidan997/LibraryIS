/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import domain.Klijent;
import domain.OpstiDomenskiObjekat;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vidan
 */
public class SOPrijavaNaSistem extends OpstaSistemskaOperacija {

    public SOPrijavaNaSistem(OpstiDomenskiObjekat odo) {
        super(odo);
    }

    @Override
    public void izvrsenjeOperacije() throws Exception {
        List<Klijent> provera = new ArrayList<>();
        ResultSet rs = dbbr.select(odo);

        while (rs.next()) {
            Klijent klijent = new Klijent(rs.getLong("SifraKL"), rs.getInt("JMBG"), rs.getString("Ime"), rs.getString("Prezime"), rs.getDate("DatumRodjenja")
                    , rs.getDate("Clanarina"), rs.getBoolean("IsteklaClanarina"), rs.getInt("Kontakt"), null, rs.getString("Username"), rs.getString("Password"));
            provera.add(klijent);
        }
        rs.close();

        Klijent klijent = (Klijent) odo;

        for (Klijent obj : provera) {
            if (klijent.getUserName().equals(obj.getUserName()) && klijent.getPassword().equals(obj.getPassword())) {
                odo = obj;
                return;
            }
        }

    }

}
