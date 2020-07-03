/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.view.controller.administrator;

import domain.Administrator;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.IOException;
import ui.view.administrator.MainFrameA;
import ui.view.administrator.PanelKlijent;
import ui.view.administrator.PanelKnjige;
import ui.view.administrator.PanelNovKlijent;
import ui.view.administrator.PanelNovaKnjiga;

/**
 *
 * @author Vidan
 */
public class MainFrameAController {

    MainFrameA main;
    PanelKlijent panelKlijent;
    PanelKnjige panelKnjige;
    PanelNovKlijent panelNovKlijent;
    PanelNovaKnjiga panelNovaKnjiga;
    Administrator administrator;

    public MainFrameAController(MainFrameA main, Administrator administrator) throws IOException {
        this.main = main;
        panelKlijent = new PanelKlijent();
        panelKnjige = new PanelKnjige();
        panelNovKlijent = new PanelNovKlijent();
        panelNovaKnjiga = new PanelNovaKnjiga();
        this.administrator = administrator;
        inicializujPanele();
        main.add(panelKlijent, BorderLayout.CENTER);
        main.setPreferredSize(new Dimension(840, 750));
        postaviPokazivaceMainFrame();
        main.setVisible(true);
    }

    private void postaviPokazivaceMainFrame() {

        main.getBtnSwichKnjige().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main.add(panelKnjige, BorderLayout.CENTER);
                panelKlijent.setVisible(false);
                panelNovKlijent.setVisible(false);
                panelNovaKnjiga.setVisible(false);
                panelKnjige.setVisible(true);
            }
        });

        main.getBtnSwichNovaKnjiga().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main.add(panelNovaKnjiga, BorderLayout.CENTER);
                panelKlijent.setVisible(false);
                panelNovKlijent.setVisible(false);
                panelKnjige.setVisible(false);
                panelNovaKnjiga.setVisible(true);
            }
        });

        main.getBtnSwitchKlijenti().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main.add(panelKlijent, BorderLayout.CENTER);
                panelKnjige.setVisible(false);
                panelNovKlijent.setVisible(false);
                panelNovaKnjiga.setVisible(false);
                panelKlijent.setVisible(true);
            }
        });

        main.getBtnSwitchNoviKlijent().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main.add(panelNovKlijent, BorderLayout.CENTER);
                panelKlijent.setVisible(false);
                panelNovaKnjiga.setVisible(false);
                panelKnjige.setVisible(false);
                panelNovKlijent.setVisible(true);
            }
        });

        main.getBtnExit().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.exit(1);
            }
        });

    }

    private void inicializujPanele() {
        new PanelNovaKnjigaController(panelNovaKnjiga,administrator);
        new PanelNovKlijentController(panelNovKlijent,administrator);
        new PanelPrikazKlijentaController(panelKlijent,administrator);
    }

}
