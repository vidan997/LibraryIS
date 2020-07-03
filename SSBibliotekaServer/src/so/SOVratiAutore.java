/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import domain.Autor;
import domain.OpstiDomenskiObjekat;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vidan
 */
public class SOVratiAutore extends OpstaSistemskaOperacija{

    @Override
    public void izvrsenjeOperacije() throws Exception {
       List<OpstiDomenskiObjekat> autori = new ArrayList<>();
        ResultSet rs = dbbr.select(new Autor());
        while (rs.next()) {
            Autor autor = new Autor(rs.getLong("SifraA"), rs.getString("ImePrezime"), rs.getInt("Domaci") == 1);
            autori.add(autor);
        }
        rs.close();
        listodo = autori;
    }
    
}
