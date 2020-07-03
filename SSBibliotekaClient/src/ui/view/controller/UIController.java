/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.view.controller;

import communication.CommunicationController;
import domain.Autor;
import domain.Jezik;
import domain.Klijent;
import domain.Knjiga;
import domain.OpstiDomenskiObjekat;
import domain.Zaduzivanje;
import domain.Zanr;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import ui.view.controller.logIn.MainFormLogInController;
import ui.view.logIn.MainFormLogIn;

/**
 *
 * @author Vidan
 */
public class UIController {

    MainFormLogIn main;
    MainFormLogInController mainControll;
    private static UIController instance;

    private UIController() {
        main = new MainFormLogIn();
        mainControll = new MainFormLogInController(main);
    }

    public static UIController getInstance() {
        if (instance == null) {
            instance = new UIController();
        }
        return instance;
    }

    public void pokreni() {
        main.setVisible(true);
    }

    public OpstiDomenskiObjekat logIn(String username, String password, String klijentAdmin) throws Exception {
        Map<String, String> data = new HashMap<>();
        data.put("username", username);
        data.put("password", password);
        data.put("adminKlijent", klijentAdmin);
        return CommunicationController.getInstance().logIn(data);
    }

    public List<Zanr> vratiZanrove() throws Exception {
        return CommunicationController.getInstance().vratiZanrove();
    }

    public List<Autor> vratiAutore() throws Exception {
        return CommunicationController.getInstance().vratiAutore();
    }

    public Knjiga sacuvajKnjigu(String Naziv, String Izdavalac, String DatumIzdavanja, String Sadrzaj, String brStranica, Jezik Jezik, List<Autor> autori, List<Zanr> zanr) throws Exception {
        Map<String, Object> data = new HashMap<>();
        data.put("naziv", Naziv);
        data.put("izdavalac", Izdavalac);
        data.put("DatumIzdavanja", DatumIzdavanja);
        data.put("Sadrzaj", Sadrzaj);
        data.put("BrStranica", brStranica);
        data.put("Jezik", Jezik);
        data.put("Autori", autori);
        data.put("Zanrovi", zanr);
        return CommunicationController.getInstance().sacuvajNovuKnjigu(data);
    }

    public Klijent sacuvajNovogKlijenta(String Ime, String Prezime, String DatumRodjenja, String JMBG, String Kontakt, String UserName, Object Uplacuje) throws IOException, Exception {
        Map<String, String> data = new HashMap<>();
        data.put("ime", Ime);
        data.put("prezime", Prezime);
        data.put("datumR", DatumRodjenja);
        data.put("jmbg", JMBG);
        data.put("kontakt", Kontakt);
        data.put("username", UserName);
        data.put("uplacuje", (String) Uplacuje);
        return CommunicationController.getInstance().sacuvajNovogKlijenta(data);
    }

    public Klijent pretraziKlijenta(String imeUser) throws Exception {
        return CommunicationController.getInstance().pretraziKlijenta(imeUser);
    }

    public List<Zaduzivanje> vratiZaduzenja(Klijent klijent) throws Exception {
        return CommunicationController.getInstance().vratiZaduzenja(klijent);
    }

    public void sacuvajZaduzivanja(List<Zaduzivanje> zaduzanja) throws Exception {
        CommunicationController.getInstance().sacuvajIzmeneZaduzenja(zaduzanja);
    }

    public void produziClanarinu(Klijent klijent) throws Exception {
        CommunicationController.getInstance().izmeniKorisnika(klijent);
    }

}
