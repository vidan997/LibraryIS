/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validator.impl;

import domain.Klijent;
import exception.ValidationException;
import validator.Validator;

/**
 *
 * @author vidan
 */
public class ValidatorKlijent implements Validator{

    @Override
    public void validate(Object value) throws ValidationException {
        Klijent klijent = (Klijent) value;
        if(klijent.getIme().isEmpty()){
            throw new ValidationException("Morate uneti ime.");
        }
        if(klijent.getPrezime().isEmpty()){
            throw new ValidationException("Morate uneti prezime.");
        }
        if(klijent.getUserName().isEmpty()){
            throw new ValidationException("Morate uneti username.");
        }
    }
    
}
