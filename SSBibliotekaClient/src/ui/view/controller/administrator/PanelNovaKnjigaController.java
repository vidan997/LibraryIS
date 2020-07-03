/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.view.controller.administrator;

import domain.Administrator;
import domain.Autor;
import domain.Jezik;
import domain.Knjiga;
import domain.Zanr;
import exception.ValidationException;
import java.awt.MenuComponent;
import static java.awt.image.ImageObserver.WIDTH;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ui.view.administrator.PanelNovaKnjiga;
import ui.view.components.TableAutor;
import ui.view.components.TableZanr;
import ui.view.controller.UIController;

/**
 *
 * @author Vidan
 */
public class PanelNovaKnjigaController {

    PanelNovaKnjiga panelNovaKnjiga;
    TableZanr tableZanr;
    TableAutor tableAutor;
    Administrator administrator;

    public PanelNovaKnjigaController(PanelNovaKnjiga panelNovaKnjiga, Administrator administrator) {
        this.panelNovaKnjiga = panelNovaKnjiga;
        this.administrator = administrator;
        try {
            podesiDefault();
            panelNovaKnjiga.getCmbJezik().addItem(Jezik.ENGLESKI);
            panelNovaKnjiga.getCmbJezik().addItem(Jezik.FRANCUSKI);
            panelNovaKnjiga.getCmbJezik().addItem(Jezik.NEMACKI);
            panelNovaKnjiga.getCmbJezik().addItem(Jezik.SPANSKI);
            panelNovaKnjiga.getCmbJezik().addItem(Jezik.SRPSKI);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(panelNovaKnjiga, ex.getMessage(), "Greska!", WIDTH);
        }
        postaviPokazivace();
    }

    private void postaviPokazivace() {

        panelNovaKnjiga.getBtnAutor().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajAutora();
            }
        });

        panelNovaKnjiga.getBtnZanr().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajZanr();
            }
        });

        panelNovaKnjiga.getBtnSacuvaj().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sacuvajKnjigu();
            }
        });
    }

    private void dodajAutora() {
        tableAutor.add((Autor) panelNovaKnjiga.getCmbAutor().getSelectedItem());
        panelNovaKnjiga.getCmbAutor().removeItem(panelNovaKnjiga.getCmbAutor().getSelectedItem());
    }

    private void dodajZanr() {

        tableZanr.add((Zanr) panelNovaKnjiga.getCmbZanr().getSelectedItem());
        panelNovaKnjiga.getCmbZanr().removeItem(panelNovaKnjiga.getCmbZanr().getSelectedItem());
    }

    private void sacuvajKnjigu() {
        try {
            Knjiga knjiga = UIController.getInstance().sacuvajKnjigu(panelNovaKnjiga.getTxtNaziv().getText(), panelNovaKnjiga.getTxtIzdavalac().getText(), panelNovaKnjiga.getTxtDatumIzdavanja().getText(), panelNovaKnjiga.getTxtSadrzaj().getText(), panelNovaKnjiga.getTxtBrStranica().getText(), (Jezik) panelNovaKnjiga.getCmbJezik().getSelectedItem(), tableAutor.getAutori(), tableZanr.getZanr());
            JOptionPane.showMessageDialog(panelNovaKnjiga, "Sacuvana je nova knjiga sa ID: " + knjiga.getSifraK(), "Uspesno!", WIDTH);

            podesiDefault();

        } catch (ValidationException ex) {
            JOptionPane.showMessageDialog(panelNovaKnjiga, ex.getMessage(), "Greska!", WIDTH);

        } catch (Exception ex) {
            Logger.getLogger(PanelNovaKnjigaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void podesiDefault() throws Exception {
        panelNovaKnjiga.getTxtNaziv().setText("");
        panelNovaKnjiga.getTxtBrStranica().setText("");
        panelNovaKnjiga.getTxtDatumIzdavanja().setText("");
        panelNovaKnjiga.getTxtIzdavalac().setText("");
        panelNovaKnjiga.getTxtSadrzaj().setText("");

        panelNovaKnjiga.getCmbAutor().removeAllItems();
        panelNovaKnjiga.getCmbZanr().removeAllItems();
        List<Zanr> zanrovi = UIController.getInstance().vratiZanrove();
        tableZanr = new TableZanr();
        panelNovaKnjiga.getTblZanr().setModel(tableZanr);
        for (Zanr zanr : zanrovi) {
            panelNovaKnjiga.getCmbZanr().addItem(zanr);
        }
        List<Autor> autori = UIController.getInstance().vratiAutore();
        tableAutor = new TableAutor();
        panelNovaKnjiga.getTblAutor().setModel(tableAutor);
        for (Autor autor : autori) {
            panelNovaKnjiga.getCmbAutor().addItem(autor);
        }
    }

}
