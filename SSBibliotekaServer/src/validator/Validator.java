/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validator;

import exception.ValidationException;

/**
 *
 * @author student1
 */
public interface Validator {
    public void validate(Object value) throws ValidationException;
}
