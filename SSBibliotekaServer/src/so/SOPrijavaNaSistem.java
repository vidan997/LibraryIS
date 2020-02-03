/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import domain.Administrator;
import domain.Klijent;
import domain.OpstiDomenskiObjekat;
import exception.LogInException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vidan
 */
public class SOPrijavaNaSistem extends OpstaSistemskaOperacija {

    public SOPrijavaNaSistem(OpstiDomenskiObjekat odo) {
        super(odo);
    }

    @Override
    public void izvrsenjeOperacije() throws LogInException {
        try {
            List<Klijent> provera = new ArrayList<>();
            
            Klijent klijent = (Klijent) odo;
            ResultSet rs = dbbr.select(odo);
            
            while (rs.next()) {
                Klijent klijentadd = new Klijent(rs.getLong("SifraKL"), rs.getInt("JMBG"), rs.getString("Ime"), rs.getString("Prezime"), rs.getDate("DatumRodjenja")
                        , rs.getDate("Clanarina"), rs.getBoolean("IsteklaClanarina"), rs.getInt("Kontakt"), null, rs.getString("Username"), rs.getString("Password"));
                provera.add(klijentadd);
            }
            rs.close();
            
            for (Klijent obj : provera) {
                if (klijent.getUserName().equals(obj.getUserName()) && klijent.getPassword().equals(obj.getPassword())) {
                    odo = obj;
                    return;
                }
            }
            Administrator administrator = new Administrator();
            rs = dbbr.select(administrator);
            List<Administrator> proveraA = new ArrayList<>();
            while (rs.next()) {
                Administrator administratoradd = new Administrator(rs.getLong("SifraA"), rs.getInt("JMBG"),rs.getString("Ime"), rs.getString("Prezime"), rs.getDate("DatumRodjenja"), rs.getDate("DatumZaposlenja"), rs.getString("Username"), rs.getString("Password"));
                proveraA.add(administratoradd);
            }
            rs.close();
            
            for (Administrator obj : proveraA) {
                if (klijent.getUserName().equals(obj.getUserName()) && klijent.getPassword().equals(obj.getPassword())) {
                    odo = obj;
                    return;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new LogInException("Konekcija sa bazom nije uspostavljena.");
        }
        throw new LogInException("Losa sifra ili username.");
    }    
}
