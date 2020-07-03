/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validator.impl;

import domain.Klijent;
import exception.ValidationException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import validator.Validator;

/**
 *
 * @author vidan
 */
public class ValidatorKlijent implements Validator {

    @Override
    public Object validate(Map obj) throws ValidationException {
        Map<String, String> map = obj;

        Klijent klijent = new Klijent();
        String ime = map.get("ime");
        if (ime.isEmpty()) {
            throw new ValidationException("Morate uneti ime!");
        }
        klijent.setIme(ime);

        String prezime = map.get("prezime");
        if (prezime.isEmpty()) {
            throw new ValidationException("Morate uneti prezime");
        }
        klijent.setPrezime(prezime);

        try {
            klijent.setJMBG(Integer.parseInt(map.get("jmbg")));
            klijent.setKontakt(Integer.parseInt(map.get("kontakt")));
        } catch (NumberFormatException e) {
            throw new ValidationException("JMBG i kontakt moraju biti brojevi!");
        }

        klijent.setUserName(map.get("username"));

        try {
            klijent.setDatumRodjenja(new SimpleDateFormat("dd.MM.yyyy.").parse(map.get("datumR")));
        } catch (ParseException ex) {
            throw new ValidationException("Datum rodjenja morate uneti u dd.MM.yyyy. formatu");
        }

        Date datum = new Date();
        Calendar myCal = Calendar.getInstance();
        myCal.setTime(datum);
        if (map.get("uplacuje").equals("3 meseca")) {
            myCal.add(Calendar.MONTH, +3);
        } else if (map.get("uplacuje").equals("6 meseci")) {
            myCal.add(Calendar.MONTH, +6);
        } else if (map.get("uplacuje").equals("Godinu dana")) {
            myCal.add(Calendar.MONTH, +12);
        }
        datum = myCal.getTime();
        klijent.setClanarina(datum);
        klijent.setIsteklaClanarina(false);
        klijent.setPassword("123");
        return klijent;
    }
}
