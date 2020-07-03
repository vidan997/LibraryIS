/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import domain.Klijent;
import domain.Knjiga;
import domain.OpstiDomenskiObjekat;
import domain.PrimerakKnjige;
import domain.Zaduzivanje;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vidan
 */
public class SOVratiZaduzenja extends OpstaSistemskaOperacija {

    public SOVratiZaduzenja(Klijent klijent) {
        super(klijent);
    }

    @Override
    public void izvrsenjeOperacije() throws Exception {
        List<OpstiDomenskiObjekat> zaduzenja = new ArrayList<>();
        ResultSet rs = dbbr.selectJoin(new Zaduzivanje(), odo.dajVrednostiKljuca());
        while (rs.next()) {
            Zaduzivanje zaduzivanje = new Zaduzivanje();
            zaduzivanje.setKlijent((Klijent) odo);

            Knjiga k = new Knjiga();
            k.setSifraK(rs.getLong("SifraKnjige"));
            k.setNaziv(rs.getString("Naziv"));

            PrimerakKnjige pk = new PrimerakKnjige(k, rs.getInt("InvrtacioniBroj"), rs.getInt("Zaduzena") == 1);

            zaduzivanje.setKnjiga(pk);
            zaduzivanje.setDatumRazduzivanja(rs.getDate("DatumZaduzivanja"));
            zaduzivanje.setDoDatuma(rs.getDate("DoDatuma"));
            zaduzivanje.setDatumRazduzivanja(rs.getDate("DatumRazduzivanja"));
            zaduzivanje.setPrekoracen(rs.getInt("Prekoracen") == 1);
            zaduzivanje.setOdobreno(rs.getInt("Odobreno") == 1);

            zaduzenja.add(zaduzivanje);
        }
        rs.close();
        listodo = zaduzenja;
    }

}
