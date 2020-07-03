/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validator.impl;

import domain.Autor;
import domain.Jezik;
import domain.Knjiga;
import domain.Zanr;
import exception.ValidationException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;
import validator.Validator;

/**
 *
 * @author Vidan
 */
public class ValidatorKnjiga implements Validator {
    
    @Override
    public Object validate(Map obj) throws ValidationException {
        Map<String, Object> map = obj;
        
        Knjiga knjiga = new Knjiga();
        
        String naziv = (String) map.get("naziv");
        if (naziv.isEmpty()) {
            throw new ValidationException("Morate uneti naziv!");
        }
        knjiga.setNaziv(naziv);
        
        String izdavalac = (String) map.get("izdavalac");
        if (izdavalac.isEmpty()) {
            throw new ValidationException("Morate uneti izdavaoca!");
        }
        knjiga.setIzdavalac(izdavalac);
        try {
            knjiga.setBrojStranica(Integer.parseInt((String) map.get("BrStranica")));
        } catch (NumberFormatException e) {
            throw new ValidationException("Broj stranica mora biti broj!");
        }
        
        try {
            knjiga.setDatumIzdavanja(new SimpleDateFormat("dd.MM.yyyy.").parse((String) map.get("DatumIzdavanja")));
        } catch (ParseException ex) {
            throw new ValidationException("Datum izdavanja morate uneti u dd.MM.yyyy. formatu");
        }
        
        knjiga.setJezik((Jezik) map.get("Jezik"));
        knjiga.setSadrzaj((String) map.get("Sadrzaj"));
        knjiga.setAutor((List<Autor>) map.get("Autori"));
        knjiga.setZanr((List<Zanr>) map.get("Zanrovi"));
        
        return knjiga;
    }
    
}
