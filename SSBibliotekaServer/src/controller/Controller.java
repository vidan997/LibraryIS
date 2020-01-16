/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domain.Klijent;
import java.util.logging.Level;
import java.util.logging.Logger;
import so.OpstaSistemskaOperacija;
import so.SOPrijavaNaSistem;

/**
 *
 * @author vidan
 */
public class Controller {

    private static Controller instance;

    private Controller() {
    }

    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }

    public Klijent logIn(String username, String password) throws Exception {
        Klijent KL = new Klijent();
        KL.setUserName(username);
        KL.setPassword(password);
        OpstaSistemskaOperacija oso = new SOPrijavaNaSistem(KL);
        oso.opsteIzvrsenje();
        return (Klijent) oso.getOdo();
    }
}
