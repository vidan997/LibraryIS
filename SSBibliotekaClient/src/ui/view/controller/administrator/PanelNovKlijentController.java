/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.view.controller.administrator;

import communication.CommunicationController;
import domain.Administrator;
import domain.Klijent;
import exception.ValidationException;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ui.view.administrator.PanelNovKlijent;
import ui.view.controller.UIController;

/**
 *
 * @author Vidan
 */
public class PanelNovKlijentController {

    PanelNovKlijent panelNovKlijent;
    Administrator administrator;

    public PanelNovKlijentController(PanelNovKlijent panelNovKlijent, Administrator administrator) {
        this.panelNovKlijent = panelNovKlijent;
        this.administrator = administrator;
        this.panelNovKlijent.getCmbUplacuje().addItem("3 meseca");
        this.panelNovKlijent.getCmbUplacuje().addItem("6 meseci");
        this.panelNovKlijent.getCmbUplacuje().addItem("Godinu dana");
        postaviPokazivace();
    }

    private void postaviPokazivace() {
        panelNovKlijent.getBtnSacuvaj().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zapamtiKlijenta();
            }
        });
    }

    private void zapamtiKlijenta() {
        try {
            Klijent klijent = UIController.getInstance().sacuvajNovogKlijenta(panelNovKlijent.getTxtIme().getText(), panelNovKlijent.getTxtPrezime().getText(), panelNovKlijent.getTxtDatR().getText(), panelNovKlijent.getTxtJMBG().getText(),
                    panelNovKlijent.getTxtKontakt().getText(), panelNovKlijent.getTxtUsername().getText(), panelNovKlijent.getCmbUplacuje().getSelectedItem());

            JOptionPane.showMessageDialog(panelNovKlijent, "Sacuvan je korisnik sa ID: " + klijent.getSifraKL(), "Uspesno!", WIDTH);

            panelNovKlijent.getTxtIme().setText("");
            panelNovKlijent.getTxtPrezime().setText("");
            panelNovKlijent.getTxtDatR().setText("");
            panelNovKlijent.getTxtKontakt().setText("");
            panelNovKlijent.getTxtJMBG().setText("");
            panelNovKlijent.getTxtUsername().setText("");

        } catch (ValidationException ex) {
            JOptionPane.showMessageDialog(panelNovKlijent, ex.getMessage(), "Greska!", WIDTH);
        } catch (IOException ex) {
            Logger.getLogger(PanelNovKlijent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(PanelNovKlijent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
